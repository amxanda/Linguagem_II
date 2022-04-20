package main;

import java.util.*; //
import numeros.MediaA;
import numeros.MediaG;
import numeros.Par;
import numeros.Impar;

public class Main 
{
	public static void main(String[] args)
	{ 
		List<Integer> vetor = new ArrayList();
		
		int qtd;
		int n;
		int i;
		
		MediaA mediaA = new MediaA();
		MediaG mediaG = new MediaG();
		Par par = new Par();
		Impar impar = new Impar();
		
		Scanner numero = new Scanner(System.in);
		
		System.out.print(" Insira a quantidade: ");
		qtd = numero.nextInt();
		
		for(i=1; i<=qtd; i++)
		{
			System.out.print(" Digite um número: ");
			n = numero.nextInt();
			vetor.add(n);
		}
	
		//double mediaA1 = mediaA.calcMedia();
		//System.out.print(" Total da Média Aritmética Simples: " + mediaA1);
		System.out.println("");
		

	}
}

