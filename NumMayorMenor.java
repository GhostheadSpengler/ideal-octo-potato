package practicas;

import java.util.*;
public class NumMayorMenor {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        var primero=Integer.parseInt(teclado.nextLine());
        System.out.printf("Introduce el Segundo numero: ");
        var segundo=Integer.parseInt(teclado.nextLine());

        if(primero>segundo){
            System.out.printf("El numero: " +primero+" es mayor a " + segundo);
        }

        else {
            System.out.printf("El numero: " +segundo+ " es mayor que " + primero);
        }
    }
}
