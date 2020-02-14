package Estudio;
import javax.swing.*;
public class DeterminarAreas {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int figura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tipo de figura geometrica:  \n1: cuadrado "
				+ "\n2: rectangulo  \n3: triangulo \n4: circulo"));
		
		switch (figura) {
		case 1:
			
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de un lado"));
			
			
			System.out.println("El Area de tu cuadrado es " + Math.pow(lado, 2));
			break;
			
		case 2: 
			
			int base=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la base "));
			
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la altura"));
			
			System.out.println("el valor de tu area es " + (base*altura));
			
			
			break;

		case 3:
			
			int baset=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base de su triangulo"));
			
			int alturat=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura de triangulo"));
			
					System.out.println("El area del triangulo es " + ((baset*alturat)/2 ));
	
			break;
			
		case 4: 
			
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio de su circulo"));
			
			System.out.println("El area de su circulo es ");
			System.out.printf("%1.2f" , Math.PI*(Math.pow(radio , 2)));
			
			
			break;
		default:
			
			System.out.println("La opcion ingresada no es correcta");
		}
		
		
	}

}
