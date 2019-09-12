/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitfun2;

import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class DigitFun2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
          Scanner leer = new Scanner(System.in);
               
          String l,s;
          l=leer.next();
          s="END";
        while(l.compareTo(s) != 0){
            
               
               l=leer.nextLine();
               
            
               int i=1;
                 String li;
                 li = Integer.toString(l.length());
           
                 while(i<10)
                    {
                        if(l.compareTo(s) == 0)
                             {
                                return;
                             }
                        else{
                        if (li.equals(l))
                           {
                             System.out.println(i);
                            
                            break;
                            }
                          else 
                            {
                              l=li;
                              li = Integer.toString(l.length());
                              i++;
                            }
                        }
                     }
      
             }
       
         
           
                            
    }        
                
                
       
        


     
    
    
    
    

