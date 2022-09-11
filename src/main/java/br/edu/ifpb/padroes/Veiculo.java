package br.edu.ifpb.padroes;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Veiculo {
	
	protected LocalDateTime entrada;
    protected LocalDateTime saida;
    private String placa;
    private String modelo;
    private String cor;
    
    
    
    public Veiculo(LocalDateTime entrada, LocalDateTime saida, String placa, String modelo, String cor) {
		this.entrada = entrada;
		this.saida = saida;
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
	}

	public Long intervaloHoras() {
    assert(this.entrada != null && this.saida != null);
    Long periodoHoras = Duration.between(entrada, saida).toHours();
    return periodoHoras;
    }
    
    public Long intervaloDias() {
        assert(this.entrada != null && this.saida != null);
        Long periodoDias = Duration.between(entrada, saida).toDays();
        return periodoDias;
        }
    
    public Long intervaloMes() {
    	Long months = Duration.between(entrada,saida).toDays() / 30;
    	return months;
    }
    
}
