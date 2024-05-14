/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package letranif;

import java.util.Scanner;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        
        // Declaraciones
        System.out.println("Ingrese su DNI: ");
        int dni = lectura.nextInt();
        
        char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
                        'D', 'X', 'B', 'N', 'J', 'Z', 'S',
                        'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
        
        int cont = dni % 23;
        
        System.err.println("La letra NIF es: "+dni+letras[cont]);
    }
    
}
