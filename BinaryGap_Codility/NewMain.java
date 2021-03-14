
import java.util.*;
       
public class NewMain {

    public static void main(String[] args) {
        
        int N=2147483646; //Numero en Decimal
        int fin=0;
        int count=0;

        
       char[] Bina=Integer.toBinaryString(N).toCharArray(); //convierte a binario y a array

       // System.out.println(Bina);

        for (int i=1; i<Bina.length;i++){
            if(Bina[i]=='0' & i<Bina.length-1){ //si '10'
                if((Bina[i-1])=='1' ){
                    do{
                        count++; //suma 1 en la cuenta
                        i++;
                    }while(Bina[i]=='0' & i<Bina.length-1); //repite mientras haya más 0
                    if(Bina[i]=='1'){ //cuando al final hay un uno
                        if (fin<count){
                            fin=count; //si el conteo de numeros anteriores es inferior, establece como número final el conteo actual
                            count=0;
                        }
                    }else count=1;
                }
                
            }
        
        }
        System.out.println(fin);
        
    }
    
}
