/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoobd;

/**
 *
 * @author Jomico
 */
//creacion de la clase matriz con sus metodos
public class Matriz {
     private char[][] matriz;

     //creao el constructor que inicializa una matriz con el tamanio
     //tanto para filas y columnas
    public Matriz(int tamaño) {
        matriz = new char[tamaño][tamaño];
        inicializarMatriz();
    }

    //para rellenar la matriz inicial con un "*"
    private void inicializarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '*';
            }
        }
    }

    // imprimir solo la figura del triangulo con el caracter asignado
    //iterando solo las posiciones de i para que de la figura de un triangulo
    public void imprTrAscendente() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    //mismo metdodo que el de arriba solo que a la inversa
    public void imprTrDescendente() {
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    //metodo para reemplazar el tamanio actual de la matriz
    //e iniciar otra nueva
    public void cambiarTamaño(int nuevoTamaño) {
        matriz = new char[nuevoTamaño][nuevoTamaño];
        inicializarMatriz();
    }

    //llenar el triangulo con algun caracter que el usuario elija
    public void llenarTriangulo(char caracter) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j] = caracter;
            }
        }
        System.out.println("Triangulo lleno con el caracter '" + caracter + "'.");
    }
}