package Exercicios;

import java.util.Scanner;

public class Atv_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vetorTotal[] = new int[5], parQtd = 0, imparQtd = 0;
		
		for(int i = 0; i < vetorTotal.length; i++) {
			System.out.print("Número "+(i+1)+": ");
			vetorTotal[i] = sc.nextInt();
			
			if(vetorTotal[i] % 2 == 0) {
				parQtd++;
			} else {
				imparQtd++;
			}
		}	
		
		int vetorPar[] = new int[parQtd];
		int vetorImpar[] = new int[imparQtd];
		
		
		int iPar=0, iImpar=0;
		
		for(int i = 0; i < vetorTotal.length; i++) {
			if(vetorTotal[i] % 2 == 0) {
				vetorPar[iPar] = vetorTotal[i];
				iPar++;
			} else {
				vetorImpar[iImpar] = vetorTotal[i];
				iImpar++;
			}
		}
		
		System.out.println("\nNúmeros Digitados: ");
		for(int i = 0; i < vetorTotal.length; i++){
			System.out.println(vetorTotal[i]);
		}		
		
		System.out.println("\nNúmeros Pares Digitados: ");
		for(int i = 0; i < vetorPar.length; i++){
			System.out.println(vetorPar[i]);
		}	
		
		System.out.println("\nNúmeros Ímpares Digitados: ");
		for(int i = 0; i < vetorImpar.length; i++){
			System.out.println(vetorImpar[i]);
		}		

		
		sc.close();
	}
}
