package practicas;

import java.util.*;
public class BcoMovimientos {
    public static void main(String[] args) {
        var estado=false;
        while(!estado) { //Mientras NO SEA FALSO se ejecutara el ciclo. Signo de negacion !
            double capital=5500;
            double depositar=0;
            double retiro=0;

            Scanner teclado = new Scanner(System.in);
            System.out.println("*********** SISTEMA BANCARIO *********** \n");
            System.out.println("""
                    Bienvenidx, elige una opcion:
                    
                    1. Consultar Saldo
                    2. Depositar
                    3. Retirar
                    0. Salir """);

            System.out.println("Que accion deseas realizar?");
            var eleccion=Integer.parseInt(teclado.nextLine());

            switch (eleccion){

                //CONSULTA

                case 1: {
                    double actual=capital;
                    System.out.println("Tu saldo Actual es de: " + actual);
                    break;
                }
                // DEPOSITO

                case 2:{
                    System.out.println("Ingresa la Cantidad que deseas transferir: ");
                    depositar=Double.parseDouble(teclado.nextLine());
                    if(depositar<=0){
                        System.out.println("Ingresa un valor positivo por favor.");
                    } else {
                        depositar += capital;
                        System.out.println("El monto ha sido exitosamente transferido. Tu saldo actual es de: " + depositar + "\n");
                    }
                    break;
                }
                // RETIRO

                case 3: {
                    System.out.printf("Ingresa el monto que deseas retirar: ");
                    retiro=Double.parseDouble(teclado.nextLine());
                    if(retiro>capital){
                        System.out.println("Fondos insuficientes");
                    }else {
                        capital-=retiro;
                        System.out.printf("Tu saldo Actual es de: " + capital + "\n");
                             }
                    break;
                }

                //SALIENDO DEL SISTEMA

                case 0: {
                    System.out.println("Saliendo del Sistema...");
                   /* */
                    estado=true; //TABLA DE VERDAD CONDICIONAL.
                    break;

                }

                default:
                    System.out.println("Operacion no Valida");
            }

        }
      }
    }
/*
Como la variable de ESTADO, es falsa, en la condicion While, se dice que, mientras NO SEA falsa, es decir, en base a las tablas de verdad, es negativo el estado, y el exclamativo tambien lo niega, por tanto doble negacion es una afirmacion. Y al declarar verdadero el estado en la SALIDA del sistema, FALSO y VERDADERO= FALSO.

 */
