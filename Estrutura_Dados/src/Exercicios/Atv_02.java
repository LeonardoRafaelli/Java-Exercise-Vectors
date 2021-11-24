package Exercicios;

import java.util.Scanner;

public class Atv_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double mediaAlunos[] = new double[4];
		double notas, media = 0;
		
		for(int i =0; i < mediaAlunos.length; i++) {
			System.out.println("\nInsira a nota do aluno "+(i+1)+": ");
			for(int n = 1; n <= 4; n++) {
				System.out.print("Nota " + n + ": ");
				notas = sc.nextDouble();
				media += notas;
			}		
			
			media = media/4;
			
			mediaAlunos[i] = media;
			media = 0;
		}
		
		System.out.println("\n--------Alunos com média acima de 7----------");
		
		for(int i = 0; i < mediaAlunos.length; i++) {
			if(mediaAlunos[i] >= 7) {
				System.out.println("Aluno "+(i+1)+": " + mediaAlunos[i]);							
			}
		}
		
		sc.close();
	}
}
