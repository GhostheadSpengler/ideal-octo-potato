package practicas;

import java.util.*;
public class ElseIfEstaciones {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        var estacion="";

        System.out.println("\n************* ESTACIONARIO (MI MODO)*************");
        System.out.println("\nIntroduce, un numero, del 1 al 12 para determinar en que estacion te encuentras.");
        var numero=Integer.parseInt(teclado.nextLine());
        if(numero==1 ||numero==2 || numero==12){
            System.out.println("Temporada Inviernal.");
        } else if (numero==3 ||numero ==4|| numero==5){
            System.out.println("Temporada de Primavera");
        } else if (numero==6 || numero==7|| numero==8){
            System.out.println("Temporada de Verano");
        } else if(numero==9|| numero==10|| numero==11){
            System.out.println("Temporada Spooky");
        } else{
            System.out.println("Numero invalido");
        }

        System.out.println("\n************* ESTACIONARIO UDEMY*************");
        System.out.println("\nIntroduce, un numero, del 1 al 12 para determinar en que estacion te encuentras.");


        var num=Integer.parseInt(teclado.nextLine());
        if(num==1 ||num==2 || num==12){
            estacion="INVIERNO";
        } else if (num==3 ||num ==4|| num==5){
           estacion="PRIMAVERA";
        } else if (num==6 || num==7|| num==8){
            estacion="VERANO";
        } else if(num==9|| num==10|| num==11){
            System.out.println("SPOOKY SEASON MUAHAHAHA ");
        } else{
            System.out.println("Numero invalido");
        }

        System.out.println(" ********** INFORMACION ************** \n");
        System.out.printf("""
                La estacion para el mes: %d es %s""",numero,estacion);
    }
}

