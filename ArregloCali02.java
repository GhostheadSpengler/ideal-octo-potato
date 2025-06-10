package practicas;

import java.util.Scanner;

public class ArregloCali02 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("PROMEDIADOR");
        System.out.printf("Total de calificaciones a evaluar: ");
        var totalClif=Integer.parseInt(teclado.nextLine());

        var arreglo=new int[totalClif];
        //Se comienzan a meter los parametros dentro del arreglo, ya conociendo el lenght del mismo

        for (int i = 0; i <totalClif ; i++) {
            System.out.println("Introduce tus calificaciones: ");
//            var calif=Integer.parseInt(teclado.nextLine());
//            var calif=arreglo[i]; //Empiezan a guardarse aqui.
            arreglo[i]=Integer.parseInt(teclado.nextLine());
        }

        System.out.println(" PROMEDIO TOTAL ");

        var sumando=0;
        for (int i = 0; i <totalClif ; i++) {
            sumando+=arreglo[i];

        }
        var fin=sumando/totalClif;
        System.out.println("El promedio total de " +totalClif+ " es de: [ " + fin + "]");
    }
}

//Convertir el valor del teclado
//Hacer el arreglo que reciba como parametro el tamano del usuario
//Sumar los valores

