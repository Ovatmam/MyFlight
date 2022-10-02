package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends Voo
{
    private ArrayList<Rota> rotas;

    // Construtor
    public VooVariasEscalas(Rota rotaInicial, int qtdRotas, LocalDateTime datahora, Duration duracao) {
        super(rotaInicial, datahora, duracao);
        rotas = new ArrayList<>(qtdRotas);
        rotas.add(rotaInicial);
    }

    public void adicionarRota(Rota r1) {
        rotas.add(r1);
    }

    public Rota getRotaFinal() { 
        return rotas.get(rotas.size()-1); 
    }

    @Override
    public String toString() {
        String str = super.toString();
        for (int i = 1; i < rotas.size(); i++) {
            str += " \n " + rotas.get(i);
        }
        return str;
    }
}