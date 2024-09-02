/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaSemana3;
import java.util.Scanner;
public class Programa2 {
    public static void main(String[] args) {
        // Declarar variable
        int numero;
        Scanner lectura = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese un número: ");
        numero = lectura.nextInt();
        
        // Proceso de datos
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}