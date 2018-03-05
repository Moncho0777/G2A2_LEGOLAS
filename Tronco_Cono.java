import java.util.Scanner;
import java.text.DecimalFormat;
public class Tronco_Cono
{
	public static void main(String args[])
	{
		System.out.println("Escuela de Administración de Negocios");
		System.out.println("Guía No. 1 Actividad 1");
		System.out.println("Tronco Cono");
		System.out.println();
		
		Tronco_Cono tc = new Tronco_Cono();
		tc.solicitarDatos();
	}
	public static void solicitarDatos()
	{
		Scanner tecla = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("0.00");
		System.out.print("Digite el radio de la base del cono: ");
		int radio = tecla.nextInt();
		System.out.print("Digite la altura del cono: ");
		int altura = tecla.nextInt();
		System.out.println();
		
		double areaBase = calcularAreaBase(radio);
		//System.out.print("El area de la base del cono es: "+formato.format(areaBase));
		//System.out.println();
		
		double volumenCono = calcularVolumen(areaBase, altura);
		System.out.print("El volumen del cono de radio "+radio+", de base: "+formato.format(areaBase)+" y de altura: "+altura+", es de: "+formato.format(volumenCono)+" unidades cubicas");
	}
	public static double calcularAreaBase(int a)
	{
		double area = 0;
		area = Math.PI*Math.pow(a, 2); 
		return area;
	}
	public static double calcularVolumen(double areaBase, int altura)
	{
		double volumen =0;
		volumen = areaBase*altura;
		return volumen;
		
	}
}
	