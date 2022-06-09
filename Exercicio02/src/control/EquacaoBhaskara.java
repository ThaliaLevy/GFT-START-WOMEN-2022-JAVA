package control;

import java.util.Scanner;

public class EquacaoBhaskara {
	double a, b, c;
	public double delta;
	public Double[] resultado = new Double[2];

	public void receberValores(Scanner ler) {
		System.out.println("Digite o valor de a: ");
		setA(ler.nextDouble());
		System.out.println("Digite o valor de b: ");
		setB(ler.nextDouble());
		System.out.println("Digite o valor de c: ");
		setC(ler.nextDouble());
	}

	public void calcularEquacao() {
		delta = Math.sqrt((getB() * getB()) - 4 * (getA() * getC()));
		System.out.println(resultado[0] = (-getB() + delta) / (2 * getA()));
		System.out.println(resultado[1] = (-getB() - delta) / (2 * getA()));
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
}
