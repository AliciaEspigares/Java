
package prueba.pkgfinal;

import java.util.Scanner;

public class PruebaFinal {

    public static void main(String[] args) {
       
        Scanner scan= new Scanner(System.in);
        String Adivinanza="";
        String Respuesta="El nombre";

//Código prueba final
                
                System.out.println("Introduce la respuesta de la adivinanza:");
                
                Adivinanza=scan.nextLine();
                
                while(Adivinanza.compareToIgnoreCase(Respuesta)!=0){
                    System.out.println("La respuesta es incorrecta. Inténtelo de nuevo.");
                    Adivinanza=scan.nextLine();
                }
                
                System.out.println("Apaga el cronometro.¡La respuesta es correcta! ");
    }
    
}
