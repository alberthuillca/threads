package app;

import java.util.Scanner;

public class ejercicio5 extends Thread {
    
    Scanner datos = new Scanner(System.in);
    int cont = 1;
    float notas = 0;
    public ejercicio5() {       
        while (cont < 6) {
            System.out.println("Ingrese la nota numero  " + cont + " : ");
            float n = datos.nextFloat();
            notas += n;
            cont++;
        }
    }

    @Override
    public void run() {
        float promedio = 0;
        try {
            promedio = notas/5;
            System.out.println("El promedio de las notas ingresadas es : " + promedio);
    } catch (Exception e) {
            e.getMessage();
        }
       
    }

    public static void main(String[] args) {
        Thread notas = new ejercicio5();
            notas.start();
    }
}