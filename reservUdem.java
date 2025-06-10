package practicas;

import java.util.*;
public class reservUdem {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        var mar= 190.50;
        var sMar=150.50;
        var costoTotal=0.00;


        System.out.println("***** Sistema de Reserva Hotel Ritz ****** ");
        System.out.printf("""
                COSTO HABITACION 
                Vista al Mar: $190.50
                Sin Vista al Mar: 150.50""");
        System.out.println("\nIntroduce tu nombre completo: ");
        var nombre=teclado.nextLine();
        System.out.printf("Introduce el numero de dias de estancia: ");
        var dias=Integer.parseInt(teclado.nextLine());
        System.out.println("Deseas tu habitacion con vista al mar? (True/False)");
        boolean seleccion=Boolean.parseBoolean(teclado.nextLine());
        if(!seleccion){
            costoTotal= dias*sMar;
        } else{

            costoTotal= dias*mar;
        }

        /* ************ DETALLES DE LA RESERVACION **************** */
        System.out.printf(""" 
                \n ----------- DETALLES RESERVACION -------------- \n
                Nombre del Cliente: %s
                Dias de hospedaje: %d
                Costo Total por %d es de:  $%.2f
                Habitacion con Vista al Mar: %s
                """ ,nombre, dias,dias,costoTotal, seleccion ? "Si" : "No");

        /* String= S%
        * decimal= %d
        * flotante con limite de decimales(en este caso, solo dos decimales)= %.2f
        * Al ser booleano, se elige metodo ternario */
        
    }
}

/* ************ NOTAS **************
*
* En los detalles de reservacion, se llamaron e imprimieron los valores con su especificador de formato (%)
* para despues llamarlos con su nombre variable. Deben invocarse segun se requieran. Y finalmente, el ultimo al ser booleano, se hizo de forma ternaria*/
