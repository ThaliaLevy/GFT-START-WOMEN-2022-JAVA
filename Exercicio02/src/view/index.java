package view;

import java.util.Scanner;

import control.EquacaoBhaskara;

public class index {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Resolvendo equação de segundo grau \n=========================================");

		EquacaoBhaskara eb = new EquacaoBhaskara();
		
		eb.receberValores(ler);
		eb.calcularEquacao();
		
		ler.close();
	}
}
