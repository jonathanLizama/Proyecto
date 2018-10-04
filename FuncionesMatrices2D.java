/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesmatrices2d;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class FuncionesMatrices2D {

  public static void burbuja(int [][]A, int filas, int columnas, int columnaQueInteresaOrdenar){
        for(int i = 0; i < filas-1; i++)
            {
                for(int j = i+1; j < filas; j++)
                {
                    if (A[j][columnaQueInteresaOrdenar] > A[i][columnaQueInteresaOrdenar])
                    {
                        for(int r=0;r<columnas;r++){
                        int tmp = A[i][r];
                        A[i][r] = A[j][r];
                        A[j][r] = tmp;
                        }
                    }
                }
            }
    }
   public static void mostrarArreglo2dim(int [][] a, int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("["+a[i][j]+"]"+"\t");
            }
            System.out.println("");
        }
    }
    public static void mostrarArreglo2dim(String [][] a, int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("["+a[i][j]+"]"+"\t");
            }
            System.out.println("");
        }
    }
     public static void llenarArreglo2dim(int [][] a, int filas, int columnas, Random r){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                a[i][j]=r.nextInt(10);
            }
        }
    }
    
    //Funcion para llenar un arreglo de letras, con letras al azar. Se crea otro arreglo que contiene las letras. 
    public static void llenarArreglo2dim(String [][] a, int filas, int columnas, Random r){
        String abecedario[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","v","w","x","y","z"};
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int random=r.nextInt(abecedario.length);
                a[i][j]=abecedario[random];
            }
        }
    }
    public static int sumarArreglo2dim(int [][] a, int filas, int columnas){
        int suma=0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma=a[i][j]+suma; 
            }       
        }
        return suma;
    }
    
    //Calcula el promedio del arreglo de 2 dimensiones, entre el numero de filas, columnas, y la suma que se obtiene del anterior
    public static double promArreglo2dim(int filas, int columnas, int sumaDelArreglo){
        return sumaDelArreglo/(filas*columnas);
    }
    public static void main(String[] args) {
       int n=0;
        int p=0;
        int m=0;
        
        //Usando las funciones
        
        //inicializo los "objetos" a utilizar, el scanner se llama "leer", el random "azar"
        Scanner leer = new Scanner(System.in);
         Random azar = new Random();
         //------------------------------------------------------------------------------------------------------------------------- 
       //Genero arreglos de 2 dimensiones, el primero de tamaño 10x4, el segundo tamaño m*p y el tercero de tipo String de tamaño 5x5
        int arr1dim2[][] = new int[10][4];
        
        System.out.println("Ingrese tamaño matriz de dos dimensiones");
        while(m<1){
        System.out.println("Filas");
        m=leer.nextInt();
        }
        while(p<1){
        System.out.println("Columnas");
        p=leer.nextInt();
        }
        int arr2dim2[][]= new int[m][p];
        
        String arr3dim2[][] = new String[5][5];
       //Fin inicializacion arreglos de 2 dimensiones 
      
     //------------------------------------------------------------------------------------------------------------------------------------
     //llenamos las matrices de dos dimensiones
       llenarArreglo2dim(arr1dim2,10,4,azar);
        llenarArreglo2dim(arr2dim2,m,p,azar);
        llenarArreglo2dim(arr3dim2,5,5,azar);
        
      //----------------------------------------------------------------------------------------------------------------------------------------
      // ahora mostramos cada matriz
      System.out.println("MATRIZ DE 2 DIMENSIONES N°1");
        mostrarArreglo2dim(arr1dim2,10,4);
      System.out.println("");
        System.out.println("MATRIZ DE 2 DIMENSIONES N°2");
        mostrarArreglo2dim(arr2dim2,m,p);
      System.out.println("");
        System.out.println("MATRIZ ALFABETICA");
         mostrarArreglo2dim(arr3dim2,5,5);
      System.out.println("");
      
      //Listo se mostraron todos.
      
      //-------------------------------------------------------------------------------------------------------------------------------------------------------
      //Ahora calcular promedio y suma de los arreglos que sean int
      //Como estos retornan, al hacer la funcion devuelve un numero entero, por eso lo guardo en una variable entera para luego trabajarla.
      int suma21=sumarArreglo2dim(arr1dim2,10,4);
      int suma22=sumarArreglo2dim(arr2dim2,m,p);
        
      //--------------------------------------------------------------------------------------------------------------------------------------------------------
      //listo la suma ahora promedio, lo calcula la funcion y devuelve un DOUBLE, asi que lo guardo en un double
      double prom21=promArreglo2dim(10,4,suma21);
      double prom22=promArreglo2dim(m,p,suma22);
      
      //--------------------------------------------------------------------------------------------------------------------------------------------------------
      //listo ahora muestro los resultados
      
      System.out.println("RESULTADOS");
      System.out.println("Suma matriz N°1: "+suma21+" , Promedio: "+prom21);
      System.out.println("Suma matriz N°2: "+suma22+" , Promedio: "+prom22);
      
       System.out.println("---------------------------------------------------------------------------");
                                                                                                      
      System.out.println("MATRIZ N°1 SIN ORDENAR");
        mostrarArreglo2dim(arr1dim2,10,4);
        System.out.println("");
         burbuja(arr1dim2,10,4,0);
        System.out.println("MATRIZ N°1 ORDENADA");
        mostrarArreglo2dim(arr1dim2,10,4);
       System.out.println("");
      System.out.println("MATRIZ N°2 SIN ORDENAR");
        mostrarArreglo2dim(arr2dim2,m,p);
      System.out.println("");
      burbuja(arr2dim2,m,p,0);
      System.out.println("MATRIZ N°2 ORDENADA");
        mostrarArreglo2dim(arr2dim2,m,p);
      System.out.println("");
      
      //FIN
      
    }
    
}
