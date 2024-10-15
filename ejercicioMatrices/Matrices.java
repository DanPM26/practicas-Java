import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        System.out.println("***Suma de diagonales de una matriz***");
        var consola = new Scanner(System.in);
        System.out.println("Ingresa el número de columnas");
        var columnas = Integer.parseInt(consola.nextLine());
        System.out.println("Ingresa el número de filas");
        var filas = Integer.parseInt(consola.nextLine());
         int[][] tabla = new int[columnas][filas];

         // Imprimir la matriz
     for(int y = 0; y < columnas; y++){
         for ( int x = 0; x < filas; x++){
             System.out.println("[" + y + "]" + "[" + x + "]");
             tabla[y][x] = Integer.parseInt(consola.nextLine());
         }
     }

     // Aplicar la suma a la diagonal de la matriz
     var sumaDiagonal = 0;
        for(int y = 0; y < columnas; y++){
            for ( int x = 0; x < filas; x++){
              if( y == x){
                  sumaDiagonal += tabla[y][x];
              }
            }
        }
        System.out.println("Suma diagonal de la matriz:" + sumaDiagonal);




    }
}
