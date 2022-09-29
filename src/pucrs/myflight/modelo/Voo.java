package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class Voo {
	
	public enum Status{CONFIRMADO, ATRASADO, CANCELADO};
	
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	
	public Voo(Rota rota, LocalDateTime datahora, Duration duracao) {
		this.rota = rota;
		this.datahora = datahora;
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; // default é confirmado
	}
	
	public void setRota(Rota r1) {
		rota = r1;
	}

	public Rota getRota() {
		return rota;
	}

	public void setDataHora(LocalDateTime datahora) {
		this.datahora = datahora;
	}
	
	public LocalDateTime getDatahora() {
		return datahora;
	}

	public void setDuracao(Duration duracao) {
		this.duracao = duracao;
	}
	
	public Duration getDuracao() {
		return duracao;
	}
	
	public void setStatus(Status novo) {
		this.status = novo;
	}

	public Status getStatus() {
		return status;
	}

	@Override
	public String toString() {
		String str = "Voo: " + datahora.toString() + duracao.toString() + rota.toString() + status;

		return str;
	}
}
