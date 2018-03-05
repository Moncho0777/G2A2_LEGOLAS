import java.util.Scanner;
public class Proyeccion_lectura
{
	public static void main(String Args[])
	{
		System.out.println("Escuela de Administración de Negocios");
		System.out.println("Guía No. 1 Actividad 3");
		System.out.println("Proyecto en Grupo");
		System.out.println("Poyeccion de Lectura de un libro");
		System.out.println();
		
		Proyeccion_lectura pl = new Proyeccion_lectura();
		pl.solicitarDatos();
		
	}
	public static void solicitarDatos()
	{
		
		Scanner tecla = new Scanner(System.in); 

		System.out.println("Estos son los libros diponibles en el momento");
		System.out.println("1. Ángeles y demonios");
		System.out.println("2. El codigo Da vinci");
		System.out.println("3. El simbolo perdido");
		System.out.println("4. Infierno");
		System.out.println("5. Origen");
		System.out.print("Digite el número del libro que desea leer: ");
		int libroElegido = tecla.nextInt();
		
		System.out.print("Cuantas paginas leera por día: ");
		int paginasDía = tecla.nextInt();
		System.out.println();
		double tiempo = calcularLectura(libroElegido, paginasDía);
		
		System.out.println("El tiempo de lectura estimado será de: "+tiempo+" días.");
		System.out.println("Presupueste el tiempo y difrite la lectura. :)");
	}
	public static double calcularLectura(int a, int b)
	{
		double tiempoLectura = 0;
		if (a<6) 
		{
			switch (a) 
			{
				case 1: tiempoLectura = (double) 606/b;
				break;
				case 2: tiempoLectura = (double) 704/b;
				break;
				case 3: tiempoLectura = (double) 650/b;
				break;
				case 4: tiempoLectura = (double) 720/b;
				break;
				case 5: tiempoLectura = (double) 690/b;
				break;
			}
		}
		else
		{
			System.out.println("Digito un codigo de libro errado");
			// solicitarDatos();
			System.exit(0);
		}
		return tiempoLectura;
	}
}
