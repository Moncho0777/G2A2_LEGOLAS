import java.util.Scanner; 
import java.util.*;

public class DESVIACION_ESTARDAR
{

	public static void main(String[] args) {
		double promedio;
		double desviación_estándar;
		int n;
		double suma = 0;
		double divicion_suma;
		double operaciones;
		double total_multi = 0;
		double total;
		double numero_de_Deci;

		Scanner entrada = new Scanner (System.in) ;
		System.out.println ("Ingrese cantidad de numeros que desea calcular");
		n = entrada.nextInt();

		double datos [] = new double[n];
		for(int i = 0; i<n;i++)
			{
				System.out.println("Ingrese el numero: ");
				datos[i] = entrada.nextDouble();

			}
		
		for (double i: datos)
		suma = suma + i;
		divicion_suma = suma / n;

		for (int i=0; i <n; i++){
			operaciones = Math.pow(datos[i] - divicion_suma,2);
			total_multi = total_multi + operaciones;

			}
		total_multi = total_multi / (n-1);

		total = Math.sqrt(total_multi);
		numero_de_Deci = Math.rint(total*100)/100;
		System.out.println("La desviación estándar de esos números es: "+numero_de_Deci);

	}

}