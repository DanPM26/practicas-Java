import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class GeneradorID {
    public static void main(String[] args) {
     GeneradorIdUnico();
    }

    static void GeneradorIdUnico(){
        System.out.println("***Generador ID Unico***");

        var consola = new Scanner(System.in);

        System.out.print("Escribe tu nombre");
        var nombre = consola.nextLine().substring(0,2).toUpperCase();

        System.out.print("Escribe tu apellido");
        var apellido = consola.nextLine().substring(0,2).toUpperCase();

        System.out.print("Escribe tu año de nacimiento");
        var anio = consola.nextLine().substring(2,4);
        var aleatorio = new Random().nextInt(0,9999);
        var valorAleatorio = new DecimalFormat("####").format(aleatorio);
        var idUnico = nombre + apellido + anio + valorAleatorio;
        System.out.println("Tu Id es:"+ idUnico);

    }
}
