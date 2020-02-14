
package Estudio;

import java.util.*;
public class Scanner_x {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Escribe tu numero ");
		Scanner entrada_num= new Scanner(System.in);
		int numero_prueba = entrada_num.nextInt();
		
		System.out.println("tu numero es " + numero_prueba);
		
		
		for (int i = 0; i < 20; i++) {
			System.out.print("-");
		}
		System.out.println("");
			
		System.out.println("Escribe tu palabra");
		Scanner scam_letras = new Scanner(System.in);
		String entrada_letras= scam_letras.nextLine();
		
		System.out.println("Tu palabra es " + entrada_letras);
		
		
		
	}

}
