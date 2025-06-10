package practicas;

import java.util.*;
public class TrianguloUdemy {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("************ T R I A N G U L O ************** ");

        System.out.printf("Introduce el numero de filas que deseas para formar tu triangulo:  ");
        var filas=Integer.parseInt(teclado.nextLine()); //Recibe y almacena el valor.

        //LOGICA PARA DIBUJAR EL TRIANGULO
        for (int i = 1; i <=filas ; i++) {

            //Calculando espacios en blanco
            var whiteSpace=" ".repeat(filas-i);
            /*Al numero de FILAS que ingrese el usuario, se le restara la variable i del for, asi mismo, se incrementara i conforme a lo establecido del ciclo. Ej: usuario-1. 2-1 (se incrementa a la siguiente fila i, entonces) 2-2. (i jamas excedera el valor que ingrese el usuario) */

            //Calculando asteriscos
            var asterisco="*".repeat(2*i-1);
            System.out.println(whiteSpace + asterisco);
        }

    }
}
/*Hacer un triangulo que se forme segun las filas que indique el usuario


 1. Variable que reciba y almacena el valor del usuario
 2. Se deben calcular los espacios en blanco y la cantidad de asteriscos segun el numero introducido por el usuario.

  Para calcular los espacios en BLANCO se restara el numero de filas, menos el primer numero con el que se comenzo, pero este a su (i) vez se va a incrementar en la siguiente iteracion en base a la regla: i++ */