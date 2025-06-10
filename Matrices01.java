package practicas;

import java.util.*;
class Matrices01{
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        System.out.printf("Introduce el numero de filas de la Matriz: ");
        var tamFilas=Integer.parseInt(teclado.nextLine());
        System.out.printf("Introduce el numero de Columnas de la Matriz: \n");
        var tamColumnas=Integer.parseInt(teclado.nextLine());

        System.out.println("                     \n");

        var matriz=new int[tamFilas][tamColumnas];

        for (int i = 0; i <tamFilas ; i++) {
            for (int j = 0; j <tamColumnas ; j++) {
                System.out.println("Introduce los valores de la Matriz. Filas ["+i+ "]" + "["+j+ "] =" );
                matriz[i][j]=Integer.parseInt(teclado.nextLine());
            }
                } //Nota: Habia metido el bucle de iteracion dentro del primer FOR , por eso habia un error repetitivo.

        for (int f = 0; f <tamFilas ; f++) {
            for (int k = 0; k < tamColumnas; k++) {
                System.out.println("Los valores de las Matrices son: " + matriz[f][k]);
            }
        }
    }
}

/*
1. Crear el arreglo y o el tamano de la matriz
2. Declarar los valores de la Matriz (filas y columna)*/