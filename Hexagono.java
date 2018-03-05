import java.util.Scanner;

public class Hexagono
{
	public static void main(String Args[])
	{
		System.out.println("Escuela de Administración de Negocios");
		System.out.println("Guía No. 1 Actividad 1");
		System.out.println("Hexagono");
		System.out.println();
		
		Hexagono hex = new Hexagono();
		hex.solicitarDatos();
		
	}
	public static void solicitarDatos()
	{
		Scanner tecla = new Scanner(System.in);
		System.out.print("Digite el lado de hexagono: ");
		int lado = tecla.nextInt();
		
		System.out.print("Digite el apotema del hexagono: ");
		int apotema = tecla.nextInt();
		System.out.println();
		
		double area = calcularArea(lado, apotema);
		System.out.print("El area del hexagono es: "+area+ "unidades cuadradas");
	}
	public static double calcularArea(int a, int b)
	{
		double area = 0;
		return area = (double)(6*a*b)/2;
	}
}
