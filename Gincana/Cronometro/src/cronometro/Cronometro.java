
package cronometro;
import java.util.Scanner;

public class Cronometro {

    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
     int segundo2=0;
     int minuto2=0;
     
     //for(int horas=0; horas<24;horas++){
     for(int minutos=0; minutos<2;minutos++){  
       for( int segundos=0;segundos<10;segundos++){
           System.out.println(minutos+":"+segundos);
            delaySegundo();
            segundo2=segundos;
       }
       minuto2=minutos;
      }
     //}
        System.out.println(minuto2+":"+segundo2);
    }
    
    private static void delaySegundo()
    {
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){}
    }
     
     
}
