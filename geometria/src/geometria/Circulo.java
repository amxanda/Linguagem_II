package geometria;

public class Circulo 
{
	//atributos
	private double raio;
	
	//m�todos
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
}
