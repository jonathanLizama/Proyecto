/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesstring;

import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class FuncionesString {
public static int obtenerLongitud(String cadena){
		return cadena.length();
	}
	public static boolean compararCadenas(String cadena){
		return cadena.equals("Pedro");
	}
	
	public static char obtenerCaracter(String cadena, int posicion){
		return cadena.charAt(posicion);
	}
	public static int buscarPosicionCaracter(String cadena, char letra){
		return cadena.indexOf(letra);
	}
	public static String convertirAMayus(String cadena){
		return cadena.toUpperCase();
	}
	public static String convertirAMin(String cadena){
		return cadena.toLowerCase();
	}
	
	public static String obtenerSubCadena(String cadena, int init, int end){
		return cadena.substring(init, end);
	}
	public static String leerEntrada(){
		Scanner read = new Scanner(System.in);
		String lectura= read.nextLine();
		return lectura;
	}
	
	public static void ejecutarMenu(){
		boolean iteracion=true;
		System.out.println("Ingrese una palabra o nombre");
		String str=leerEntrada();
		while(iteracion){
			
			System.out.println("\n ¿Que desea hacer con esa palabra?"
					+ "\n\n\t 1- Obtener largo de cadena."
					+ "\n\t 2- Comparar con una cadena por default \"Pedro\"."
					+ "\n\t 3- Buscar posicion un caracter a elección."
					+ "\n\t 4- Buscar un caracter por su posicion"
					+ "\n\t 5- Convertir a Minuscula"
					+ "\n\t 6- Convertir a Mayuscula"
					+ "\n\t 7- Obtener sub cadena del 0 al 2"
					+ "\n\t cualquier otra cosa para salir.");
			String op= leerEntrada();
			int opc= Integer.parseInt(op);
			switch (opc){
				case 1 :
					System.out.println("El largo de la palabra "+str+" es : "+obtenerLongitud(str));
					break;
				case 2 :
					
					if(compararCadenas(str))
						System.out.println("Las cadenas son iguales usted ingreso Pedro");
					else
						System.out.println("Usted no ingreso Pedro, las cadenas no son iguales");
						
					break;
				case 3 :
					System.out.println("Ingrese una letra para buscar en la palabra");
					char aux= leerEntrada().charAt(0);
					System.out.println("la letra se encuentra en la posicion : "+buscarPosicionCaracter(str, aux));
					break;
				case 4 :
					System.out.println("El caracter en la posicion 3 es "+obtenerCaracter(str, 3));
					break;
				case 5 :
					System.out.println("La cadena en Minuscula es : "+convertirAMin(str));
					break;
				case 6 :
					System.out.println("La cadena en Mayuscula es : "+convertirAMayus(str));
					break;
				case 7:
					System.out.println("La subcadena del 0 al 2 es : "+obtenerSubCadena(str, 0, 2));
					break;
				default:
					System.out.println("Adios . . . .");
					iteracion=false;
					break;
			}
		}
	}
    
    public static void main(String[] args) {
        ejecutarMenu();
        
        
    }
    
}
