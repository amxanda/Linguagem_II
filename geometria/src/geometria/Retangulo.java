package geometria;

public class Triangulo 
{
	//atributos
	private double base, altura;
	
	//métodos
	public void setBase(double base)
	{
		if(base > 0)
		{
			this.base = base;	
		}
	}
	
	public void setAltura(double altura)
	{
		if(altura > 0)
		{
			this.altura = altura;	
		}
	}
	
	public double calculaArea()
	{
		double area = base * altura / 2 ;
		
		return area;
	}
	
	public void desenhar()
	{
		for(int i=0; i < base; i++)
		{			
			for (int j = 0; j <= i; j++) 
			{
				if( i == j ) 
				{
					System.out.println(" ");
				}
				else
				{
					System.out.print(" .");
				}
			}
		}
	}
}
