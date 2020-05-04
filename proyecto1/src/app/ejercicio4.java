package app;

import java.util.Scanner;

public class ejercicio4 extends Thread {
    String[] estaciones = { "Primavera", "Verano", "Otoño", "Invierno" };
    Scanner datos = new Scanner(System.in);
    String estacion;

    public ejercicio4() {
        System.out.println("ingresar estacion de año");
        estacion = datos.nextLine();
    }

    @Override
    public void run() {
        switch (estacion) {
            case "primavera":
                try {
                    Thread.sleep(3000);
                    if (true) {
                        System.out.println("Setiembre, Octubre, Noviembre"); 
                    }
                    
                    
                } catch (InterruptedException e) {}
                break;
            case "verano":
                try {
                    Thread.sleep(3000);
                    if (true) {
                        System.out.println("Diciembre, Enero, Febrero");
                        break;
                    }
                    
                    
                } catch (InterruptedException e) {}
                break;
            case "otoño":
                try {
                    Thread.sleep(3000);
                    if(true){
                        System.out.println("Marzo, Abril, Mayo");
                        break;
                    }
                    
                    
                } catch (InterruptedException e) {}
                break;
            case "invierno":
                try {
                    Thread.sleep(3000);
                    if (true) {
                        System.out.println("Junio, Julio, Agosto");
                        break;
                    }
                    
                    
                } catch (InterruptedException e) {}
                break; 
        }
    }


    public static void main(String[] args) {
        while(true){
            Thread estacion = new ejercicio4();
            estacion.start();
        }
    }
}