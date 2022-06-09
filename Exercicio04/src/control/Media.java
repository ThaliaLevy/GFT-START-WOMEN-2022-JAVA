package control;

import java.util.Scanner;

public class Media {

	public void apresentarMenuMedias() {
		System.out.println("\n Menu \n======");
		System.out.println(" Escolha a opção: \n==================");
		System.out.println("1 - para calcular média aritmética;");
		System.out.println("2 - para calcular média ponderada;");
		System.out.println("s - para sair.");
	}

	public double calcularMediaAritmetica(Scanner ler) {
		double nota = 0, media;

		for (int i = 1; i < 3; i++) {
			System.out.println("Digite o valor da nota " + i + ":");
			nota += ler.nextDouble();
		}
		
		media = nota/2;
		return media;
	}
	
	public double calcularMediaPonderada(Scanner ler) {
		double nota = 0, peso, somatorioPeso = 0, somatorioNota = 0, media;
		for (int i = 1; i < 4; i++) {
			System.out.println("Digite o valor da nota " + i + ":");
			nota = ler.nextDouble();
			System.out.println("Digite seu respectivo peso: ");
			peso = ler.nextDouble();
			somatorioPeso += peso;
			System.out.println(peso);
			somatorioNota += nota * peso;
		}
		
		media = somatorioNota/somatorioPeso;
		return media;
	}
}
