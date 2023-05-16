/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclomedia;

import java.util.Scanner;


/**
 *
 * @author SAC2-5
 */
public class CicloMedia {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 0;
        double suma = 0;
        boolean continuar = true;

        System.out.println("CicloMedia - Cálculo de la media de un conjunto de números");

        while (continuar) {
            System.out.print("Ingresa un número (o ingresa 0 para calcular la media): ");
            double numero = scanner.nextDouble();

            if (numero == 0) {
                continuar = false;
            } else {
                suma += numero;
                totalNumeros++;
            }
        }

        if (totalNumeros > 0) {
            double media = suma / totalNumeros;

            System.out.println("Conjunto de números ingresados: ");
            System.out.println("------------------------------");

            // Reiniciamos el valor de continuar para mostrar los números ingresados
            continuar = true;
            double numero;
            while (continuar) {
                System.out.print("Ingresa un número (o ingresa 0 para salir): ");
                numero = scanner.nextDouble();

                if (numero == 0) {
                    continuar = false;
                } else {
                    System.out.println(numero);
                }
            }

            System.out.println("------------------------------");
            System.out.printf("Media: %.2f%n", media);
        } else {
            System.out.println("No se ingresaron números para calcular la media.");
        }
}
}