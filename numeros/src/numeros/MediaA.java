package numeros;

import java.util.*;

public class MediaA 
{
	private double resultado, soma;
	private int qtd, numero;
	
	List<Integer> vetor = new ArrayList();
	
	public double calcMedia()
	{
		for(int i=1; i<=qtd; i++)
		{
			qtd = vetor.get(i);
			soma = numero + soma;
		}
		
		resultado = soma/qtd;
	
		return resultado;
	}
}
