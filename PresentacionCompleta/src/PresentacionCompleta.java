import java.util.Scanner;

public class PresentacionCompleta {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Nombre:");
        var nombre = consola.nextLine();
        System.out.println("Edad:");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.println("Hijo único");
        var hijo =  Boolean.parseBoolean(consola.nextLine());
        System.out.println("Precio de tu bebida favorita:");
        var bebida = Float.parseFloat(consola.nextLine());
        System.out.println(nombre + bebida + edad + hijo);

    }
}
