package practicas;

import java.util.*;
public class SwitchCorto {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero=0;
        System.out.println("Escribe el dia de la semana que deseas conocer: ");
        String nombre=teclado.nextLine();
        numero=switch (nombre){ //nombre= dia a evaluar
            case "Lunes"-> 1;
            case "Martes" ->2;
            case "Miercoles" ->3;
            case "Jueves" -> 4;
            case "Viernes" -> 5;
            case "Sabado" -> 6;
            case "Domingo" ->7;
            default -> throw new IllegalStateException("Unexpected value: " + nombre);
        };
        System.out.println(" El dia " +numero+ " es " + nombre);

        System.out.println("********** SEMANARIO CON NUMERO *********** \n");
        System.out.printf("Introduce el numero de la semana que deseas conocer: ");
        String nombreAsignado;
        var conNumero=Integer.parseInt(teclado.nextLine());
        nombreAsignado= switch(conNumero){
            case 1->"Domingo";
            case 2->"Lunes";
            case 3-> "Martes";
            case 4->"Miercoles";
            default -> "No Valido";
        };
        System.out.println("El dia " +nombreAsignado+ " es "+ conNumero);
        }

    }

