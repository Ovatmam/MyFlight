package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class GerenciadorVoos {

    private ArrayList<Voo> voos;

    public GerenciadorVoos() {
        voos = new ArrayList<>();
    }


    public Voo buscarData(LocalDateTime datahora) {
        Voo v1;
		for(int i = 0; i < voos.size(); i++) {
			v1 = voos.get(i);
			if(v1.getDatahora().equals(datahora))
				return v1;
		}
		return null;
    }

    public void listarTodos() {
        Voo v1;
        for(int i = 0; i < voos.size(); i++) {
            v1 = voos.get(i);
            System.out.println(v1.toString());
        }
    }

    public void adicionar(Voo v1) {
        voos.add(v1);
    }
}

