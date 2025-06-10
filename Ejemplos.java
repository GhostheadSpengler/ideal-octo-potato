package practicas;

import java.util.*;
public class Ejemplos {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        boolean miembro=false;
        var descuento=.10;
        var descuentoDos=.05;

        System.out.println("Introduce el monto de tu producto: ");
        var monto=Integer.parseInt(teclado.nextLine());

        if (miembro==true && monto>=1000){
        var resultado=monto*descuento;
        var descuentoDiez=monto-resultado;
            System.out.println("Ha recibido un descuento del 10% sobre tu compra actual.\n");
            System.out.println("El monto a pagar es de: " + descuentoDiez);

        } else if (miembro==true && monto<1000) {
            var resultado=monto*descuentoDos;
            var descuentoCinco=monto-resultado;
            System.out.println("Ha recibido un descuento del 5% sobre tu compra actual.\n");
            System.out.println("El monto a pagar es de: " + descuentoCinco);
        } else {
            System.out.println("Compra exitosa con valor de: " + monto);
        }

    }
}