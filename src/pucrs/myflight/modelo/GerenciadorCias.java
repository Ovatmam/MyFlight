package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea cia) {
		empresas.add(cia);
	}

	public void remove(int index) {
		empresas.remove(index);
	}

	public CiaAerea buscarCodigo(String codigo) {
		CiaAerea c1;
		for(int i = 0; i < empresas.size(); i++) {
			c1 = empresas.get(i);
			if(c1.getCodigo().equals(codigo))
				return c1;
		}
		return null;
	}

	public CiaAerea buscarNome(String nome) {
		CiaAerea c1;
		for(int i = 0; i < empresas.size(); i++) {
			c1 = empresas.get(i);
			if(c1.getNome().equals(nome))
				return c1;
		}
		return null;
	}

	public void listarTodos() {
        CiaAerea c1;
        for(int i = 0; i < empresas.size(); i++) {
            c1 = empresas.get(i);
            System.out.println(c1.toString());
        }
    }
}
