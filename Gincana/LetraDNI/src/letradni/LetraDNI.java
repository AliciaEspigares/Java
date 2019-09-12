
 
package letradni;
import java.util.Scanner;
public class LetraDNI {
   
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        
        int DNI;
        int resta;
        System.out.println("Introduce el número de tu DNI: ");
        DNI = scan.nextInt();
       
        resta=DNI%23;
      
     switch(resta){
        case 0: System.out.println("La letra de su DNI es la T");
             break;
        case 1: System.out.println("La letra de su DNI es la R");
             break;
        case 2: System.out.println("La letra de su DNI es la w");
             break;
        case 3: System.out.println("La letra de su DNI es la A");
             break;
        case 4: System.out.println("La letra de su DNI es la G");
             break;
        case 5: System.out.println("La letra de su DNI es la M");
             break;
        case 6: System.out.println("La letra de su DNI es la Y");
             break;
        case 7: System.out.println("La letra de su DNI es la F");
             break;
        case 8: System.out.println("La letra de su DNI es la P");
             break;
        case 9: System.out.println("La letra de su DNI es la D");
             break;
        case 10: System.out.println("La letra de su DNI es la X");
             break;
        case 11: System.out.println("La letra de su DNI es la B");
             break;
        case 12: System.out.println("La letra de su DNI es la N");
             break;
        case 13: System.out.println("La letra de su DNI es la J");
             break;
        case 14: System.out.println("La letra de su DNI es la Z");
             break;
        case 15: System.out.println("La letra de su DNI es la S");
             break;
        case 16: System.out.println("La letra de su DNI es la Q");
             break;
        case 17: System.out.println("La letra de su DNI es la V");
             break;
        case 18: System.out.println("La letra de su DNI es la H");
             break;
        case 19: System.out.println("La letra de su DNI es la L");
             break;
        case 20: System.out.println("La letra de su DNI es la C");
             break;
        case 21: System.out.println("La letra de su DNI es la K");
             break;
        case 22: System.out.println("La letra de su DNI es la E");
             break;
                 
                 
     }
    }
    
}
