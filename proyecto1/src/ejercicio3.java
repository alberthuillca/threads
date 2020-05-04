import java.util.Scanner;

public class ejercicio3 extends Thread{
    Scanner dato  = new Scanner(System.in);
    String nom;

    public void run(){
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " metros " + " ");
        }
        System.out.println("llego " + nom);
    }

    public ejercicio3() {
        System.out.println("ingresar Nombre : ");
        nom= dato.nextLine();
    }

    public static void main(String[] args) {
        Thread primero = new ejercicio3();
        Thread segundo = new ejercicio3();
        Thread tercero = new ejercicio3();

        primero.start();
        segundo.start();
        tercero.start();
    }
}