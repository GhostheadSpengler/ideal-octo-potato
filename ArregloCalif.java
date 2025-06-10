package practicas;

import java.util.*;
public class ArregloCalif {
    public static void main(String[] args) {
        System.out.println("****** PROMEDIADOR DE EVALUACIONES ****** ");
        Scanner teclado=new Scanner(System.in);

//RECIBIENDO LA CANTIDAD DE EVALUACIONES Y CREANDO EL ARREGLO

        System.out.printf("Cuantas calificaciones se promediaran? : ");
        //Convierte el valor del usuario para el arreglo.
        int numero=Integer.parseInt(teclado.nextLine());
        //Se hace el arreglo y se recibe el parametro ya convertido.
        var arreglo=new int[numero];


// SE PEDIRAN LAS EVALUACIONES Y SE ITERARA SEGUN EL NUMERO QUE HA PUESTO EL USUARIO

        for (int i = 0; i <arreglo.length ; i++) {
            System.out.println("AHORA INTRODUCE LAS CALIFICACIONES");
            arreglo [i]=Integer.parseInt(teclado.nextLine());
        }

//SE PROMEDIARAN LAS CALIFICACIONES
        var sumatoria=0;
        for (int i = 0; i <numero ; i++) {
            sumatoria=sumatoria+arreglo[i]; //Sumando calificaciones
        }

        var promedio=sumatoria/numero; //Dividiendo el total
        System.out.println("Promedio de: " +promedio);

    }
}

/*

* 1. Se pide la cantidad de calificaciones a evaluar
2. Se convierte la informacion dada por el usuario.
3. Se hace el arreglo y se itera el valor introducido por el usuario
4. .
 */
