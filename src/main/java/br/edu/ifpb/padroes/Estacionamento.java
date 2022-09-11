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

    protected LocalDateTime entrada;
    protected LocalDateTime saida;
    private ArrayList<Veiculo> veiculos;
    

    public Estacionamento(LocalDateTime entrada, LocalDateTime saida, ArrayList<Veiculo> veiculos) {
		this.entrada = entrada;
		this.saida = saida;
		this.veiculos = veiculos;
	}



	public abstract BigDecimal obterTotalAPagar();

}
