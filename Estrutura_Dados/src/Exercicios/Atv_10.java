package Exercicios;

import java.util.Scanner;

public class Atv_10 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		char resp[] = new char[5];
		int i = 0, cont = 0;
		
		System.out.print("Telefonou para a vítima?");
		resp[i] = sc.next().charAt(0);
		i++;
		
		System.out.print("\nEsteve no local do crime?");
		resp[i] = sc.next().charAt(0);
		i++;
		
		System.out.print("\nMora perto da vítima?");
		resp[i] = sc.next().charAt(0);
		i++;
		
		System.out.print("\nDevia para a vítima?");
		resp[i] = sc.next().charAt(0);
		i++;
		
		System.out.print("\nJá trabalhou com a vítima?");
		resp[i] = sc.next().charAt(0);
		i++;
		
		for(int n = 0; n < resp.length; n++) {
			if(resp[n] == 's' || resp[n] == 'S') {
				cont++;
			}
		}
		
		if(cont == 5) {
			System.out.println("\nVocê é o assassino!!");
		}
		else if(cont > 2 && cont < 5) {
			System.out.println("\nVocê é cúmplice!");
		}
		else if(cont == 2) {
			System.out.println("\nVocé é suspeito!");
		}
		else {
			System.out.println("\nVocê é inocente!");
		}
		
		sc.close();
	}
}
