package practicas;

import java.util.*;
public class WhileAndForPares {
    public static void main(String[] args) {
        System.out.println("********** GENERADOR DE NUMEROS PARES ********* \n");

        var numero=1;

        while(numero<=20){
            //Revisando que sean numeros pares usando el operador MODULO
            if(numero %2==0) {//Siempre que el modulo de dos sea cero, es un numero PAR
                System.out.printf (numero + " ");
            }
            numero++;
        }

        System.out.println(" \n ******** CICLO FOR PARES ********** \n");

        for (int i = 0; i <=30 ; i++) {
            if(i %2==0){
                System.out.printf(" "+ i);
            }

        }

    }
}
/*Se utilizo el MODULO, el cual entrega el sobrante de una Division. Si queda un restante de 0, es el numero que se busca
*/