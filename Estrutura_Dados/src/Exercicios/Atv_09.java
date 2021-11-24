package Exercicios;

import java.util.Scanner;

public class Atv_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double tempMes[] = new double[12],
				mediaTempAn=0;
		
		System.out.println("Insira a temperatura média dos meses:");
		for(int i = 0; i < tempMes.length; i++) {
			switch(i+1) {
			case 1:
				System.out.print("Janeiro: ");
				tempMes[i] = sc.nextDouble();
				break;
			case 2:
				System.out.print("Fevereiro: ");
				tempMes[i] = sc.nextDouble();
				break;
			case 3:
				System.out.print("Março: ");
				tempMes[i] = sc.nextDouble();
				break;
			case 4:
				System.out.print("Abril: ");
				tempMes[i] = sc.nextDouble();
				break;
			case 5:
				System.out.print("Maio: ");
				tempMes[i] = sc.nextDouble();
				break;
			case 6:
				System.out.print("Junho: ");
				tempMes[i] = sc.nextDouble();
				break;
			case 7:
				System.out.print("Julho: ");
				tempMes[i] = sc.nextDouble();
				break;
			case 8:
				System.out.print("Agosto: ");
				tempMes[i] = sc.nextDouble();
				break;
			case 9:
				System.out.print("Setembro: ");
				tempMes[i] = sc.nextDouble();
				break;
			case 10:
				System.out.print("Outubro: ");
				tempMes[i] = sc.nextDouble();
				break;
			case 11:
				System.out.print("Novembro: ");
				tempMes[i] = sc.nextDouble();
				break;
			case 12:
				System.out.print("Dezembro: ");
				tempMes[i] = sc.nextDouble();
				break;
			}
			mediaTempAn += tempMes[i];
		}
		
		mediaTempAn /= 12;
		
		System.out.println("\nMeses com temperatura acima da média:");
		for(int i = 0; i < tempMes.length; i++) {
			if(tempMes[i] > mediaTempAn) {
				switch(i+1) {
				case 1:
					System.out.println("1- Janeiro");
					break;
				case 2:
					System.out.println("2- Fevereiro");
					break;
				case 3:
					System.out.println("3- Março");
					break;
				case 4:
					System.out.println("4- Abril");
					break;
				case 5:
					System.out.println("5- Maio");
					break;
				case 6:
					System.out.println("6- Junho");
					break;
				case 7:
					System.out.println("7- Julho");
					break;
				case 8:
					System.out.println("8- Agosto");
					break;
				case 9:
					System.out.println("9- Setembro");
					break;
				case 10:
					System.out.println("10- Outubro");
					break;
				case 11:
					System.out.println("11- Novembro");
					break;
				case 12:
					System.out.println("12- Dezembro");
					break;
				}
			}
		}
		
		
//		for(int i = 0; i < tempMes.length; i++) {
//			mediaTemp += tempMes[i];
//		}
		
		
		sc.close();
	}
}
