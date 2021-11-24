package Exercicios;

import java.util.Scanner;

public class Exemplo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdNotas;
		double media = 0;
		
		System.out.print("Quantas notas registrar? : ");
		qtdNotas = sc.nextInt();
		
		double notas[] = new double[qtdNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("nota "+ (i+1) +": ");
			notas[i] = sc.nextDouble();	
			media += notas[i];
		}
		
		
	
		media = media / notas.length;
		
		
		System.out.println("\nNotas:");
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota "+(i+1)+": " + notas[i]);
		}
		
		System.out.println("\nMédia final: " + media);
		sc.close();

		
	}

}
