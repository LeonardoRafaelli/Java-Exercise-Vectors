package Exercicios;

import java.util.Scanner;

public class Atv_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma=0, mult=1;
		int nums[] = new int[5];
		
		System.out.println("Digite " + nums.length + " N�meros:");
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("N�mero "+(i+1)+": ");
			nums[i] = sc.nextInt();
			soma += nums[i];
			mult *= nums[i];
		}
		
		System.out.println("\nSoma dos n�meros: " + soma);
		
		System.out.println("\nMultiplica��o dos n�meros: "+ mult);
		
		sc.close();
	}
}
