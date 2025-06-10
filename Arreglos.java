package practicas;

import java.util.*;
public class Arreglos {
    public static void main(String[] args) {
        int[] arr={2,45,5,3,4};
        System.out.println(arr); //Asi, imprime la direccion fisica heap. Usar metodo ToString.
        System.out.println("Anotando con metodo:  "+Arrays.toString(arr)); //Aca ya se imprimio el dato requerido con el metodo adecuado
        System.out.println("Anotando directamente la ubicacion"+ arr[1]);

        System.out.println("Iterando e imprimiendo con ciclo FOR");
        for (int i = 0; i<arr.length ; i++) { //Los arreglos son OBJETOS asi que poniendo el punto, se accede a ciertos metodos y propiedades. En este caso medira el arreglo.
            System.out.println("Imprimiendo con la iteracion For: " + arr[i]); //MODO CORRECTO

            System.out.println("Imprimiendo con la iteracion For: " + arr.length); //ERROR MIO
            System.out.println("Imprimiendo con la iteracion For: " + i); //ERROR MIO
            
        }

    }
}

/*
Informacion sobre el METODO ValueOf y ToString:
https://www.freecodecamp.org/espanol/news/como-imprimir-arreglos-en-java/ */