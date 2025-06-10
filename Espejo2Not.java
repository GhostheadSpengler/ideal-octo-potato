package practicas;

import java.util.*;
public class Espejo2Not {
    public static void main(String[] args) {
        System.out.println("Casa de los Espejos");
        Scanner teclado=new Scanner(System.in);


        System.out.println("Espejos. Para poder tener acceso responde las siguientes preguntas\n");

        System.out.println("Eres mayor de 10 agnos? (True/False)\n");
        var edad=Boolean.parseBoolean(teclado.nextLine()); //Convierte la respuesta en Boolean

        System.out.println("Le temes a la Oscuridad? (True/False)\n");
        var Oscuridad= Boolean.parseBoolean(teclado.nextLine());

        /*Si NO tiene MAS diez agnos y ademas le teme a la oscuridad*/
        if(!edad && Oscuridad){
            /*Si es diferente de usuario, entonces ejecutara la accion. Decision inversa*/

            System.out.println("No tienes acceso");
        } else {
            System.out.println("Bienvenidx disfruta de tu aventurafal");
        }
    }

}
