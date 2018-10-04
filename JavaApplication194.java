/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication194;

import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class JavaApplication194 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String contraseña = null;
       String rut = null;
        
      String matriz[][]= new String[3][3];
      llenar_Datos(matriz);
      mostrar_Datos(matriz);
      validar_Ingreso(matriz, rut, contraseña);
     // deString_Entero(matriz);
      
       
        
        
    }
    public static void mostrar_Datos(String matriz[][]){
        System.out.println("    Rut      Saldo  Clave");
        for (int i =0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print("["+matriz[i][j]+"]");
                
            }
            System.out.println("");
        }
        
    }
    public static void primeraColumna(String matriz[][]){
        System.out.println("");
        for (int i= 0;i<matriz[0].length;i++) {
            
        }
        System.out.println("");
    }
    
    
    //METODO PARA PASAR DE STRING A ENTERO
    public static void deString_Entero(String matriz [][]){
      
        llenar_Datos(matriz); 
       int arreglo [] = new int [matriz.length];
        for (int  i=0;i<arreglo.length;i++) {
          arreglo[i]= Integer.parseInt(matriz[i][1]);
            System.out.println(""+arreglo[i]);
        }
        
    
       
    }
    
    public static void llenar_Datos(String matriz[][]){
        String cadena[][]= {{"19285197-1","32000","1345"},{"15345672-3","50000","1234"},{"15235656-4","20000","1996"}};
         for (int i=0;i<3;i++) {
             for (int j=0;j<3;j++) {
                 matriz[i][j]= cadena[i][j];
             } 
         }
         
    }
    
    //METODO PARA VALIDAR EL INGRESO DE NUESTROS CLIENTES:
    
    public static void validar_Ingreso(String matriz[][], String rut, String contraseña){
        Scanner leer = new Scanner(System.in);
        
        
        primeraColumna(matriz);
        boolean encontrado_rut = false;
        boolean encontrado_contraseña = false;
        for (int i=0;i<1;i++) {
        for (int j=0;j<1;j++) {
        System.out.println("");
        System.out.println("Ingrese un rut: ");
        rut = leer.nextLine();             
        if (rut.equals(matriz[i][0])){
            
            System.out.println(" Rut Validado");
            encontrado_rut = true;
              System.out.println("Ingrese Contraseña");
              contraseña = leer.nextLine(); 
              if (contraseña.equals(matriz[i][2])){
                  System.out.println("Acceso Permitido");
                   encontrado_contraseña = true;
                  
              }
                  if(!encontrado_contraseña)
                  System.out.println("Acceso Rechazado");
                  
              }
        }
        }
            if(!encontrado_rut)
            System.out.println("Usuario no existe");
           
        }
                
      }       
   
          

