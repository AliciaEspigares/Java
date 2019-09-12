
package digitfun;

import java.util.Scanner;

public class DigitFun {

   
    public static void main(String[] args) {
       
        
        Scanner leer = new Scanner(System.in);
        
        //Creamos variables
        
        String l = new String();
        String b = new String();
       String c = new String();
       String d = new String();
        
        //Leemos las variables
        
        l = leer.nextLine();
        b = leer.nextLine();
       c = leer.nextLine();        
      d = leer.nextLine();
       
        int i=1;
        String li;
           li = Integer.toString(l.length());
          
        
        while(i<10)
               {
                   if (li.equals(l))
                    {
                        System.out.println(i);
                        break;
                    }
                   else {
                       l=li;
                      li = Integer.toString(l.length());
                      i++;
                   }
                   
                }
       int j=1; 
        String bi;
           bi = Integer.toString(b.length());
         while(j<10)
               {
                   if (bi.equals(b))
                    {
                        System.out.println(j);
                        break;
                    }
                   else {
                       b=bi;
                      bi = Integer.toString(b.length());
                      j++;
                   }
                   
                }
        int k=1; 
        String ci;
           ci = Integer.toString(c.length());
         while(k<10)
               {
                   if (ci.equals(c))
                    {
                        System.out.println(k);
                        break;
                    }
                   else {
                       c=ci;
                      ci = Integer.toString(c.length());
                      k++;
                   }
                   
                }
        int m=1;
        String di;
           di = Integer.toString(d.length());
         while(m<10)
               {
                   if (di.equals(d))
                    {
                        System.out.println(m);
                        break;
                    }
                   else {
                       d=di;
                      di = Integer.toString(d.length());
                      m++;
                   }
                   
                }
    } 
                            
                        
                
                
       
        
    }
     
    
    

