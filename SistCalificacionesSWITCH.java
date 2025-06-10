package practicas;

import java.util.*;
public class SistCalificacionesSWITCH {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println(" ******** CONVERSOR DE CALIFICACIONES ******** \n");
        System.out.printf("Introduce la calificacion: ");
        String letra;
        var calificacion=Integer.parseInt(teclado.nextLine());

        letra=switch (calificacion){
            case 10-> "A";
            case 9,8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            case 5 -> "E";
            case 4,3,2,1 ->"F";
            default -> "Invalido";
        };
        System.out.println("La evaluacion de " + calificacion + " es equivalente a: " + letra);
    }
}
