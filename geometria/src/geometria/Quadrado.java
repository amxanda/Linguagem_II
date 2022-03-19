package geometria;

public class Quadrado 
{
	//atributo
	private double lado;
	
	//métodos
	public void setLado(double lado)
	{
		if(lado > 0)
		{
			this.lado = lado;	
		}
	}
	
	public double calculaArea()
	{
		double area = lado * lado;
		
		return area;
	}
}
