package practicas;

import java.util.*;
public class SistCalifELSEiF {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println(" ****** CONVERSOR DE CALIFICACIONES ***** \n");
        System.out.printf("Ingresa la evaluacion numerica: ");
        var numero=Integer.parseInt(teclado.nextLine());
        String asignacion;

        if (numero==10 || numero==9){
            asignacion="A";

        } else if (numero==8){
            asignacion="B";

        } else if (numero==7){
            asignacion="C";
        } else if (numero == 6) {
            asignacion="D";
        } else if (numero==5) {
            asignacion="E";

        } else if (numero==4) {
            asignacion="F";
        } else {
            asignacion="Numero no valido";
        }
        System.out.println("La calificacion: " +numero+" es equivalente a: " + asignacion);
    }
}
