/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomantencion;

import java.util.Scanner;

/**
 *
 * @author 18626605-6
 */
public class ProyectoMantencion {//proyecto de pueba

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int sumador = 0;
        int length;
        String entrada;
        int[] arreglo;
        System.out.println("Ingrese numero romano (mayusculas)");
        entrada = leer.nextLine();
        length = entrada.length();
        arreglo = new int[length + 1];                     
        for (int i = 0; i < length; i++) {
            char letra;
            letra = entrada.charAt(i);
            if (letra == 'I') {
                arreglo[i] = 1;
            }
            if (letra == 'V') {
                arreglo[i] = 5;
            }
            if (letra == 'X') {
                arreglo[i] = 10;
            }
            if (letra == 'L') {
                arreglo[i] = 50;
            }
            if (letra == 'C') {
                arreglo[i] = 100;
            }
            if (letra == 'D') {
                arreglo[i] = 500;
            }
            if (letra == 'M') {
                arreglo[i] = 1000;
            }            
        }
        for (int i = 0; i < length; i++) {
            if (arreglo[i] < arreglo[i + 1]) {
                sumador = sumador + (arreglo[i + 1] - arreglo[i]);
                i++;
            } else {
                sumador = sumador + arreglo[i];
            }            
        }
        System.out.println("Su resultado es: " + sumador);
        // TODO code application logic here
    }
    
}
