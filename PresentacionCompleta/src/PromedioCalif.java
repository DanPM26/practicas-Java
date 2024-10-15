import java.util.Scanner;

public class PromedioCalif {
    public static void main(String[] args) {
        System.out.println("**Calduladora de Promedio de calificaciones**");
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el largo del arreglo:");
        var arreglo = Integer.parseInt(consola.nextLine());
        int[] arr = new int[arreglo];
        double total = 0;
        for (int i = 0; i < arreglo; i++){
            System.out.print("Proporciona tu calificación número [" + i + "]");
            arr[i] = Integer.parseInt(consola.nextLine());
        }

        for (int i = 0; i < arreglo; i ++){
            total += arr[i];
        }
        System.out.println("Tu calificación promedio total es:" + total/arr.length );

    }
}
