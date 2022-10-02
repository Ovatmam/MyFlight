package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Voo {
	
	public enum Status{CONFIRMADO, ATRASADO, CANCELADO};
	
	private LocalDateTime datahora;
	private Status status;
	
	public Voo(LocalDateTime datahora) {
		this.datahora = datahora;
		this.status = Status.CONFIRMADO; // default é confirmado
	}

	public Voo() {
		this.datahora = LocalDateTime.of(2016, 8, 12, 12, 0, 0);
		this.status = Status.CONFIRMADO; // default é confirmado
	}

	public LocalDateTime getDatahora() {
		return datahora;
	}
	
    public abstract Rota getRota();
	public abstract Duration getDuracao();
	
	public void setStatus(Status novo) {
		this.status = novo;
	}

	public Status getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return status + " " + datahora;
	}
}
