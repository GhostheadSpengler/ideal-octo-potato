package practicas;

import java.util.*;
public class Funcion00 {
    //Primero se declara la funcion deseada (creada) y despues se ejecuta la funcion principal main.

    static int sumando(int a,int b){
       var suma=a+b;
        return suma;
    }
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce los valores a sumar: ");

        var va1=Integer.parseInt(teclado.nextLine());
        var va2=Integer.parseInt(teclado.nextLine());

        //Llamando a la funcion

        var resultado_func=sumando(va1,va2);
        System.out.println("resultado_func = " + resultado_func);

        if (resultado_func %2 ==0) {
            System.out.println("El resultado es PAR");

        } else {
            System.out.println("El resultado es IMPAR");
        }

    }
}
