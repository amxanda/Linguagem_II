package geometria;

public class Main 
{

	public static void main(String[] args) 
	{
		Quadrado quadrado1 = new Quadrado();
		quadrado1.setLado(12.5);
		
		double areaQuadrado1 = quadrado1.calculaArea();
		System.out.println("Area quadrado: " + areaQuadrado1);
	}
}
