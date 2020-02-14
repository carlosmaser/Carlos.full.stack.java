package Estudio;
import java.util.Scanner;
public class Condicional_IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Escribe tu edad");
		
		int edad= scan.nextInt();

		//if(edad>=18) {
		 
			//System.out.println("Felicidades eres mayor de edad");
		//}
		
		//else {
			//System.out.println("eres menor de edad :( ");
		//}	
		
		if (edad<18){
			System.out.println("eres menor de edad");
		}
		else if (edad<40){
			
			System.out.println(" Eres un adulto joven ");
                }
		else if (edad<=65) {
			System.out.println(" Eres un adulto maduro ");
		
		}
		else {
			System.out.println(" Disfruta que queda poco ");
			
			
			}
			
	}
	}
