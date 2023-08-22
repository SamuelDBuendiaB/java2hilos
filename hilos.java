
import java.util.Scanner;



public class hilos {
    public static void main(String[] args) {
        String camino = "cancion\\Portal Radio (DECOMPRESSED).wav";
        Thread hilo1 = new accion(camino);
        Thread hilo2 = new Thread(() -> {
            int num1 = UInput("Ingrese el primer numero: ");
            int num2 = UInput("Ingrese el segundo numero: ");
            int sum = num1 + num2;
            System.out.println("Suma: " + sum);
        });

        hilo1.start();
        hilo2.start();
    }

       private static int UInput(String msg){
        Scanner numero = new Scanner(System.in);
        System.out.println(msg);
        return numero.nextInt();
    }

}