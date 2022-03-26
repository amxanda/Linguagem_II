package geometria;

public class Main 
{

	public static void main(String[] args) 
	{
		Quadrado quadrado1 = new Quadrado();
		quadrado1.setLado(5);
		
		Retangulo retangulo1 = new Retangulo();
		retangulo1.setBase(3);
		retangulo1.setAltura(6);
		
		Circulo circulo1 = new Circulo();
		circulo1.setRaio(9);
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setBase(8);
		triangulo1.setAltura(8);
		
		Quadrado primeiroQuadrado = new Quadrado();
		primeiroQuadrado.setLado(5);
		
		Retangulo primeiroRetangulo = new Retangulo();
		primeiroRetangulo.setBase(3);
		primeiroRetangulo.setAltura(6);
		
		Triangulo primeiroTriangulo = new Triangulo();
		primeiroTriangulo.setBase(8);
		primeiroRetangulo.setAltura(8);
		
		Circulo primeiroCirculo = new Circulo();
		primeiroCirculo.setRaio(9);
				
		
		double areaQuadrado1 = quadrado1.calculaArea();
		System.out.println(" Area do quadrado: " + areaQuadrado1);
		
		double areaRetangulo1 = retangulo1.calculaArea();
		System.out.println(" Area do retangulo: " + areaRetangulo1);
		
		double areaCirculo1 = circulo1.calculaArea();
		System.out.println(" Area do circulo: " + areaCirculo1);
		
		double areaTriangulo1 = triangulo1.calculaArea();
		System.out.println(" Area do retangulo: " + areaTriangulo1);
		
		System.out.println(" Desenho do quadrado: ");
		primeiroQuadrado.desenhar();
		System.out.println("");
		
		System.out.println(" Desenho do retangulo: ");
		primeiroRetangulo.desenhar();
		System.out.println("");
		
		System.out.println(" Desenho do triangulo: ");
		primeiroTriangulo.desenhar();
		System.out.println("");
		
		System.out.println(" Desenho do circulo: ");
		primeiroCirculo.desenhar();
		System.out.println("");		
	}
}
