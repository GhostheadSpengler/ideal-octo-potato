package practicas;

import java.util.*;
public class Semanario {
    public static void main(String[] args) {
        System.out.println("*********** SEMANARIO *********** \n");
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el numero del dia: ");
        var dia=Integer.parseInt(teclado.nextLine());
        var cadena="";
        switch(dia){
            case 1:
                cadena="Lunes";
                break;
            case 2:
                cadena="Martes";
                break;
            case 3:
                cadena="Miercoles";
                break;
            case 4:
                cadena="Jueves";
                break;
            case 5:
                cadena="Viernes";
                break;
            case 6:
                cadena="Sabado";
                break;
            case 7:
                cadena="domingo";
                        break;
        }
        System.out.printf("""
                El dia %d es %s""",dia,cadena);

         

    }
}
