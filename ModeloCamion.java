import java.util.Scanner;
import java.text.DecimalFormat;
public class ModeloCamion
{
	public static void main(String args[])
	{
		System.out.println("Escuela de Administración de Negocios");
		System.out.println("Guía No. 1 Actividad 1");
		System.out.println("Modelo Camion");
		System.out.println();
		
		ModeloCamion mc = new ModeloCamion(); 
		mc.solicitarDatos();
	}
	public static void solicitarDatos()
	{
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("0.00");
		
		System.out.print("Digite la carga a transpotar (en tonedalas): ");
		int carga = teclado.nextInt();
		System.out.println();
		
		// ¿Cuántos viajes tiene que hacer?
		double viajes = viajesARealizar(carga);
		double viajesRedondeado = Math.ceil(viajes);
		System.out.println("Para transportar "+carga+" toneladas, se deben realizar: "+formato.format(viajes)+" - "+viajesRedondeado+" viajes.");
		
		// ¿Qué recorrido realizaría?
		double recorridoKlms = calcularRecorrido(viajesRedondeado);
		System.out.println("El recorrido estimado para los "+viajesRedondeado+" viajes es de: "+formato.format(recorridoKlms)+" kilometros");
		
		// ¿Consumo de gasolina?
		double consumoGal = calcularConsumo(recorridoKlms);
		System.out.println("El consumo en galones de gasolina estimado será de: "+formato.format(consumoGal));
	}
	public static double viajesARealizar(int a)
	{
		double capacidad = 0;
		capacidad = a/3.5;
		return capacidad;
	}
	public static double calcularRecorrido(double b)
	{
		double recorrido = 0;
		recorrido = b * (82.2*2);
		return recorrido;
	}
	public static double calcularConsumo(double c)
	{
		double consumo = 0;
		consumo = c / 20;
		return consumo;
	}
}
