import java.util.Scanner;

public class Comparacion_Arreglos
{
	public static void main(String Args[])
	{
		System.out.println("Escuela de Administración de Negocios");
		System.out.println("Guía No. 1 Actividad 2");
		System.out.println("Proyecto en Grupo");
		System.out.println("Arreglos");
		System.out.println();
		
		Comparacion_Arreglos ca = new Comparacion_Arreglos();
		// Llamado del método
		ca.solicitarDatos(); 
		
	}
	public void solicitarDatos()
	{
		Scanner tecla = new Scanner(System.in);
		int [] arreglo_1;
		int [] arreglo_2;
		int [] arreglo_3;
		
		System.out.print("Digite el tamaño de la primera lista: ");
		int tamano_1 = tecla.nextInt();
		arreglo_1 = new int[tamano_1];
		int cual_1 = 1;
		
		System.out.print("Digite el tamaño de la segunda lista: ");
		int tamano_2 = tecla.nextInt();
		arreglo_2 = new int[tamano_2];
		int cual_2 = 2;
		
		System.out.println();
		
		arreglo_1 = deligenciasArreglos(arreglo_1, tamano_1, cual_1);
		arreglo_2 = deligenciasArreglos(arreglo_2, tamano_2, cual_2);
		
		// Comparar el largo del los arreglos y tomar el menor
		int tamano_3;
		if(arreglo_1.length > arreglo_2.length)
		{
			tamano_3 = arreglo_1.length;
		}
		else
		{
			tamano_3 = arreglo_2.length;
		}
		arreglo_3 = new int[tamano_3];
		arreglo_3 = compararArreglos(arreglo_1, tamano_1, arreglo_2, tamano_2, tamano_3);
		
		System.out.println("Los datos en común entre los vectores son: ");
			for(int i = 0; i < arreglo_3.length; i++)
			{
				if(arreglo_3[i]!=0)
				{
					System.out.println(arreglo_3[i]+" es un número en común");
				}
			}
	}
	public int[] deligenciasArreglos(int [] a, int b, int c)
	{
		Scanner tecla = new Scanner(System.in);
		int [] arreglo;
		arreglo = new int[b];
		for(int i = 0; i < b; i++)
		{
			System.out.print("Digite el contenido de la lista "+c+" ["+(i+1)+"]: ");
			arreglo[i] = tecla.nextInt();
		}
		System.out.println();
		return arreglo;
	}
	public int[] compararArreglos(int [] a1, int c3, int [] b2, int d4, int e5)
	{

		int [] resultadoComparacion;
		resultadoComparacion = new int[e5];

		for(int i = 0; i < c3; i++)
		{
			for(int j = 0; j < d4; j++)
			{
				if(a1[i] == b2[j])
				 {
					 resultadoComparacion[i]=a1[i];			
				 }
			}
		}
		return resultadoComparacion;
	} 
}
