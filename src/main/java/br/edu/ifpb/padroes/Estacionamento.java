package br.edu.ifpb.padroes;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.padroes.Veiculo;
@Getter
@Setter
public abstract class Estacionamento {
    private ArrayList<Veiculo> veiculos;
    

    public Estacionamento(ArrayList<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

    

	public abstract BigDecimal obterTotalAPagar(Veiculo v);

}
