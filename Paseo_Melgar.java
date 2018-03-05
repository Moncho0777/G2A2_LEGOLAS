import java.util.Scanner;
import java.text.DecimalFormat;
public class Paseo_Melgar
{
	public static void main(String args [])
	{
		System.out.println("Escuela de Administración de Negocios");
		System.out.println("Guía No. 1 Actividad 1");
		System.out.println("Paseo Melgar");
		System.out.println();
		
		Paseo_Melgar pm = new Paseo_Melgar();
		pm.solicitarDatos();
	}
	public static void solicitarDatos()
	{
		Scanner tecla = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("###,###.##");
		
		System.out.print("Cuantos estudiantes flacos van a ir al paseo: ");
		int cantidadEstFlacos = tecla.nextInt();
		
		System.out.print("Cuantos estudiantes gordos van a ir al paseo: ");
		int cantidadEstGordos = tecla.nextInt();
		
		System.out.print("Cuantas sillas tiene el bus a contratar: ");
		int cantidadSillas = tecla.nextInt();
		
		System.out.print("Cual es el precio de alquiler de un bus: ");
		int precioAlquiler = tecla.nextInt();
		
		System.out.print("Cual es el valor de cada comida: ");
		int valorComida = tecla.nextInt();
		
		System.out.print("Cual es el valor de la noche de hotel: ");
		int valorHotel = tecla.nextInt();
		
		System.out.print("Cuantas personas caben por habitación: ");
		int capacidadHabitaciones = tecla.nextInt();
		
		System.out.print("Digite los días del paseo: ");
		int diasPaseo = tecla.nextInt();
		System.out.println();
		
		// Llamado a métodos: CAntidad de buses
		double cuantosBuses = cantidadBuses(cantidadEstFlacos, cantidadEstGordos, cantidadSillas);
		System.out.println("La cantidad de buses requerida es: "+cuantosBuses+" buses");
		
		//Costo de buses
		int costoBuses = costoAlquilerBuses(cuantosBuses, precioAlquiler);
		System.out.println("El costo de alquilar "+cuantosBuses+" buses es de: "+formato.format(costoBuses));
		
		//Costo Comida
		int valorComidas = costoComidas(cantidadEstFlacos, cantidadEstGordos, valorComida, diasPaseo);
		System.out.println("El costo de la comida es de: "+formato.format(valorComidas));
		
		//Cantidad de habitaciones
		int cantidadHabitaciones = calcularHabitaciones(cantidadEstFlacos, cantidadEstGordos, capacidadHabitaciones);
		System.out.println("La cantidad de habitaciones requerida es de: "+cantidadHabitaciones);
		
		//Costo de las habitaciones
		int costoTotalHabitaciones = calcularCostoHabitaciones(cantidadHabitaciones, diasPaseo, valorHotel);
		System.out.println("El costo por las habitaciones es de: "+formato.format(costoTotalHabitaciones));
		System.out.println();
		
		// Costo total
		int costoTotalPaseo = costoTotalHabitaciones+valorComidas+costoBuses;
		System.out.println("El costo total del paseo es de: "+formato.format(costoTotalPaseo));
		int costoDiarioPaseo = costoTotalPaseo/diasPaseo;
		System.out.println("El costo diario del pase es de: "+formato.format(costoDiarioPaseo));
		
	}
	public static double cantidadBuses(int cantidadEstFlacos, int cantidadEstGordos, int cantidadSillas)
	{
		double cantidadBuses = 0;
		int cantidadBusesEntero = 0;
		cantidadBuses = (double)(cantidadEstFlacos+(cantidadEstGordos)*2)/cantidadSillas;
		cantidadBusesEntero = (int)Math.ceil(cantidadBuses);
		return cantidadBusesEntero;
	}
	public static int costoAlquilerBuses(double cantidadBuses, int valor)
	{
		int alquilerBuses = 0;
		alquilerBuses = (int)cantidadBuses * valor;
		return alquilerBuses;
	}
	public static int costoComidas(int cantidadEstFlacos, int cantidadEstGordos, int valorComida, int diasPaseo)
	{
		int valorAlimento = 0;
		valorAlimento = (cantidadEstFlacos*3)+(cantidadEstGordos*5)*diasPaseo*valorComida;
		return valorAlimento;
	}
	public static int calcularHabitaciones(int cantidadEstFlacos, int cantidadEstGordos, int capacidadHabitaciones)
	{
		double cantiadHabitacionesDecimal = 0;
		int cantidadHabitacionesEntero = 0;
		cantiadHabitacionesDecimal = (double)(cantidadEstFlacos+cantidadEstGordos)/capacidadHabitaciones;
		cantidadHabitacionesEntero = (int)Math.ceil(cantiadHabitacionesDecimal);
		return cantidadHabitacionesEntero;
	}
	public static int calcularCostoHabitaciones(int cantidadHabitaciones, int diasPaseo, int valorHotel)
	{
		int costoHotel = 0;
		costoHotel = cantidadHabitaciones*diasPaseo*valorHotel;
		return costoHotel;
	}
}
