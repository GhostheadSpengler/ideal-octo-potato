package practicas;
//CLASE PADRE
public interface PruebaInterfaz {

    void metodoVacio(); //Compuesto de varios metodos sin cuerpo.
    void metodoVacioII();

    default void metodoImplementado(){
        System.out.println("Iniciando el metodo Implementado/Opcional");
    }

}

//IMPLEMENTANDO LA INTERFAZ

class Nueva implements PruebaInterfaz{
    @Override
    public void metodoVacio() {
        System.out.println("Implementando y ejecutando el metodo 1");
    }

    @Override
    public void metodoVacioII() {
        System.out.println("Implementando y Ejecutando el metodo 2");

    }

    //OPCIONAL: SE PUEDE EJECUTAR EL METODO IMPLEMENTADO DESDE LA INTERFAZ
    @Override
    public void metodoImplementado() {
        PruebaInterfaz.super.metodoImplementado();
    }
}

class Prueba{
    public static void main(String[] args) {
        System.out.println("\t *********** EJECUTANDO LAS INTERFACES *********** \n");

        PruebaInterfaz objeto=new Nueva();//Instanciando
        objeto.metodoImplementado();
        objeto.metodoVacio();
        objeto.metodoVacioII();

    }
}

/*Diferencia entre interface y clase abstracta.

Las clases abstractas no se pueden instanciar, y ademas solo se pueden heredar, por otro lado, la interfaz puede tener un metodo con cuerpo que bien se puede o no aplicar al momento de ser llamado.*/


