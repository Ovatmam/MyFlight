package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorRotas {

    private ArrayList<Rota> rotas;

    public GerenciadorRotas() {
        rotas = new ArrayList<>();
    }

    public void adicionar(Rota r1) {
        rotas.add(r1);
    }

    public void listarTodas() {
        Rota r1;
        for(int i = 0; i < rotas.size(); i++) {
            r1 = rotas.get(i);
            System.out.println(r1.toString());
        }
    }

    public Rota buscarPorOrigem(Aeroporto origem) {
        Rota r1;
        for(int i = 0; i < rotas.size(); i++) {
            r1 = rotas.get(i);
            if(r1.getOrigem().equals(origem))
                return r1;
        }
        return null;
    }

    public Rota buscarPorDestino(Aeroporto destino) {
        Rota r1;
        for(int i = 0; i < rotas.size(); i++) {
            r1 = rotas.get(i);
            if(r1.getDestino().equals(destino))
                return r1;
        }
        return null;
    }
}
