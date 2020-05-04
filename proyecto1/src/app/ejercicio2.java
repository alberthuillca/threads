package app;

public class ejercicio2 extends Thread{
    
    public static void main(String[] args) throws Exception{
   
        for(int i=1; i<26 ; i++){
            System.out.println(i);  
            Thread.sleep(2000);
        }
        
    }
}