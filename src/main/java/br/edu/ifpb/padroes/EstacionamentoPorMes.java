package br.edu.ifpb.padroes;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstacionamentoPorMes extends Estacionamento {
	
	private static BigDecimal VALOR_MES = new BigDecimal("300.00");

	public EstacionamentoPorMes(LocalDateTime entrada, LocalDateTime saida, ArrayList<Veiculo> veiculos) {
		super(veiculos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal obterTotalAPagar(Veiculo v) {
        BigDecimal valor = VALOR_MES.multiply(new BigDecimal(v.intervaloMes()));
        return valor;
	}
	
}
