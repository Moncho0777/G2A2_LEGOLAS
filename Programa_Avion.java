import java.util.Scanner;
import java.text.DecimalFormat;
public class Programa_Avion
{
	public static void main(String args[])
	{
		System.out.println("Escuela de Administración de Negocios");
		System.out.println("Guía No. 1 Actividad 1");
		System.out.println("Programa Avion");
		System.out.println();

		Programa_Avion pa = new Programa_Avion();
		pa.solicitarDatos();
	
	}
	public static void solicitarDatos()
	{
		Scanner tecla = new Scanner(System.in); 
		System.out.print("Digite la cantidad de pasajeros en primera clase: ");
		int pasajerosClase_1 = tecla.nextInt();
		int monto_pasajerosClase_1 = pasajerosClase_1 * 500000;
		
		System.out.print("Digite la cantidad de pasajeros de clase ejecutiva: ");
		int pasajerosClase_2 = tecla.nextInt();
		int monto_pasajerosClase_2 = pasajerosClase_2 * 200000;
		
		System.out.print("Digite la cantidad de pasajero de la clase turista: ");
		int pasajerosClase_3 = tecla.nextInt();
		int monto_pasajerosClase_3 = pasajerosClase_3 * 125000;
		System.out.println();
		
		mostrarDatos(monto_pasajerosClase_1, monto_pasajerosClase_2, monto_pasajerosClase_3);
	}	
	public static void mostrarDatos(int a, int b, int c)
	{
		DecimalFormat formato = new DecimalFormat("#,###");
		System.out.println("El recaudo por primera clase es: "+formato.format(a));
		System.out.println("El recaudo por primera clase es: "+formato.format(b));
		System.out.println("El recaudo por primera clase es: "+formato.format(c));
	}
}
