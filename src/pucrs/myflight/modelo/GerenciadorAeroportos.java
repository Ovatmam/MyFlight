package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeroportos {

    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos() {
        aeroportos = new ArrayList<>();
    }

    public void adicionar(Aeroporto a1) {
        aeroportos.add(a1);
    }

    public Aeroporto buscarPorCodigo(String codigo) {
        Aeroporto ap1;
		for(int i = 0; i < aeroportos.size(); i++) {
			ap1 = aeroportos.get(i);
			if(ap1.getCodigo().equals(codigo))
				return ap1;
		}
		return null;
    }

    public void listarTodos() {
        Aeroporto a1;
        for(int i = 0; i < aeroportos.size(); i++) {
            a1 = aeroportos.get(i);
            System.out.println(a1.toString());
        }
    }
}
