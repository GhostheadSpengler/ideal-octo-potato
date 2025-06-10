package practicas;

import java.util.Scanner;

import java.util.*;
public class Arreglos04 {

        public static void main(String[] args) {
            var teclado=new Scanner(System.in);

            System.out.println("Introduce el numero de tu arreglo: ");
            var tamArreglo=Integer.parseInt(teclado.nextLine()); //Convirtiendo los datos de la consola
            var arreglo=new int[tamArreglo]; //Creando el arreglo y especificando el parametro

            //Para que se puedan aceptar los parametros, es necesario hacer un ciclo de iteracion. El ciclo For debe conocer el numero de veces que se recorrera, y asi mismo guardar los valores dentro del arreglo.

            for (int i = 0; i <tamArreglo ; i++) {
                System.out.println("Introduce uno por uno los numeros de tu arreglo: ");
                arreglo[i]=Integer.parseInt(teclado.nextLine());
            }

            System.out.println(" NUMEROS IMPRESOS INTRODUCIDOS \n");

            //Se debe crear un ciclo, para poder imprimir los valores dentro de un arreglo. O bien, imprimirlos uno por uno, especificando la direccion del Stack y Heap

            for (int i = 0; i <tamArreglo ; i++) {
                System.out.println("Numero: " + arreglo[i]);

            }

        }
    }

