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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese un número para verificar: ");
        numero = entrada.nextInt();
        boolean valor = esPrimo(numero);

        if (valor) { // valor==true
            boolean valorSophieGermain = esSophieGermain(numero);
            if (valorSophieGermain) {
                System.out.printf("El número %d es un primo de "
                        + "Sophie Germain.", numero);
            } else {
                System.out.printf("El número %s NO es un primo de "
                        + "Sophie Germain.", numero);
            }
        } else {
            System.out.printf("El número %s ingresado "
                    + "NO es primo.", numero);
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
