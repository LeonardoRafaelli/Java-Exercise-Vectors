package Exercicios;

import java.util.Scanner;

public class Atv_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nums[] = new int[10], quadrado, soma=0;
		
		
		System.out.println("Insira 10 números: ");
		for(int i = 0; i < nums.length; i++) {
			System.out.print("Número "+(i+1)+": ");
			nums[i] = sc.nextInt();
			quadrado = nums[i] * nums[i];
			soma += quadrado;
		}
		
		
		System.out.println("\nSoma dos quadrados dos números digitados: " + soma);
		sc.close();
	}
}
