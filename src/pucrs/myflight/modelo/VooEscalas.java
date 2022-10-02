package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo
{
    private Rota rotaFinal;

    // Construtor
    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao) {
        super(rota, datahora, duracao);
        this.rotaFinal = rotaFinal;
    }

    public Rota getRotaFinal() { 
        return rotaFinal; 
    }

    @Override
    public String toString() {
       return super.toString() + "\n" + super.getStatus() + "\t" + super.getDatahora().toString() + "\t" + rotaFinal.toString();
    }
}