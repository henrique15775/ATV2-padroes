package br.edu.ifpb.padroes;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstacionamentoPorDia extends Estacionamento {
	
	private static BigDecimal VALOR_DIA = new BigDecimal("26.00");

	public EstacionamentoPorDia(LocalDateTime entrada, LocalDateTime saida, ArrayList<Veiculo> veiculos) {
		super(entrada,saida,veiculos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal obterTotalAPagar() {
		assert(this.entrada != null && saida != null);
        BigDecimal valor = new BigDecimal(0);
        Long periodoDays = Duration.between(entrada, saida).toDays();
        valor = VALOR_DIA.multiply(new BigDecimal(periodoDays));
        return valor;
	}
	
}
