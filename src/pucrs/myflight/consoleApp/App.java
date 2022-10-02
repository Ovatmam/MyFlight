//Eduardo Enes Traunig, Gabriel Dalbem

package pucrs.myflight.consoleApp;

//import javax.swing.GroupLayout;

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
import pucrs.myflight.modelo.VooDireto;
import pucrs.myflight.modelo.VooEscalas;
import pucrs.myflight.modelo.Voo.Status;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");

		LocalDateTime datahora = LocalDateTime.of(2022, 01, 01, 18, 30);

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

		VooDireto v1 = new VooDireto(r1, datahora);
		voos.adicionar(v1);
		VooDireto v2 = new VooDireto(r2, datahora);
		voos.adicionar(v2);

		VooEscalas ve1 = new VooEscalas(r1, datahora);
		ve1.adicionaRota(r2);
		ve1.adicionaRota(r1);

		//System.out.println(c1.toString());
		//System.out.println(a1.toString());
		//System.out.println(ap1.toString());
		//System.out.println(r1.toString());
		//System.out.println(v1.toString());

		//double d = Geo.distancia(ap1.getLocal(), ap2.getLocal());

		//System.out.printf("\nDistancia entre POA e GRU: %.2fkm", d);
		//System.out.println("Total de empresas: "+ CiaAerea.getTotalCias());

		//testarVooDireto(v1);
		testarVooEscalas(ve1);
	}

	public static void testarVooDireto(VooDireto v1) {
		System.out.println("____________________________________________________________________________");
		System.out.println("VOO: ");
		//System.out.println(" - getRota: " + v1.getRota().toString());
		//System.out.println(" - getDataHora: " + v1.getDatahora().toString());
		System.out.println(" - getDuracao: " + v1.getDuracao().toString());
		//v1.setStatus(Status.ATRASADO);
		//System.out.println(" - getStatus: " + v1.getStatus());
		//System.out.println(" - toString: " + v1.toString());
		System.out.println("____________________________________________________________________________");
	}

	public static void testarVooEscalas(VooEscalas v1) {
		System.out.println("____________________________________________________________________________");
		System.out.println("VOO ESCALAS: ");
		//System.out.println(" - getRotaFinal: " + v1.getRotaFinal());
		System.out.println(" - getDuracao: " + v1.getDuracao().toString());
		//System.out.println(" - toString: \n" + v1.toString());
		System.out.println("____________________________________________________________________________");
	}
}
