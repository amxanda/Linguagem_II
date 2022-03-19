package geometria;

public class Main 
{

	public static void main(String[] args) 
	{
		Quadrado quadrado1 = new Quadrado();
		quadrado1.setLado(5);
		
		Retangulo retangulo1 = new Retangulo();
		retangulo1.setBase(7);
		retangulo1.setAltura(3);
		
		Circulo circulo1 = new Circulo();
		circulo1.setRaio(9);
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setBase(8);
		triangulo1.setAltura(6);
		
		
		double areaQuadrado1 = quadrado1.calculaArea();
		System.out.println("Area do quadrado: " + areaQuadrado1);
		
		double areaRetangulo1 = retangulo1.calculaArea();
		System.out.println("Area do retangulo: " + areaRetangulo1);
		
		double areaCirculo1 = circulo1.calculaArea();
		System.out.println("Area do circulo: " + areaCirculo1);
		
		double areaTriangulo1 = triangulo1.calculaArea();
		System.out.println("Area do retangulo: " + areaTriangulo1);
		
		
	}
}
