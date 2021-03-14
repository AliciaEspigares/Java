//Return true if the number is prime, false if not. 
public class NewMain {

    public static boolean is_prime(int n){
        if (n==1 || n==2){
            return true;
        }
        for(int i =2; i<n;i++){
            
            if (n%i==0){

            return false;
            }
        }return true;
        
    }
            
            
    public static void main(String[] args) {
        boolean solucion=is_prime(68);
        
    System.out.println(solucion);
      
    }
    
}
