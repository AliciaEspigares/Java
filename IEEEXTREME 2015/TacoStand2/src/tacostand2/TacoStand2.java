/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tacostand2;

import java.util.Scanner;

public class TacoStand2 {

    
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        int dias=leer.nextInt();
        
        for(int j=1;j<=dias;j++){
            
        int s = leer.nextInt();
        int m = leer.nextInt();
        int r = leer.nextInt();
        int b = leer.nextInt();
        int i=0;
        int ingredientes=m+b+r;
        int comparacion =ingredientes/2;
        
        
        if(s<=comparacion)
        {
            System.out.println(s);
            
        }
        else 
        {
           if(m<r && m<b)
           {
               if(b<r)
               {
                   while(b>0)
                   {
                       r--;
                       b--;
                       i ++;
                       
                       if (b==0)
                       {
                           while(r>0 || m>0)
                           {
                               m--;
                               r--;
                               i++;
                               if ( r==0 || m==0)
                               {
                                 System.out.println(i);
                                 break;
                               }
                               else{}
                            }
                           
                       }
                       else
                       {}
                    }    
                }
               else
               {
                 while(b>0)
                 {
                     r--;
                     b--;
                     i++;
                     if( r==0)
                     {
                         while(b>0 || m>0)
                         {
                             m--;
                             b--;
                             i++;
                             
                             if(b==0 || m==0)
                             {
                                 System.out.println(i);
                                 break;
                             }
                             else {}
                             
                         }
                      }
                     else {}
                     
                     }
                     
                 }
               }
           else if (b<m && b<r)
           {
               if(r>m)
               {
                   while(r>=0)
                   {
                       r--;
                       m--;
                       i++;
                       if(m==0)
                       {
                           while(b>=0 && r>=0)
                           r--;
                           
                            b--;
                           i++;
                           
                           
                           if(r==0 || b==0)
                           {
                               System.out.println(i);
                               break;
                           }
                           else{}
                       }
                       else{}
                       
                   }
               }
               else
               {
                   while (m>0)
                   {
                       m--;
                       r--;
                       i++;
                       if(r==0)
                       {
                           while(b>0 || m>0)
                           {
                               b--;
                               m--;
                               i++;
                               if(m==0 || b==0)
                               {
                                   System.out.println(i);
                                   break;
                               }
                               else{}
                           }
                       }
                       else{}
                   }
               }
           }
           else 
           {
               if(m>r && m>b)
               {
                   while(m>0)
                   {
                      m--;
                      b--;
                      i++;
                      if(b==0)
                      {
                          while(r>0 || m>0)
                          {
                              r--;
                              m--;
                              i++;
                              if(r==0 || m==0)
                              {
                                  System.out.println(i);
                                  break;
                              }
                              else {}
                          }
                      }
                      else{}
                   }
               }
               else
               {
                   while(b>0)
                   {
                       b--;
                       m--;
                       i++;
                       if(m==0)
                       {
                           while(r>0 || b>0)
                           {
                               r--;
                               b--;
                               i++;
                               if(b==0 || r==0 )
                               {
                                   System.out.println(i);
                                   break;
                               }
                               else{}
                               
                           }
                       }
                       else{}
                   }
               }
           }
           }
      
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
