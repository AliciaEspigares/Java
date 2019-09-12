
package par.o.impar;
import java.util.Scanner;
/**
 *
 * @author Alicia
 */
public class ParOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Variables
        int num, modulo;
        String par= "El número es par. ";
        String impar= "El número es impar. ";
        //Inicio
        System.out.println("Este programa sirve para calcular si un numero entero introducido es par o impar");
        
        System.out.println("Introduce el numero: ");
        //Leemos el número que se introduzca por teclado
        Scanner leer = new Scanner(System.in) ;
        num = leer.nextInt();
        
        modulo = num%2;
        
        if(modulo==0){
            System.out.println(par);
        }
        else
            System.out.println(impar);
            }
    
}
