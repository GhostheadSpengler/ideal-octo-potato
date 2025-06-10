package practicas;

//CREANDO CLASES ABSTRACTAS. Padre//
abstract class  SerVivo{
    public void alimentarse() {

    }
}

//Clase extendida de abstracta

class planta extends SerVivo{
    //Es necesario sobreescribir el metodo del Padre, para poder heredar sin necesidad de convertir la clase en Abstracta.
    @Override
    public void alimentarse() {
        System.out.println("Las plantas se alimentan de fotosintesis");
    }
}

class Animal extends SerVivo{
    @Override
    public void alimentarse() {
        System.out.println("Los animales se alimentan de comida.");
    }
}

class Carnivoro extends Animal{
    @Override
    public void alimentarse() {
        System.out.println("Este animal come carne");
    }
}

//Las clases Abstractas no pueden ser instanciadas.

public class Abstractos {
    public static void main(String[] args) {
        Carnivoro carne=new Carnivoro();
        carne.alimentarse();

    }
}







