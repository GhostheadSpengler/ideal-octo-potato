package practicas;
import java.util.*;
class PromedioExcepciones{
    public void evaluacion(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("PROMEDIO DE EVALUACIONES \t");
        System.out.println("Introduce el numero de evaluaciones a promediar: ");
        var totalEv=Integer.parseInt(teclado.nextLine()); //Convirtiendo los datos
        var arreglo= new int[totalEv];//Arreglo

        for (int i = 0; i <totalEv ; i++) { //Recorriendo el arreglo
            System.out.println("Agrega las evaluaciones a continuacion: ");
            //Convirtiendo el dato de la consola y Agregando las evaluaciones
            arreglo[i] = Integer.parseInt(teclado.nextLine());
            if (arreglo[i] < 0) { //Creando una excepcion para numeros negativos
                throw new RuntimeException("No es posible promediar valores negativos");
            }
        }
        int sumatoria=0;
        for (int i = 0; i <totalEv ; i++) {
            sumatoria+=arreglo[i]; //Sumando los valores ingresados
        }
        int res=sumatoria/totalEv;
        System.out.println("El promedio es: "+ res);
    }
}


// ***********************************************

class resultado{
    public static void main(String[] args) {
        PromedioExcepciones prueba=new PromedioExcepciones();
        try{
            prueba.evaluacion();
        }   catch(Exception e){
            System.out.println("NO ES POSIBLE PROMEDIAR CON NUMEROS NEGATIVOS");
        }
    }
}

