import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        
        var consola = new Scanner(System.in);
        System.out.println("Calculo del área de un rectangulo");
        System.out.println("# de base");
        var base = Integer.parseInt(consola.nextLine());
        System.out.println("# de altura");
        var altura = Integer.parseInt(consola.nextLine());
        var resultado = base * altura;
        System.out.println("resultado = " + resultado);

    }
}
