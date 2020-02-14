package Estudio;
import java.util.*;
public class Ejercicio_de_operaciones_basicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingresa tu numero");
		
		double numero_1= 0;
		Scanner entrada_1 =new Scanner(System.in);
		numero_1 = entrada_1.nextDouble();
		
		
		System.out.println("Ingresa otro numero");
		
		double numero_2 = 0;
		
		Scanner entrada_2 =new Scanner(System.in);
		numero_2 = entrada_2.nextDouble();
		
		System.out.println("Estos son los resultados al operar matematicamente");
		
		double suma= (int)(numero_1 + numero_2);
		double resta= (numero_1 - numero_2);
		double multiplicacion = (numero_1 * numero_2);
		double division= (numero_1 / numero_2);
		System.out.println("sumados = " + suma);
		System.out.println("restados = " + resta);
		System.out.println("multiplicados = " + multiplicacion );
		System.out.println("divididos = " + division);
		
		
	}

}
