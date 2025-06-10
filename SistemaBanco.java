package practicas;

import java.util.*;
public class SistemaBanco {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("***** BANCO PANAMERICANO ***** \n");
        System.out.println("Notificacion: Si deseas ser parte de nuestra base de datos presiona escribe Yes, de lo contrario escribe No.");

        var salirSistema=Boolean.parseBoolean(teclado.nextLine());

        if(!salirSistema){
            System.out.println("Gracias por permanecer con nosotros, tus datos seran renovados");
        } else {
            System.out.println("Tu registro sera eliminado. Gracias");
        }
    }
}
