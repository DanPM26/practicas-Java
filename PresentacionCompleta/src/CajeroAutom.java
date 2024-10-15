import java.util.Scanner;

public class CajeroAutom {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        var salir = false;
        var saldo = 1000.00;

        while (!salir) {

            System.out.println("""
                    ¿Que acción quieres realizar?
                    1.- Consultar saldo
                    2.- Despositar a cuenta
                    3.- Retirar 
                    4.- Salir 
                    \s """);

            var opcion = Integer.parseInt(consola.nextLine());

            switch (opcion) {

                case 1 -> System.out.println("Tu saldo actua es: $" + saldo );
                case 2 -> {
                    System.out.println("Ingresa el monto a depositar");
                    var deposito = Double.parseDouble(consola.nextLine());
                    saldo += deposito;
                    System.out.println("Su saldo actual es: $" + saldo);
                }
                case 3 ->{
                    System.out.println("Ingresa el monto a retirar");
                    var retiro = Double.parseDouble(consola.nextLine());
                    if(retiro >= saldo){
                        System.out.println("El monto que quiere retirar es superior al monto actual");
                    } else {
                        saldo -= retiro;
                        System.out.println("Su saldo actual es: $" + saldo);
                    }
                }
                case 4 -> {
                    System.out.println("Saliendo del Cajero. Vuelva pronto (:");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida" + opcion);


            }

            }

        }
    }

