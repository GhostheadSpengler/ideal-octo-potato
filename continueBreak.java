package practicas;

import java.util.*;
public class continueBreak {
    public static void main(String[] args) {
        System.out.println("BREAK");
        for (int i = 1; i <10 ; i++) {
            if (i %2==0){
                System.out.println(" "+ i);
                break;
                /*Una vez que encuentre el numero par, se va a salir del bucle, y no imprimira los demas pares*/
            }
            }
        for (int i = 1; i <10 ; i++) {

            System.out.println("CONTINUE");
            /*El modulo encontrara los impares*/
            if (i %2==1) {
             continue; //Si es impar, continua iterando, pero si es par, imprime del 2-8
                }
            System.out.println(i +" ");

        }
    }
}
