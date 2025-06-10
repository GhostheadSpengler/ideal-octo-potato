package practicas;

import java.util.*;
public class ReservaHotel {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        var sinMar=150.50;
        var conMar=190.50;

        System.out.println("******** SISTEMA RESERVA DE HOTEL ********\n");
        System.out.println("""
                Costo Habitacion
                
                1. Vista al Mar: $190.50 por Dia. \n
                2. Sin Vista al Mar: $150.50 por Dia \n""");

        System.out.println("Si deseas una habitacion con vista al mar presiona 1, en caso contrario presiona 0.");

        int habitacion= Integer.parseInt(teclado.nextLine());

        /* ********************  CON CONDICIONAL ************** */

        if (habitacion==1){
            System.out.println("Ingresa el numero de dias de estadia: ");
            int dias=Integer.parseInt(teclado.nextLine());
            var total= dias*conMar;
            System.out.println("La cotizacion estimada por tu hospedaje es de: " + total);
            }
        else {
            System.out.println("Ingresa el numero de dias de estadia: ");
            var dias=Integer.parseInt(teclado.nextLine());
            var total= dias*sinMar;
            System.out.println("La cotizacion estimada por tu hospedaje es de: " + total);
        }
        /* ********************  CON BOOLEAN ************** */
        
        System.out.println("Escribe False en caso de no requerir una habitacion con vista al mar");
        boolean eleccion=Boolean.parseBoolean(teclado.nextLine());
        if(!eleccion){
            System.out.println("Introduce el numero de dias que estaras con nosotros: ");
            int dias=Integer.parseInt(teclado.nextLine());
            var total= dias*sinMar;
            System.out.println("El costo de tu estancia es de: " + total);
        }
        else{
            System.out.println("Introduce el numero de dias que estaras con nosotros: ");
            int dias=Integer.parseInt(teclado.nextLine());
            var total= dias*conMar;
            System.out.println("El costo de tu estancia es de: " + total);
        }
    }
}