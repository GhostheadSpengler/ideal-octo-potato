package practicas;

import java.util.*;
class Constructor{
    int va1;
    int va2;

    public Constructor(int i, int i1) {
        va1=i;
        va2=i1;
    }

    void suma(){ //Creando la funcion
        var resultado= va1+va2;
        System.out.println("Resultado Suma: " + resultado);
    }

    void resta(){
        var resultado=va1-va2;
        if (resultado<0){
            System.out.println("Operacion no valida");
        } else{
            System.out.println("Resultado Resta: "+ resultado);
        }
    }

    void multiplica(){
        var resultado=va1*va2;
        System.out.println("Resultado Multiplicacion: " + resultado);
    }

    public static void main(String[] args) {
        var objeto=new Constructor(12,15); //Instanciando la clase/Objeto
//        objeto.va1=12;
//        objeto.va2=11;
        objeto.suma();
        objeto.resta();

        var objet=new Constructor(2,5);
        objet.multiplica();
        objet.resta();
    }

}