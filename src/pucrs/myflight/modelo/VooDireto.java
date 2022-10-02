package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooDireto extends Voo {
	
	public enum Status{CONFIRMADO, ATRASADO, CANCELADO};
	
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	
	public VooDireto(Rota rota, LocalDateTime datahora) {
		this.rota = rota;
		this.datahora = datahora;
		this.status = Status.CONFIRMADO;
		duracao = Duration.ofHours(0);
		calcDuracao();
	}

	private void calcDuracao() {
		Double d = rota.getOrigem().getLocal().distancia(rota.getDestino().getLocal());
		d = d/805.0;
		long l = (new Double(d)).longValue();
		duracao = duracao.plusHours(l);
		duracao = duracao.plusMinutes(30);
	}

	public VooDireto(Rota rota) {
		this.rota = rota;
		this.datahora = LocalDateTime.of(2016, 8, 12, 12, 0, 0);
		this.status = Status.CONFIRMADO;
	}

	public Rota getRota() {
		return rota;
	}
	
	public LocalDateTime getDatahora() {
		return datahora;
	}
	
	public Duration getDuracao() {
		return duracao;
	}

	@Override
	public String toString() {
		return " " +status + "\t" + datahora.toString() + "\t" + rota.toString();
	}
}
