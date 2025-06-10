package practicas;

public class ForDoWhileImpar {
    public static void main(String[] args) {
        //Proceso DO-WHILE
        var numero = 0;
        do {
            //VERIFICANDO SI ES IMPAR
            if (numero % 2!= 0)
                //No quitaba los pares porque habia puesto punto y coma despues del IF. Quitandolo ya hace lo que deberia ejecutar.
             System.out.printf(numero + " ");
            numero++;

        } while (numero <= 20);
        System.out.println("\n *********** FOR IMPARES DESCENDENTE ***********\n");

        //Inicializa, Condiciona, Decrementa
        for (int i = 30; i>=0; i--) {
            if(i %2!=0){
                System.out.printf(" "+ i);
            }

        }
       }
    }


