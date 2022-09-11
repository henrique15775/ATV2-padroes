package br.edu.ifpb.padroes;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstacionamentoPorHora extends Estacionamento {
	
	private static BigDecimal VALOR_HORA = new BigDecimal("2.00");

	public EstacionamentoPorHora(LocalDateTime entrada, LocalDateTime saida, ArrayList<Veiculo> veiculos) {
		super(entrada,saida,veiculos);
		// TODO Auto-generated constructor stub
	}



	@Override
	public BigDecimal obterTotalAPagar() {
		assert(this.entrada != null && saida != null);
        BigDecimal valor = new BigDecimal(0);
        Long periodoHoras = Duration.between(entrada, saida).toHours();
        valor = VALOR_HORA.multiply(new BigDecimal(periodoHoras));
        

        return valor;
	}
	
}
