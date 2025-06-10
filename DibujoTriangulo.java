package practicas;

import java.util.*;
public class DibujoTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Escribe el numero de filas. Tienes un maximo de 9 filas: ");
        var numero = Integer.parseInt(teclado.nextLine());

        switch (numero) {
            case 1:
                System.out.println("No se puede dibujar un triangulo con un valor tan pequeno");

            case 3:
                if (numero == 3) {
                    System.out.println("  *");
                    System.out.println(" ***");
                    System.out.println("*****");
                }

            case 5:if(numero==5){
                System.out.println("""
                                      **
                                     ****
                                    ******
                                   *********
                                 ************""");
            }
            case 7: if (numero==7){
                System.out.println("""
                                      **
                                     ****
                                    ******
                                   *********
                                 ************
                                ***************
                              *******************""");


            }

          } if (numero<0 || numero>9){
            System.out.println("Opcion no valida");
        }
    }
}

