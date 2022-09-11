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

	public EstacionamentoPorHora(ArrayList<Veiculo> veiculos) {
		super(veiculos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal obterTotalAPagar(Veiculo v) {
        BigDecimal valor = new BigDecimal(0);
        valor = VALOR_HORA.multiply(new BigDecimal(v.intervaloHoras()));
        return valor;
	}
	
}
