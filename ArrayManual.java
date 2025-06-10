package practicas;

import java.util.*;
public class ArrayManual {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("/n ******** CAPTURANDO DATOS DEL ARREGLO *********** ");
        System.out.println("Introduce el numero de tu arreglo: ");
        var numero=Integer.parseInt(teclado.nextLine()); //Recibe el dato de la consola
        var arreglo=new int[numero]; //se crea arreglo de nombre ARREGLO. Es decir, se define el tamano del mismo. Posteriormente se procede a introducir el contenido (numeros).


        /* SOLICITA LOS NUMEROS  DEL ARREGLO Y LOS GUARDA*/
        for (int i = 0; i <numero ; i++) { //puede sustituirse arreglo.lenght por: numero.
            System.out.println("Introduce numeros enteros [" +i+ "]: \n");
            arreglo[i]=Integer.parseInt(teclado.nextLine()); //Se guarda el primer valor, y asi consecutivamente.
        }

        //IMPRIME LOS VALORES DEL ARREGLO ITERANDOLO

        System.out.println("******** IMPRIMIENDO ARREGLO *********");
        //Se ingresa al arreglo para visualizarlo

        for (int i = 0; i <numero ; i++) { //Se iteran y analizan los valores ingresados
            System.out.println("enteros [" +i+"]"+ arreglo[i]);

        }
    }
}

/* Se pretende contar e iterar un arreglo segun el deseo del usuario*/
