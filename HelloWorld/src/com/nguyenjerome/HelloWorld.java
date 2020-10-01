package com.nguyenjerome;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		HelloWorld aj1 = new HelloWorld();
		int somme1 = aj1.ajouter(69, 31);
		System.out.println(somme1);
	}

	public int ajouter(int num1, int num2) {
		return num1 + num2;
	}
}
