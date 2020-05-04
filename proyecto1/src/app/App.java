package app;

import java.util.Scanner;

public class App extends Thread{
    Scanner dato = new Scanner(System.in);
    String nombre,dia;
    double hora;
    public App (String nombre, String dia, double hora) {
        this.nombre = nombre;
        this.dia = dia;
        this.hora = hora;
        System.out.println("Ingresar Nombre: ");
        nombre = dato.nextLine();
        System.out.println("Ingresar Dia :");
        dia = dato.nextLine();
        System.out.println("Ingresar Hora :<");
        hora = dato.nextDouble();

    } 
    @Override
    public void run() {
        if (hora>13) {
            System.out.println(nombre + "llego tarde el dia " + dia);
        }else{
            System.out.println(nombre + "llego temprano el dia " + dia);
        }
    }

    public static void main(String[] args) throws Exception {
        
        Thread alum1 = new App("", "", 0);
        alum1.start();
        Thread.sleep(3000);
        Thread alum2 = new App("", "", 0);
        alum2.start();

        
    }
}