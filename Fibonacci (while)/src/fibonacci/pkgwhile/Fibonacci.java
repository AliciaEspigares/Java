/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci.pkgwhile;
import java.util.Scanner;
/**
 *
 * @author Alicia
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaras las variables
        int a = 0;
        int b= 1;
        int almacen;
        
        //0,1,1,2,3,5,8
        //Le das nombre al nuevo Scanner
        Scanner leer= new Scanner(System.in);
        
        //Muestras en pantalla
        System.out.println("Introduce el número de iteracciones:");
        
        //Le asignas lo que entre por teclado a la variable iteracciones.
        int iteraciones;
        iteraciones= leer.nextInt();
        
        //Creamos el bucle
        
        int contador=0;
        while(contador<=iteraciones){
        almacen= a+b;
        System.out.println(a+" + "+b+" = "+almacen);
        a=b;
        b=almacen;
        contador++;
    }
    System.out.println("chimpum");
    }
}
    
    

