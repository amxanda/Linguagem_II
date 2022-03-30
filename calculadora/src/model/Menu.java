package model;

import java.util.Scanner;

public class Menu {
	
	public static void menu() {
	
		System.out.println("\t Menu");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.println("5 - Sair");
	}
		
		
		public static void soma() {
			System.out.println("Soma: 9 + 2: " + calc.sum(9, 2));
		}
		
		public static void subtracao() {
			System.out.println("Sub: 9.5 - 2.5: " + calc.sub(9.5, 2.5));
		}
		
		public static void divisao() {
			System.out.println("Div: 9 / 2: " + calc.div(9, 2));
		}
		
		public static void multiplicacao() {
			System.out.println("Mult: 9 * 2: " + calc.mult(9, 2));
		}	
		
		public static void sair() {
			System.out.println("Mult: 9 * 2: " + calc.mult(9, 2));
		}
		
	int op;

	Scanner menu = new Scanner(System.in);
		
	do {
		menu();
		op = menu.nextInt();
		
		switch(op) {
		case 1:
			soma();
			break;
		case 2:
			subtracao();
			break;
		case 3:
			divisao();
			break;
		case 4:
			multiplicacao();
			break;
		case 5:
			if (op==1) {

			}
			else 
			if (op==2) {
				
			}
			else
			if (op==3) {
				
			}
			else
			if (op==4) {
				
			}
				else
			if (op==5) {
				
			}
			break;
		default:
			System.out.println(" Opção Invalida.");
		}
	} while(op != 0);
}