package practicas;

import java.util.*;
public class WhileSumaAcumula {
    public static void main(String[] args) {
        System.out.println(" ********** SUMA ACUMULADA ********** \n");
        //Sumara los numeros antecesores:1+2= 3 + 3=6...
        int maximo=5;
        int contador=1;
        int acumulada=0;

        //Crear el DO. Que hara incondicionalmente al principio?
        //SUMARA
        do{
            acumulada+=contador;
            System.out.println( acumulada);
            contador++; //Se incrementa el contador

        } while(contador<=maximo);{
            // ************* CREANDO LA CONDICIONAL ***************
            System.out.println("Total: "+ acumulada);

                 }
            }
        }

/*
PROGRAMA QUE SUMA A SUS NUMEROS ANTECESORES.
* Se crea la Constante del valor maximo a sumar, o sea CINCO
se inicializa el conteo en UNO
Se declara el ACUMULADOR, el cual guardara el numero que se sume con el NUMERO 1 (el cual se ira incrementando)
*/
