
import java.util.*;
public class NewMain {

   
    public static void main(String[] args) {
        
        int[] A={-1,-3,1,-4,-1,-2};
        int holi= A.length;
        int number =0;

        int Sol[] = new int[1000000]; //array with the max A integer

//Create an array with 1 and 0. All ones mean that A has a number of that position.
        for(int i=0;i<holi;i++){
            if(A[i]>0){ 
                int S=A[i];
                Sol[S]=1;
            }
            
        }
        
        //The first 0 is the smallest positive integer (greater than 0).
        int Sol_len=Sol.length;
        for(int j=1;j<Sol_len;j++){
            if(Sol[j]==0){
                //return j;
                number=j;
                break;
            }
        }
        
        //return 0;
        System.out.println(number);

        
        
    }
    
}
