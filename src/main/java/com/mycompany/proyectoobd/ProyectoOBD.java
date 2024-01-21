/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectoobd;

import java.util.Scanner;

/**
 *
 * @author Jomico JHON DAVID BURGOS PANTA
 */
public class ProyectoOBD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz (MxM): ");
        int tam = sc.nextInt();

        Matriz mTriangulo = new Matriz(tam);

        int op;

        do {
            System.out.println("\n***** MENÚ *****");
            System.out.println("1. Llenar Triangulo con Caracter");
            System.out.println("2. Mostrar Triangulo Ascendente");
            System.out.println("3. Mostrar Triangulo Descendente");
            System.out.println("4. Cambiar Tamaño de la Matriz");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese el caracter para llenar el triangulo: ");
                    char caracter = sc.next().charAt(0);
                    mTriangulo.llenarTriangulo(caracter);

                    break;
                case 2:
                    mTriangulo.imprTrAscendente();

                    break;
                case 3:
                    mTriangulo.imprTrDescendente();

                    break;
                case 4:
                    System.out.print("Ingrese el nuevo tamaño de la matriz (MxM): ");
                    int nuevoTamaño = sc.nextInt();
                    mTriangulo.cambiarTamaño(nuevoTamaño);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, seleccione una opcion del 1 al 5.");
            }
        } while (op != 5);
    }
}
