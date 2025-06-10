package practicas;

import java.util.*;
public class EnvioPaquet {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        var nacional=10;
        var internacional=20;

        System.out.println(" \n******** SISTEMA DE ENVIO DE PAQUETERIA NACIONAL E INTERNACIONAL ******** \n");
        System.out.printf("""
                Costo de envio:
                
                1. Nacional: $10 x Kg
                2. Internacional: $20 x Kg 
                
                ****************************** ********************** \n""");

        System.out.printf("Introduce el numero de envio de tu interes a cotizar: ");
        var envio=Integer.parseInt(teclado.nextLine());


        switch (envio){
            case 1:
                System.out.printf("Introduce el peso estimado de tu paquete: ");
                float peso=Float.parseFloat(teclado.nextLine());
                var total=peso*nacional;
                System.out.println("El costo de envio por tu paquete de: "+peso+" Kg es de: " + total + " pesos.");
                break;

            case 2:

                    System.out.printf("Introduce el peso estimado de tu paquete: ");
                    float pesoDos=Float.parseFloat(teclado.nextLine());
                    var totalDos=pesoDos*nacional;
                    System.out.println("El costo de envio por tu paquete de: "+pesoDos+" es de: " + totalDos + " pesos.");
                    break;

            default:
                System.out.println("Opcion no Valida");
        }

        System.out.println(" \n *************** ***************** *****************\n");
        System.out.println("              UDEMY SOLUCION             ");

        System.out.printf(" Escribe el tipo de cotizacion que deseas (Nacional/ Internacional): ");
        var texto= teclado.nextLine().strip().toLowerCase();
        /*Stripe elimina cualquiera de los espacios, ya sea al final o al comienzo*/

        System.out.printf("Ingresa el peso en Kg: ");
        var pesando=Double.parseDouble(teclado.nextLine());

        /* SWITCH TERNARIO*/

        /*var*/ Double presupuesto=switch(texto){ /*No se puede asignar un NULL a una variable de tipo VAR, por lo que se cambio al tipo Double*/
            case "internacional"-> pesando*internacional;
            case "nacional" -> pesando*nacional;
            default -> {
                    /* Al devolver un valor Double, se especifica con YIELD NULL que justamente retornara un valor NULO y enviara el mensaje de opcion No valida. Ademas se ENCAPSULO EN CORCHETES EL DEFAULT */
                    System.out.println("Opcion no valida");
                    yield null;}
        };
         if(presupuesto!=null){
             System.out.printf("La cotizacion de tu viaje es de: $%.2f",presupuesto);
             //Marco un error al imprimir con PRINTLN, se cambio a Frintf

        }
    }
}
