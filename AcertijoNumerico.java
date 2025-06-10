package practicas;

import java.util.*;
public class AcertijoNumerico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        var userTry=0;
        var tryMax=3;
         Random aleatorio=new Random(); //Se llama al generador
        System.out.println("********** NUMERO ALEATORIO ************");
        var generado=aleatorio.nextInt(15)+1; //Se genera el numero aleatorio
        System.out.printf("Introduce el numero: ");
        var adivina=Integer.parseInt(teclado.nextLine()); //Se recibe y almacena el numero

        while(adivina!=generado && userTry<tryMax){

            if (adivina>generado){
                System.out.println("El numero generado es MENOR");
            }
             else if (adivina<generado) {
                System.out.println("El numero generado es MAYOR");
                }
            userTry++;
        }

        if (adivina==generado){
            System.out.println("Has acertado, lo has logrado en el " + userTry+" intento");
        } else {
            System.out.println("El numero oculto era: " + generado);
        }
    }
}




/* ADIVINAR EL NUMERO ALEATORIO

1. Generar el numero Aleatorio
2. Pedir que introduzca el numero y compararlo con el aleatorio*/