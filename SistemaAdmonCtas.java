package practicas;

import java.util.*;
public class SistemaAdmonCtas {
    public static void main(String[] args) {
        var salir=false;
        while (true) {
            System.out.println("*********** SISTEMA EN LINEA *********** ");
            System.out.println("""
                    Indica la accion que deseas realizar
                                    
                    1. Crear Cuenta
                    2. Eliminar Cuenta
                    3. Salir""");
            Scanner texto = new Scanner(System.in);
            System.out.printf("Escoge una Opcion: ");
            var numero = Integer.parseInt(texto.nextLine());

            switch (numero) {
                //Al hacerlo de forma ternaria (corta), y asignar el texto a la variable que debera imprimirse, genera un error, por lo que cada Case debe llevar un Print y no una asignacion a variable generica.
                case 1 -> System.out.println("Creando Cuenta");
                case 2 -> System.out.println("Eliminando Cuenta");
                case 3-> {System.out.println("Saliendo del Sistema...");
                        salir=false; //Condicional para salir.
                }

                default -> System.out.println("Opcion Invalida");
            };         System.out.println(" ----> "+ numero);
        }

    }
}
