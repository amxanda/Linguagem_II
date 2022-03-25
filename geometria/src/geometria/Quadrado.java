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
	
	public void desenhar()
	{
		for(int i=0; i < lado; i++)
		{
			for (int j=0; j < lado; j++) 
			{
					System.out.print(" .");
			}
			System.out.println(" .");
		}
	}
}
