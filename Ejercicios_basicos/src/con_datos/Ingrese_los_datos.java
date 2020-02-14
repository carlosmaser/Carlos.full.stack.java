package con_datos;
import java.util.Scanner;
public class Ingrese_los_datos {

	public static void main(String[] args) {
		
		
				//En las siguientes lineas se solicita un numero al usuario y se guarda en la variable "numero"
		
			  Scanner entrada = new Scanner(System.in); 
			    System.out.println("Ingrese Numero de 0 a 9 ...: "); 
			    int numero = entrada.nextInt();  
			    
			    //Aqui comienza la estructura del ciclo, se comienza con un do, luego se realizan las acciones que estan entre "{}" mientras se cumpla la condicion indicada luego del while
			     
			    do {
				  System.out.println("Número es ...: "+numero); //Se muestra número procesado
				  numero = numero+1; //Se incrementa valor de número
			  }
				  while (numero < 11); //
		}
			
		}
