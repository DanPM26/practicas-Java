import java.util.Scanner;

public class SentenciasdeDecision {
    public static void main(String[] args) {
    var consola = new Scanner(System.in);
    final int mayorEdad = 18;
        System.out.println("Ingresa tu edad");
    var edadUsuario = Integer.parseInt(consola.nextLine());

  if(edadUsuario >= mayorEdad){
      System.out.println("Es mayor de edad");
  } else {
      System.out.println("No es mayor de edad");
  }



    }
}


