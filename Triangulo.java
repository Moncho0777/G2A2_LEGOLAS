import java.util.Scanner;
import java.text.DecimalFormat;
public class Triangulo
{
	public static void main(String Args[])
	{
		System.out.println("Escuela de Administración de Negocios");
		System.out.println("Guía No. 1 Actividad 1");
		System.out.println("Triangulo");
		System.out.println();
		
		Triangulo tri = new Triangulo();
		tri.solicitarDatos();

	}
	public static void solicitarDatos()
	{
		Scanner tecla = new Scanner(System.in);
		System.out.print("Digite el primer lado del triangulo: ");
		int lado_1 = tecla.nextInt();
		
		System.out.print("Digite el primer lado del triangulo: ");
		int lado_2 = tecla.nextInt();
		
		System.out.print("Digite el primer lado del triangulo: ");
		int lado_3 = tecla.nextInt();
		System.out.println();
		
		double semiperimetro = calcularSemiprerimetro(lado_1, lado_2, lado_3);
		double area = calcularArea(lado_1, lado_2, lado_3, semiperimetro);
		double circunradius = calcularCircumradius(lado_1, lado_2, lado_3, semiperimetro, area);
		
		mostrarDatos(semiperimetro, area, circunradius);
		
	}
	public static double calcularSemiprerimetro(int a, int b, int c)
	{
		double semiperimetro = 0;
		return semiperimetro = (double)(a+b+c)/2;
	}
	public static double calcularArea(int a, int b, int c, double s)
	{
		double area = 0;
		return area = (double)Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	public static double calcularCircumradius(int a, int b, int c, double s, double area)
	{
		double circumradius = 0;
		return circumradius = (a*b*c)/((4*Math.PI)*area);
	}
	public static void mostrarDatos(double semiperimetro, double area, double circunradius)
	{
		DecimalFormat formato = new DecimalFormat();
		System.out.println("El semiperimetro es: "+formato.format(semiperimetro));
		System.out.println("El area es: "+formato.format(area));
		System.out.println("El circunradio es: "+formato.format(circunradius));
		
	}
}
