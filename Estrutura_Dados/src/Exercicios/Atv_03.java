package Exercicios;

import java.util.Scanner;

public class Atv_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma=0, mult=1;
		int nums[] = new int[5];
		
		System.out.println("Digite " + nums.length + " Números:");
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("Número "+(i+1)+": ");
			nums[i] = sc.nextInt();
			soma += nums[i];
			mult *= nums[i];
		}
		
		System.out.println("\nSoma dos números: " + soma);
		
		System.out.println("\nMultiplicação dos números: "+ mult);
		
		sc.close();
	}
}
