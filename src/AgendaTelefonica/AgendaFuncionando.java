package AgendaTelefonica;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaFuncionando {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> array = new ArrayList();

		AgendaSistema agenda = new AgendaSistema();
		ContatoSistema contt = new ContatoSistema();
		Lista favorito = new Lista();

		String resp = "s";
		String dados,RespFav;
		int ddd, n = 0;

		Lista[] AgendaFav = new Lista[n+1];

		while (resp.equalsIgnoreCase("s")) {

			System.out.print("Nome: ");
			dados = sc.nextLine();
			contt.setNome(dados);

			System.out.print("DDD: ");
			ddd = sc.nextInt();
			contt.setDigito(ddd);

			System.out.print("Número: ");
			dados = sc.next();
			contt.setNumero(dados);

			System.out.print("Tipo(Celular, Residencial, etc): ");
			dados = sc.next();
			contt.setTipo(dados);

			System.out.println("Acrescentar outro número? [s]/[n]");
			dados = sc.next();
			while (dados.equalsIgnoreCase("s")) {
				System.out.print("DDD: ");
				ddd = sc.nextInt();
				contt.setDigito(ddd);

				System.out.print("Número: ");
				dados = sc.next();
				contt.setNumero(dados);

				System.out.print("Tipo(Celular, Residencial, etc): ");
				dados = sc.next();
				contt.setTipo(dados);

				System.out.println("Acrescentar outro número? [s]/[n]");
				resp = sc.next();
			}

			System.out.println("E-mail: ");
			dados = sc.next();
			contt.setEmail(dados);

			System.out.println("Adicionar aos favoritos? [s]/[n]");
			RespFav = sc.next();
			if (RespFav.equalsIgnoreCase("s")) {
				contt.setFavorito(true);

				favorito.setFavoritos(contt.getNome());
				AgendaFav = new Lista[n+1];
				AgendaFav[n] = favorito;
				n++;

			} else {
				contt.setFavorito(false);
			}

			agenda.setContatos(contt);

			array.add(agenda.getContatos());

			System.out.println("Deseja acrecentar mais um contato? [s]/[n]");
			resp = sc.next();
			System.out.println("");
		}

		// System.out.println(agenda.getContatos());

		/*
		 * for(int i=0;i<array.size();i++) { System.out.println(array.get(i)); }
		 */

		System.out.println("Deseja ver sua lista de contatos? [s]/[n]");
		resp = sc.next();
		if (resp.equalsIgnoreCase("s")) {
			for (String arrays : array) {
				System.out.println(arrays);
				System.out.println("=======");
			}
		} else {
			System.out.println("Ok, então.");
		}

		System.out.println("Deseja ver os favoritos? [s]/[n]");
		resp = sc.next();
		if (resp.equalsIgnoreCase("s")) {
			for (int i = 0; i < AgendaFav.length; i++) {
				System.out.println(AgendaFav[i]);
			}
		} else {
			System.out.println("Ok, então.");
		}

		sc.close();
	}

}
