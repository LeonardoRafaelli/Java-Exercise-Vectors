package Exercicios;

import java.util.Scanner;

public class Atv_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age[] = new int[30], counter=0, belowAvg = 0;
		double height[] = new double[30], heightAvg=0;
		
		for(int i = 0; i < age.length; i++){
			System.out.println("Aluno "+(i+1)+":");
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			System.out.print("Altura: ");
			height[i] = sc.nextDouble();
			heightAvg += height[i];
			counter++;
		}
		
		heightAvg = heightAvg/counter;
		
		for(int i = 0; i < age.length; i++) {
			if(age[i] > 13 && height[i] < heightAvg){
				belowAvg++;
			}
		}
		
		System.out.println(belowAvg+" Students are older than 13 yo and below the height avg");
		
		sc.close();
	}
}
