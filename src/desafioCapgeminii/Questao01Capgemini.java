package desafioCapgeminii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao01Capgemini {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		List<String> escada = new ArrayList<>();

		System.out.print("Digite a quantidade de vezes: ");
		int qtdEscada = leia.nextInt();

		for (int i = 0; i < qtdEscada; i++) {
			escada.add(" ".repeat(qtdEscada - i) + "*".repeat(i + 1));
		}

		for (String d : escada ) {
		System.out.println(d);
		}
		
		leia.close();

	}

}
