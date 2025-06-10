package practicas;

import java.util.*;
public class FitnessApli {

    /*               ************** SIN TERNARIO *********************      */

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        var CaloriasPromedio= .04;
        var pasosPromedio=10000;
        System.out.println(" ************** CALCULADORA FITNESS ************** \n");

        System.out.println("Ingresa tu nombre: ");
        var nombre=teclado.nextLine();
        System.out.println("Ingresa la cantidad de pasos que hoy realizaste: ");
        var pasos=Integer.parseInt(teclado.nextLine());
        if (pasos>=pasosPromedio){
            var CalQuem= CaloriasPromedio*pasos;
            System.out.println("Bien hecho " +nombre+" continua con tu rutina, vas bien. El total de Calorias quemadas fue de: " + CalQuem);
           }
        else {
            var CalQuem=CaloriasPromedio*pasos;
            System.out.println(nombre + " no has alcanzado el total de pasos requeridos. El minimo de calorias es de 400, y solo has logrado quemar: " + CalQuem);
        }
/*                    ********************  CON OPERACION TERNARIA ************************  */

        System.out.println(" \n ************** CALCULADORA FITNESS DOS************** \n");
        System.out.println("Ingresa tu nombre: ");
        var nom= teclado.nextLine();
        System.out.println("Ingresa el numero de pasos que realizaste el dia de hoy: \n");
        var steps=Integer.parseInt(teclado.nextLine());
        var quem= steps*CaloriasPromedio;

        var opcion= (steps>=pasosPromedio)? "Excelente " + nom+ " has quemado: " + quem : nom + " ,meta no alcanzada";
        System.out.println(opcion);


    }
}