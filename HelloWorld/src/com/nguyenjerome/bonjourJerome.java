package com.nguyenjerome;

public class bonjourJerome {

	public static void main(String[] args) {
		System.out.println("Salut all !");
		bonjourJerome objet1 = new bonjourJerome();
		int mult1 = objet1.multiplication(4, 24);
		System.out.println(mult1);

	}

	public int multiplication(int num1, int num2) {
		return num1 * num2;
	}
}
