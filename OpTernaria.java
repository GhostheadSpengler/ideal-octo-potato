package practicas;

import java.util.*;
public class OpTernaria {
    public static void main(String[] args) {
        System.out.println("Operacion Ternaria");
        Scanner teclado=new Scanner(System.in);
        var nip=2365;
        System.out.println("Banco Panamericano\n");

        System.out.println("Ingresa tu NIP para accesar a tu cuenta");
        var nipi=Integer.parseInt(teclado.nextLine());
        /*Forma reducida de realizar el IF-ELSE en una sola linea. Primero va la condicion -entre parentesis-, despues el signo de interrogacion que ejecuta lo "Verdadero", y los dos puntos, en caso de no cumplir la condicion. Es decir, dentro de la misma variable nipi, se guardan los mensajes que han de mostrarse segun sea el caso  */
        var resultado=(nipi==nip)? "Tu saldo es de $7235" : "NIP incorrecto";
        System.out.println(resultado);

    }
}
