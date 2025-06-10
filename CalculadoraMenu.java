package practicas;

import  java.util.*;
public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("""
               ***************  CALCULADORA DIGITAL ****************
               
                             
               1. Suma
               2. Resta
               3. Multiplicacion
               4. Division \n""");

        System.out.println("Escoge la Operacion a realizar: ");
        var opcion=Integer.parseInt(teclado.nextLine());

        switch (opcion){
            case 1: {
                System.out.println("********** SUMA ********** \n");
                System.out.println("Introduce un numero: ");
                double numero=Double.parseDouble(teclado.nextLine());
                System.out.println("Introduce el segundo numero: ");
                double numeroDos=Double.parseDouble(teclado.nextLine());
                double resultado=numeroDos+numero;
                System.out.println("Elresultado de tu SUMA es: " + resultado);}
            break;

            case 2: {
                System.out.println("********** RESTA ********** \n");
                System.out.println("Introduce un numero: ");
                double numero=Double.parseDouble(teclado.nextLine());
                System.out.println("Introduce el segundo numero: ");
                double numeroDos=Double.parseDouble(teclado.nextLine());
               if(numeroDos>numero){
                   System.out.println("El sustraendo no puede ser MAYOR que el Minuendo");
               } else{
                   var resultado=numero-numeroDos;
                   System.out.println("El resultado de tu RESTA es: " + resultado);
               } break;}

            case 3: {
                System.out.println("********** MULTIPLICACION ********** \n");
                System.out.println("Introduce un numero: ");
                double numero=Double.parseDouble(teclado.nextLine());
                System.out.println("Introduce el segundo numero: ");
                double numeroDos=Double.parseDouble(teclado.nextLine());
                double resultado=numero*numeroDos;
                System.out.println("El resultado de tu MULTIPLICACION es: " + resultado);}
            break;

            case 4:{
                System.out.println("********** DIVISION ********** \n");
                System.out.println("Introduce un numero: ");
                double numero=Double.parseDouble(teclado.nextLine());
                System.out.println("Introduce el segundo numero: ");
                double numeroDos=Double.parseDouble(teclado.nextLine());
                double resultado=numero/numeroDos;
                System.out.println("El resultado de tu DIVISION es: " + resultado);
                break;
             }
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
}
