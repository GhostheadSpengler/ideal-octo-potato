package practicas;

import java.util.*;
public class MatrizDiagonal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        var sumando=0;

        var arreglo = new int[3][3]; //determinando el tamano del arreglo matriz

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                System.out.printf("Introduce los valores de la Matriz: ["+ i+ "]"+"[" + j+ "] = ");
                arreglo [i][j]=Integer.parseInt(teclado.nextLine());  //Se guardan los Valores

                }
             }
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (i==j){
                    sumando+=arreglo[i][j];
                }
            }
         }
        System.out.println("La suma Diagonal de la matriz es: " + sumando);
      }
   }


/*
Realizar una Matriz de 3x3
Solicitar valores por usuario
La suma es diagonal, esta se va a condicionar, siempre y cuando los valores del indice coincidan.
 */
