
/*Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são: "Telefonou para a vítima?" "Esteve no local do crime?" "Mora perto da vítima?" "Devia para a vítima?" "Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".*/

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int encontrarSujeito = 0, verificador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Telefonou para a vítima ?");
		System.out.println("1- sim  0- não ");
		encontrarSujeito = sc.nextInt();
		if (encontrarSujeito == 1) {
			verificador++;
		}
		System.out.println("========================================");
		System.out.println("Mora perto da vítima?");
		System.out.println("1- sim  0- não ");
		encontrarSujeito = sc.nextInt();
		verificador(encontrarSujeito, verificador);

		System.out.println("========================================");
		System.out.println(" ja trabalhaou com a vitima?");
		System.out.println("1- sim  0- não ");
		encontrarSujeito = sc.nextInt();
		if (encontrarSujeito == 1) {
			verificador++;
		}
		System.out.println("========================================");
		System.out.println("Esteve no local do crime?");
		System.out.println("1- sim  0- não ");
		encontrarSujeito = sc.nextInt();
		if (encontrarSujeito == 1) {
			verificador++;
		}
		System.out.println("========================================");
		System.out.println("Devia para a vítima?");
		System.out.println("1- sim  0- não ");
		encontrarSujeito = sc.nextInt();
		if (encontrarSujeito == 1) {
			verificador++;
		}

		System.out.println("========================================");
		System.out.printf("chance de probabilidade %d\n", verificador);
		if (verificador == 1 || verificador == 0) {
			System.out.println("inocente");
		} else if (verificador == 2) {
			System.out.println("suspeita");
		} else if (verificador == 3 || verificador == 4) {
			System.out.println("cumplice ");
		} else {
			System.out.println(" Assasino");
		}
		sc.close();

	}

	public static void verificador(int pistas, int verificador) {
		if (pistas == 1) {

			verificador++;
		}
		
	}
}
