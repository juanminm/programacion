/*
 * 1. Escribe un programa que solicite la edad de una persona y muestre un
 * mensaje por pantalla indicando si es mayor de edad o no.
 */

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
import java.util.Scanner;

public class Ejercicio02UD2_A01 {
    public static void main(String[] args) {
        int edad;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        edad = scan.nextInt();
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}
