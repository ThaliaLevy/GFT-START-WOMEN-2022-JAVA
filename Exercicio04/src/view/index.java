package view;

import java.util.Scanner;

import control.Media;

public class index {

	public static void main(String[] args) {
		String op;
		Scanner ler = new Scanner(System.in);
		Media m = new Media();

		do {
			m.apresentarMenuMedias();
			op = ler.nextLine();
		} while (!(op.equals("1") | op.equals("2") | op.equalsIgnoreCase("S")));

		switch (op) {
		case "1": {
			System.out.println("A m�dia aritm�tica � " + m.calcularMediaAritmetica(ler));
			break;
		}
		case "2": {
			System.out.println("A m�dia ponderada � " + m.calcularMediaPonderada(ler));
			break;
		}
		case "s":
		case "S": {
			System.out.println("Saindo...\n");
			break;
		}
		default: {
			System.out.println("Op��o inv�lida;");
			break;
		}
		}
	}
}
