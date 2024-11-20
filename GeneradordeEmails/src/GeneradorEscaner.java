import java.util.Random;
import java.util.Scanner;

public class GeneradorEscaner {
    public static void main(String[] args) {
        GeneradorEmail();
    }

    static void GeneradorEmail(){
        System.out.println("***Generador de **");
        var consola = new Scanner(System.in);
        var random = new Random();

        System.out.print("Escribe tu nombre:");
        var nombre = consola.nextLine().toLowerCase();

        System.out.print("Escribe tu apellido:");
        var apellido = consola.nextLine().toLowerCase();
        // Genera una posición aleatoria. El más 1 inserta el punto al final del string
        int posicion = random.nextInt(nombre.length() + 1);

        var email = "@email.com.mx";
        // Inserta el punto en la posición aleatoria
        var nombreconPunto = nombre.substring(0,posicion) + "." + nombre.substring(posicion);

        var resultado = nombreconPunto + apellido + email;

        System.out.println("TU email es:"+ resultado);


    }
}
