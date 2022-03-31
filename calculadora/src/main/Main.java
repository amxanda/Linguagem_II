package main;

import java.util.List;
import model.Calc;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
				
		Calc calc = new Calc();
		
		System.out.println("\t Menu");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.println("5 - Sair");
		
		int op;
		int nI=0;
		int nII=0;
		
		Scanner menu = new Scanner(System.in);
		Scanner numero1 = new Scanner(System.in);
		Scanner numero2 = new Scanner(System.in);
		
		System.out.print(" Insira um número: ");
		nI = numero1.nextInt();
		
		System.out.print(" Insira outro número: ");
		nII = numero2.nextInt();
		
		System.out.print(" Insira a opção desejada: ");
//		op = menu.nextInt();
	
		do 
		{

			op = menu.nextInt();
			
			switch(op) 
			{
				case 1:
					System.out.println("Soma: "+ nI + "+" + nII + "= " + calc.sum(nI,nII));
					System.out.println("");
				break;
				case 2:
					System.out.println("Subtração: "+ nI + "+" + nII + "= " + calc.sub(nI, nII));
					System.out.println("");
				break;
				case 3:
					System.out.println("Divisão: "+ nI + "+" + nII + "= " + calc.div(nI, nII));
					System.out.println("");
				break;
				case 4:
					System.out.println("Multiplicação: "+ nI + "+" + nII + "= " + calc.mult(nI, nII));
					System.out.println("");
				break;
				case 5:
					List<String> operations = calc.getLastOperations();
					System.out.println("Operações realizadas: ");
					
					for (String operation : operations) 
					{
						System.out.println(operation);
					}
				break;
				default:
					System.out.println(" Opção Invalida.");
			}
			
		System.out.println("\t Menu");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.println("5 - Sair");
			
			System.out.print(" Insira a opção desejada: ");
			
		} while(op != 5);
	}
}
