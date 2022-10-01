package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;
	
	public GerenciadorAeronaves() {
		aeronaves = new ArrayList<>();
	}

	public void adicionar(Aeronave aviao) {
		aeronaves.add(aviao);
	}

	public void remover(int index) {
		aeronaves.remove(index);
	}

    public void ordenaDescricao() {
        Collections.sort(aeronaves);
    }

    public int size() {
		return aeronaves.size();
	}

	public Aeronave buscarPorCodigo(String codigo) {
        Aeronave a1;
        for(int i = 0; i < aeronaves.size(); i++) {
            a1 = aeronaves.get(i);
            if(a1.getCodigo().equals(codigo))
                return a1;
        }
        return null;
	}

    public void listarTodas() {
        Aeronave a1;
        for(int i = 0; i < aeronaves.size(); i++) {
            a1 = aeronaves.get(i);
            System.out.println(a1.toString());
        }
    }
}
