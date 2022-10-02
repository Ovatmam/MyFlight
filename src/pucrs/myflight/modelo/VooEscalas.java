package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo
{
    private ArrayList<Rota> rotas;
    private Duration duracao;

    // Construtor
    public VooEscalas(Rota rotaInicial, LocalDateTime datahora) {
        super(datahora);
        rotas = new ArrayList<>();
        rotas.add(rotaInicial);
    }

    public void adicionaRota(Rota r1) {
        rotas.add(r1);
        calcDuracao();
    }

    private void calcDuracao() {
        duracao = Duration.ofHours(0);
        for(Rota rota: rotas) {
            Double d = rota.getOrigem().getLocal().distancia(rota.getDestino().getLocal());
            d = d/805.0;
            long l = (new Double(d)).longValue();
            duracao = duracao.plusHours(l);
		    duracao = duracao.plusMinutes(30);
        }
	}

    public Duration getDuracao() {
        return duracao;
    }

    public Rota getRota() {
        return rotas.get(0);
    }

    public ArrayList<Rota> getRotas() { 
        return rotas; 
    }

    @Override
    public String toString() {
        String str = super.toString();
        for (int i = 1; i < rotas.size(); i++) {
            str += " \n " + rotas.get(i).toString();
        }
        return str;
    }
}