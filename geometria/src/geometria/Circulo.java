package geometria;

public class Circulo 
{
	//atributos
	private double raio;
	
	//métodos
	public void setRaio(double raio)
	{
		if(raio > 0)
		{
			this.raio = raio;	
		}
	}
	
	public double calculaArea()
	{
		double area = 2 * raio;
		
		return area;
	}
	
	public void desenhar()
	{
		for(int i=0; i < raio; i++)
		{			
			for (int j=0; j < raio; j++) 
			{
				System.out.print(" .");
			}
			System.out.println(" .");
		}
	}
}
