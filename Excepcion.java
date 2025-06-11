package excepciones;

//INTERFACES & CLASES ABSTRACTAS

//EXCEPCIONES -Clase Padre-
public class Excepcion {
  double division() {
      int v1 = 15;
      int v2 = 3;
    try{
      double res = v1 / v2;
      System.out.println("El resultado de la division es: " + res);
      return res;
  } catch(Exception e){
        System.out.println("No es posible dividir entre Cero: " + e );
    }

      return 0;
  }

}

class Principal{
    public static void main(String[] args) {
        Excepcion excepcion= new Excepcion();
        excepcion.division();
    }
}
