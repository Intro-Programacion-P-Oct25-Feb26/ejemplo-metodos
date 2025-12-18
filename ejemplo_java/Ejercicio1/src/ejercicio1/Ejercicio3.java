/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int numero = 1; numero <= 100; numero++) {

            System.out.printf("Verficiar el número: %d \n", numero);
            
            boolean valor = esPrimo(numero);

            if (valor) { // valor==true
                boolean valorSophieGermain = esSophieGermain(numero);
                if (valorSophieGermain) {
                    System.out.printf("El número %d es un primo de "
                            + "Sophie Germain.", numero);
                } 
            }

        }

    }

    // Método que verifica si un número es primo
    public static boolean esPrimo(int n) {
        int contador = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contador = contador + 1;
            }
        }

        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }

    // Método que verifica si un primo es de Sophie Germain
    public static boolean esSophieGermain(int p) {
        int valor = 2 * p + 1;
        return esPrimo(valor);
    }

}
