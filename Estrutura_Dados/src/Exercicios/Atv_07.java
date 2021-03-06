package Exercicios;

import java.util.Scanner;

public class Atv_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vetor1[] = new int[10],
				vetor2[] = new int[10],
				vetor3[] = new int[10],
				vetorAlt[] = new int[30];
		
		System.out.println("Insira 10 valores em cada vetor");
		for(int i = 1; i <= 3; i++) {
			if(i == 1) {
				System.out.println("Vetor 1 --------");
				for(int n = 0; n < vetor1.length; n++) {
					System.out.print("Valor " +(n+1)+ ": ");
					vetor1[n] = sc.nextInt();
				}				
			} else if(i == 2) {
				System.out.println("Vetor 2 --------");
				for(int n = 0; n < vetor2.length; n++) {
					System.out.print("Valor " +(n+1)+ ": ");
					vetor2[n] = sc.nextInt();
				}		
			} else {
				System.out.println("Vetor 3 --------");
				for(int n = 0; n < vetor3.length; n++) {
					System.out.print("Valor " +(n+1)+ ": ");
					vetor3[n] = sc.nextInt();
				}	
			}
		}
		
		int contV1 = 0;
		int contV2 = 0;
		int contV3 = 0;
		
		for(int i=0; i < vetorAlt.length;) {
			vetorAlt[i] = vetor1[contV1];
			contV1++;
			i++;
			vetorAlt[i] = vetor2[contV2];
			contV2++;
			i++;
			vetorAlt[i] = vetor3[contV3];
			contV3++;
			i++;
		}
		
		System.out.println("\nVetor com ordem alternada:");
		for(int i = 0; i < vetorAlt.length; i++) {
			System.out.println(i+1+"- "+vetorAlt[i]);
		}
		
		sc.close();
		
		
		sc.close();
	}
}
