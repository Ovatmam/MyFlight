package pucrs.myflight.modelo;

public class Rota implements Comparable<Rota> {
	private CiaAerea cia;
	private Aeroporto origem;
	private Aeroporto destino;
	private Aeronave aeronave;
	
	public Rota(CiaAerea cia, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
		this.cia = cia;
		this.origem = origem;
		this.destino = destino;
		this.aeronave = aeronave;		
	}

	public void setCia(CiaAerea c1) {
		cia = c1;
	}

	public CiaAerea getCia() {
		return cia;
	}

	public void setDestino(Aeroporto ap1) {
		destino = ap1;
	}
	
	public Aeroporto getDestino() {
		return destino;
	}
	
	public void setOrigem(Aeroporto ap1) {
		origem = ap1;
	}

	public Aeroporto getOrigem() {
		return origem;
	}

	public void setAeronave(Aeronave a1) {
		aeronave = a1;
	}
	
	public Aeronave getAeronave() {
		return aeronave;
	}

	@Override
	public String toString() {
		return cia.toString() +  "\t " + origem.toString() + "\t -> \t" + destino.toString();

	}

	@Override
	public int compareTo(Rota outra) {
		return cia.getNome().compareTo(outra.cia.getNome());
	}
}
