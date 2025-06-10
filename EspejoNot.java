package practicas;

import java.util.*;
public class EspejoNot {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
        System.out.println("Ingreso a Espejos\n");
        System.out.println("Ingresa tu edad: ");
        var edad=Integer.parseInt(teclado.nextLine());

        System.out.println("Le temes a la Oscuridad? (True/False)");
        var bool=Boolean.parseBoolean(teclado.nextLine());

        if(!bool && edad>=10){

        }

    }
}
