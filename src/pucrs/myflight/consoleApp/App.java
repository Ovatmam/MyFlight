//Eduardo Enes Traunig

package pucrs.myflight.consoleApp;

import javax.swing.GroupLayout;

import java.time.Duration;
import java.time.LocalDateTime;

import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.Geo;
import pucrs.myflight.modelo.GerenciadorAeronaves;
import pucrs.myflight.modelo.GerenciadorAeroportos;
import pucrs.myflight.modelo.GerenciadorCias;
import pucrs.myflight.modelo.GerenciadorRotas;
import pucrs.myflight.modelo.GerenciadorVoos;
import pucrs.myflight.modelo.Rota;
import pucrs.myflight.modelo.Voo;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");

		LocalDateTime datahora = LocalDateTime.of(2022, 01, 01, 18, 30);
		Duration duracao = Duration.ofMinutes(120);

		GerenciadorAeronaves avioes = new GerenciadorAeronaves();
		GerenciadorAeroportos aeroportos = new GerenciadorAeroportos();
		GerenciadorCias empresas = new GerenciadorCias();
		GerenciadorRotas rotas = new GerenciadorRotas();
		GerenciadorVoos voos = new GerenciadorVoos();

		CiaAerea c1 = new CiaAerea("JJ", "LATAM Linhas Aéreas");
		empresas.adicionar(c1);
		CiaAerea c2 = new CiaAerea("G3", "Gol Linhas Aéreas SA");
		empresas.adicionar(c2);

		Aeronave a1 = new Aeronave("733", "Boeing 737-300", 140);
		avioes.adicionar(a1);
		Aeronave a2 = new Aeronave("73G", "Boeing 737-700", 126);
		avioes.adicionar(a2);

		Aeroporto ap1 = new Aeroporto("POA", "Salgado Filho Intl Apt", new Geo(-29.9939, -51.1711));
		aeroportos.adicionar(ap1);
		Aeroporto ap2 = new Aeroporto("GRU", "São Paulo Guarulhos Intl Ap", new Geo(-23.4356, -46.4731));
		aeroportos.adicionar(ap2);

		Rota r1 = new Rota(c1, ap1, ap2, a1);
		rotas.adicionar(r1);
		Rota r2 = new Rota(c2, ap2, ap1, a2);
		rotas.adicionar(r2);

		Voo v1 = new Voo(r1, datahora, duracao);
		voos.adicionar(v1);
		Voo v2 = new Voo(r2, datahora, duracao);
		voos.adicionar(v2);

		//System.out.println(c1.toString());
		//System.out.println(a1.toString());
		//System.out.println(ap1.toString());
		//System.out.println(r1.toString());
		System.out.println(v1.toString());
	}
}
