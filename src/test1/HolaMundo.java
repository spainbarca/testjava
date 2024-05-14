/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1;



import java.util.Scanner;

public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        
        // Declaraciones
        System.out.println("Ingrese su edad: ");
        int n1 = lectura.nextInt();
        System.out.println("Ingrese su número de avenida: ");
        int n2 = lectura.nextInt();
        
        System.out.println("Ingrese su estatura (en metros): ");
        float f1 = lectura.nextFloat();
        
        System.out.println("Ingrese su nombre: ");
        String s1 = lectura.next();
        System.out.println("Ingrese su equipo de futbol favorito: ");
        String s2 = lectura.next();
        
        
        //Operaciones
        float suma = n1+n2+f1;
       
        int max = n1;
        max = (n2 > n1) ? n2 : n1;
        
        float cociente = f1 / (n2%n1);
        
        
        //Salida
        System.out.println("La suma de los números es: "+suma);
        System.out.println("El número mayor es: "+max);
        System.out.println("El resultado de la división es: "+cociente);
        System.out.println("Las palabras son: "+s1+" y "+s2);
      }
}
