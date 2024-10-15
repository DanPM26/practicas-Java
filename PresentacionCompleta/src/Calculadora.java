import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;

        while(!salir){

            System.out.println("""
                    *** Calculadora en Java ***
                    Seleccione la opción:
                    1.- Suma
                    2.- Restar
                    3.- Multiplicar
                    4.- Dividir
                    5.- Salir
                    """);
            var opcion = Integer.parseInt(consola.nextLine());


            switch(opcion){
                case 1 -> {
                    System.out.println("Ingrese el primer número");
                    var num1 = Double.parseDouble(consola.nextLine());
                    System.out.println("Ingrese el segundo número");
                    var num2 = Double.parseDouble(consola.nextLine());
                    var total = num1 + num2;
                    System.out.println("Total = "+ total);
                }
                case 2 -> {
                    System.out.println("Ingrese el primer número");
                    var num1 = Double.parseDouble(consola.nextLine());
                    System.out.println("Ingrese el segundo número");
                    var num2 = Double.parseDouble(consola.nextLine());
                    var total = num1 - num2;
                    System.out.println("Total = "+ total);
                }
                case 3 -> {
                    System.out.println("Ingrese el primer número");
                    var num1 = Double.parseDouble(consola.nextLine());
                    System.out.println("Ingrese el segundo número");
                    var num2 = Double.parseDouble(consola.nextLine());
                    var total = num1 * num2;
                    System.out.println("Total = "+ total);
                }
                case 4 -> {
                    System.out.println("Ingrese el primer número");
                    var num1 = Double.parseDouble(consola.nextLine());
                    System.out.println("Ingrese el segundo número");
                    var num2 = Double.parseDouble(consola.nextLine());
                    var total = num1 / num2;
                    System.out.println("Total = "+ total);
                }
                case 5 -> {
                    System.out.println("Hasta luego. Vuelva pronto (:");
                    salir = true;
                }
            }
        }

    }
}
