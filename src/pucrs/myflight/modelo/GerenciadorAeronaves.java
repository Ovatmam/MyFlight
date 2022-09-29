package pucrs.myflight.modelo;
import java.util.ArrayList;

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

	public Aeronave buscarPorCodigo(String codigo) {
        Aeronave a1;
        for(int i = 0; i < aeronaves.size(); i++) {
            a1 = aeronaves.get(i);
            if(a1.getCodigo().equals(codigo))
                return a1;
        }
        return null;
	}

	public int size() {
		return aeronaves.size();
	}

    public void listarTodas() {
        Aeronave a1;
        for(int i = 0; i < aeronaves.size(); i++) {
            a1 = aeronaves.get(i);
            System.out.println(a1.toString());
        }
    }
}
