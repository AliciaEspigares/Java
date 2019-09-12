
package regalo.mi.princesa;
import java.util.Scanner;


public class RegaloMiPrincesa {

   
    public static void main(String[] args) {
        String Contrasena="";
        String Respuesta="pampling";
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Introduce la contraseña: ");
        Contrasena=scan.next();
        
        while(Contrasena.compareTo(Respuesta) != 0){
            System.out.println("La contraseña es incorrecta, por favor intentelo otra vez");
            Contrasena=scan.next();
        }
        
        System.out.println("La contraseña es correcta.\n\nLocalización de la llave: La cama.");
        
        
    }
    
}
