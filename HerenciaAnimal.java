package practicas;
import java.util.*;

// ************** CLASE PADRE **************** //

public class HerenciaAnimal {
    protected void comer(){
        System.out.println("Come varias veces al dia");
    }

   public void dormir(){
        System.out.println("Duerme mucho");
    }

}

// ************** CLASE PERRO **************** //

class Perro extends HerenciaAnimal { //EXTENDS depende de la Clase padre Animal
    public void ladrar() {
        System.out.println("Woof");
    }
    @Override
  public void dormir(){ //Sobreescribiendo el metodo DUERME de la clase Padre
      System.out.println("Perro asqueroso que duerme");
  }

}

// ************** CLASE MAIN **************** //

class Ensayo{
    public static void main(String[] args) {

        //Instanciando objeto
        System.out.printf("Animal Clase Padre, de tipo Perro que, ");
        var objeto=new Perro();
        objeto.ladrar();
        objeto.dormir();
        objeto.comer();
         }
    }

