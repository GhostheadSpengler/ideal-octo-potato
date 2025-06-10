package practicas;

import java.util.*;
public class Autenticacion {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        final var usuario="Bigotes";
        final var contra="M1n1n0";

        System.out.printf("Introduce tu nombre de usuario: ");
        var user=teclado.nextLine().strip();
        System.out.printf("Intorduce tu Password: ");
        var password=teclado.nextLine().strip();

        var mensaje=switch (user){
            case usuario-> {
                if (contra.equals(password)){
                    yield "Bienvenido al Sistema"; }
                else{
                    yield "Password Incorrecto";
                }

            }default -> {
                if(contra.equals(password)){
                    yield "Usuario Incorrecto";}
                else{
                    yield "Uusuario y Password Incorrectos";
                }
            }
        };
        System.out.println(mensaje);
    }
}
/*

1. Se procede a comparar el texto de USUARIO. No es posible comparar varios casos en el parametro del switch, solo UNO.
2 Entra a la evaluacion y en CASO DE SER CORRECTO EL USUARIO, entra al primer caso, el cual contiene un If anidado.
2.1 IF ANIDADO: Procede a comparar el password, en caso de ser correcto, da la Bienvenida al Sistema, de lo contrario se va al ELSE.

3. En caso de NO coincidir el USUARIO, se pasa al DEFAULT, el cual tambien contiene una condicional anidada, esta vez comparando el PASSWORD.
 */
