/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.introarrays;

/**
 *
 * @author FER
 */
public class IntroArrays {
/**
 *@param args the command line arguments 
 */
         
    public static void main(String[] args) {
        //TODO code application logic here 
        //Declaracion del arreglo
        int[] numeros;
        //Inicializar el arreglo con valores 
        numeros=new int[5];
        
        
        //valores 
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=30;  
        numeros[3]=40;  
        numeros[4]=50;  
        
       // imprimir los valores del arreglo arrays
        System.out.println("El elemento de indice es 0: "+ numeros[0]);
        System.out.println("El elemento de indice es 1: "+ numeros[1]);
        System.out.println("El elemento de indice es 2: "+ numeros[2]);
        System.out.println("El elemento de indice es 3: "+ numeros[3]);
        System.out.println("El elemento de indice es 4: "+ numeros[4]);
        
        //SUMA estatica elemento por elemento
        //int suma=numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4];
       // System.out.println("La suma de Array es: " + suma);
       
       //Sumatoria en ciclo for 
       int suma=0;
       for(int i=0; i<numeros.length;i++){
           suma+=numeros[i];
            
       }
       System.out.println("La suma con cliclo for"+suma);
    }
}
