package geometria;

public class Triangulo 
{
	//atributos
	private double base, altura;
	
	//m�todos
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
}
