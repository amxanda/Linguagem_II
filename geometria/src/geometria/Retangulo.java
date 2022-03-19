package geometria;

public class Retangulo 
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
		double area = base * altura;
		
		return area;
	}
}
