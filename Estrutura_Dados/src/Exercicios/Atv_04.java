package Exercicios;

import java.util.Scanner;

public class Atv_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade[] = new int[5];
		double altura[] = new double[5];
		
		System.out.println("Insira 5 idades e 5 alturas: ");
		
		for(int i = 0; i < idade.length; i++) {
			System.out.print("\nIdade " + (i+1) + ": ");
			idade[i] = sc.nextInt();
			
			System.out.print("Altura " +(i+1)+": ");
			altura[i] = sc.nextDouble();
		}
		
		System.out.println("\nImpressão inversa de idade e altura");
		for(int i = (idade.length-1); i >= 0; i--) {
			System.out.println("\nIdade " +(i+1)+": " + idade[i]);
			System.out.println("Altura " +(i+1)+": " + altura[i]);
		}
		
		sc.close();
	}
}
