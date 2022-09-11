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

	public EstacionamentoPorDia(ArrayList<Veiculo> veiculos) {
		super(veiculos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal obterTotalAPagar(Veiculo v) {
        BigDecimal valor = new BigDecimal(0);
        valor = VALOR_DIA.multiply(new BigDecimal(v.intervaloDias()));
        return valor;
	}
	
}
