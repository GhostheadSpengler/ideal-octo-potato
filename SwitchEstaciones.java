package practicas;

import java.util.*;
public class SwitchEstaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        var numero = 0;

        System.out.println(" *********** VERIFICADOR DE ESTACIONES ************* \n");
        System.out.printf("Escribe la estacion para conocer el mes: ");
        var estacion = teclado.nextLine();
        numero=switch(estacion){
            case "primavera"-> 3;
            case "verano" -> 6;
            case "Otono" -> 9;
            case "invierno" ->12;
            default -> 0;
        };

        System.out.println("La estacion " + estacion +" corresponde al mes " + numero );

    }
}
