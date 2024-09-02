package TareaSemana3;
import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {
        // Declarar variable
        int calificacion;
        Scanner lectura = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese su calificación (0-100): ");
        calificacion = lectura.nextInt();
        
        // Proceso de datos
        if (calificacion >= 90) {
            System.out.println("Calificación: A");
        } else if (calificacion >= 80) {
            System.out.println("Calificación: B");
        } else if (calificacion >= 70) {
            System.out.println("Calificación: C");
        } else if (calificacion >= 60) {
            System.out.println("Calificación: D");
        } else {
            System.out.println("Calificación: F");
        }
    }
}