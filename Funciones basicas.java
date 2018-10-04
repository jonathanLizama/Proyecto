/*
 * Este progrma ofrece una calculadora con las cuatro operaciones básicas
 *
 */
package calcfunciones;
import java.util.Scanner;

public class CalcFunciones {

    public static void main(String[] args) { 
    /*Dado que se trabajará con funciones (el trabajo lo realizarán las funciones), 
     *el programa principal solo contendrá el llamado a la función menu, la cual derivará
     *las distintas operaciones a las funciones correspondientes.
     */
        
        menu();
    }
    
    /* Esta función contiene la presentación de un menú para realizar las cuatro operaciones básicas
     * y hace el llamado a las funciones dependiendo de la operación escogida por el usuario
     */
    public static void menu(){
        int opc;
        
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- División");
            System.out.println("5.- Salir");
            System.out.println("Ingrese su opción: ");
            opc = leer.nextInt();
            switch(opc){
                case 1: funcSuma(leer); //llamado a la función suma, se entrega el objeto leer para la lectura
                    break;
                case 2: funcResta(leer); //llamado a la función resta, se entrega el objeto leer para la lectura
                    break;
                case 3: funcMult(leer); //llamado a la función multiplicación, se entrega el objeto leer para la lectura
                    break;
                case 4: funcDiv(leer); //llamado a la función división, se entrega el objeto leer para la lectura
                    break;
                default: break;
            }
        
        }while(opc!=5);
        System.out.println("Gracias por su preferencia");
    }
    
    /*Función que Multiplica dos número enteros - Esta función recibe como parámetro el objeto leer, 
     * del tipo Scanner, para realizar las lecturas de los números a multiplicar.
     */
    public static void funcMult(Scanner leer){
        int num1,num2,res;
        
        num1 = funcLeer(leer);
        num2 = funcLeer(leer);
        res = num1*num2;
        System.out.println("El resultado de la Multiplicación es: "+res);
    }
    
    /*Función que Suma dos número enteros - Esta función recibe como parámetro el objeto leer, 
     * del tipo Scanner, para realizar las lecturas de los números a sumar.
     */
    public static void funcSuma(Scanner leer){
        int num1,num2,res;
        
        num1 = funcLeer(leer);
        num2 = funcLeer(leer);
        res = num1+num2;
        System.out.println("El resultado de la Suma es: "+res);
    }
    
    /*Función que Multiplica dos número enteros - Esta función recibe como parámetro el objeto leer, 
     * del tipo Scanner, para realizar las lecturas de los números a restar.
     */
    public static void funcResta(Scanner leer){
        int num1,num2,res;
        
        num1 = funcLeer(leer);
        num2 = funcLeer(leer);
        res = num1-num2;
        System.out.println("El resultado de la Resta es: "+res);
    }
    
    /*Función que Divide dos número enteros - Esta función recibe como parámetro el objeto leer, 
     * del tipo Scanner, para realizar las lecturas de los números a Dividir. Esta función
     * valida que el denominador sea distinto de cero
     */
    public static void funcDiv(Scanner leer){
        int num1,num2;
        float res;
        
        num1 = funcLeer(leer);
        do{
            num2 = funcLeer(leer);
            if (num2==0)
                System.out.println("El denominador debe ser distinto de cero");
        }while(num2==0);
        res = num1/num2;
        System.out.println("El resultado de la División es: "+res);
    }
    
    /*Esta función lee un número entero - recibe como parámetro el objeto leer, 
     * del tipo Scanner, para realizar la lectura del número.
     */
    public static int funcLeer(Scanner leer){
        int num;
        
        num = leer.nextInt();
        return num;
    }
}
