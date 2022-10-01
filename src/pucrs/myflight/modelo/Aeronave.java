package pucrs.myflight.modelo;

public class Aeronave implements Imprimivel, Contavel, Comparable<Aeronave>{
	private static int totalAeronaves = 0;
	private String codigo;
	private String descricao;
	private int capacidade;
	
	public Aeronave(String codigo, String descricao, int capacidade) {
		totalAeronaves++;
		this.codigo = codigo;
		this.descricao = descricao;
		this.capacidade = capacidade;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public int getCapacidade() {
		return capacidade;
	}

	@Override
	public void imprimir() {
		System.out.print(codigo + " - " + descricao);
	}

	@Override
	public int getQtdObjCriados() {
		return totalAeronaves;
	}

	@Override
	public int compareTo(Aeronave outra) {
		return descricao.compareTo(outra.descricao);
	}
}
