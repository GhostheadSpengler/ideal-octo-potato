package excepciones;

import static excepciones.Excepcion.division;

class Excepcion{
//***********  CREAR EL METODO ARITMETICO

    //El metodo para invocarlo, se  asocia con la clase y no con los objetos. Es decir, no se instancia al momento de ser llamado
   public static int division(int v1, int v2){
//        public static int division(int v1,int v2) throws Exception { //Marca un error en el programa proncipal, ya que obliga a implementar el metodo en la firma
        if(v2<=0){ //Creando una excepcion SIN firma implementada
            throw new RuntimeException("ERROR ARITMETICO. SE DETUVO EL PROGRAMA");
        }
        int resultado=v1/v2;
        System.out.println("El resultado es:"+ resultado);
        return resultado;
    }

}

//************* CLASE PRINCIPAL

class Probando{
    public static void main(String[] args) {

        //1. Se puede acceder directamente al METODO aunque sea ESTATICO, llamando directamente a la CLASE y su respectivo metodo. Se asocia a la clase y no como un objeto
        Excepcion.division(15,3);

        // 2. Instanciando objeto con variable del tipo de la CLASE.
        Excepcion prob=new Excepcion();
        prob.division(12,6);

        //3. Accediendo como objeto pero directamente a la clase
        var opc= Excepcion.division(18,6);
        System.out.println("Imprimeindo por segunda ocasion: " + opc);

        //  Se puede acceder INSTANCIANDO. Atrapando error

        var resultado=new Excepcion();
        resultado.division(17,0);

    }
}

//Al poner una excepcion como TRHOWS (la cual se pone en el metodo que crea la excepcion) indica que PODRIA generarse un error y obliga al programa que le llama a escribir un try catch. Pero si solo hay un THROW, no es necesario implementar el try catch, ya que lo hace por si solo.