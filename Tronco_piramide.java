import java.util.Scanner;
import java.text.DecimalFormat;

public class Tronco_piramide
{
	public static void main(String args[])
	{	
		System.out.println("Escuela de Administraciï¿½n de Negocios");
		System.out.println("Guï¿½a No. 1 Actividad 1");
		System.out.println("Tronco Piramide");
		System.out.println();
		
		Tronco_piramide tp = new Tronco_piramide();
		tp.solicitarDatos();
	}
	
	public void solicitarDatos()
	{
		Scanner teclado = new Scanner(System.in);
		// mï¿½todo para formatear los numeros evocando formato
		DecimalFormat formato = new DecimalFormat("0.00");
		
		int ladoInferior, ladoSuperior, altura;
		System.out.print("Digite el lado de la base inferior: ");
		ladoInferior = teclado.nextInt();
		System.out.print("Digite el lado de la base superior: ");
		ladoSuperior = teclado.nextInt();
		System.out.print("Digite la altura de la pieza: ");
		altura =  teclado.nextInt();
		System.out.println();
		
		// En la variable areaInferior y areasuperior se guarda lo que devuelva el mï¿½todo calcularArea
		// al cual le enviamos el valor de los lados
		int areaInferior = calcularArea(ladoInferior);
		int areaSuperior = calcularArea(ladoSuperior);
		System.out.println("El area de la base inferior es: "+areaInferior);
		System.out.println("El area de la base superior es: "+areaSuperior);
		
		int perimetroInferior = calcularPerimetro(ladoInferior);
		int perimetroSuperior = calcularPerimetro(ladoSuperior);
		System.out.println("El perimetro del lado inferior: "+perimetroInferior);
		System.out.println("El perimetro del lado superior: "+perimetroSuperior);
		
		double hipotenusa = calcularHipotenusa(ladoInferior, ladoSuperior, altura);
		System.out.println("La hipotenusa es: "+formato.format(hipotenusa));
		System.out.println();
		
		double areaTotal = calcularAreaTotal(areaInferior, areaSuperior, hipotenusa, perimetroSuperior, perimetroInferior);
		System.out.println("El area total es: "+formato.format(areaTotal));
		
		double volumen = calcularVolumen(areaInferior, areaSuperior, altura);
		System.out.println("El volumen total es: "+formato.format(volumen));
	}
	//Mï¿½todo para calcular el-las areas recibe el valor de lado, el que esa en el momento de instanciar el mï¿½todo 
	public static int calcularArea(int lado)
	{
		int area = lado * lado;
		return area;
	}
	//Mï¿½todo para calcular el perimetro
	public static int calcularPerimetro(int lado)
	{
		int perimetro = lado*4;
		return perimetro;
	}
	//Mï¿½todo para caulcular la hipotenusa
	public static double calcularHipotenusa(int ladoInferior, int ladoSuperior, int altura)
	{
		int deltaLados = (ladoSuperior - ladoInferior) / 2;
		double hipotenusa = Math.sqrt(Math.pow(deltaLados, 2)+Math.pow(altura, 2)); 
		return hipotenusa;
	}
	//Mï¿½todo para calcular el area total
	public static double calcularAreaTotal(int areaInferior, int areaSuperior, double hipotenusa, int perimetroSuperior, int perimetroInferior)
	{
		double areaTotal = areaInferior + areaSuperior + ((perimetroSuperior+perimetroInferior)/2) + hipotenusa;
		return areaTotal;
	}
	//Mï¿½todo para calcular el volumen
	public static double calcularVolumen(int areaInferior, int areaSuperior, int altura)
	{
		double volumen = (altura/3)*(areaInferior+areaSuperior+(Math.sqrt(areaInferior+areaSuperior)));
		return volumen;
	}
}
