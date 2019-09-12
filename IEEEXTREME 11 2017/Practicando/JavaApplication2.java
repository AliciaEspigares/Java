/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author Alicia
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m=0;
		int[] x =new int[n];
		String[] s = new String[n];
		//lectura por pantalla
		
		for(int i=0;i<n;i++){
		x[i] = in.nextInt();
		s[i]= in.next();
                System.out.print(x[i]);
                System.out.print(s[i]);
		}
		//compara tabla
		for(int i=0;i<=n;i++){
                    
		    for(int a=i++; a<=n; a++){
		   if(x[i]==x[a]){
                       if(s[i].equals('r')&&s[a].equals('l')||s[i].equals('l')&&s[a].equals('r')){
		    m=m + 1;
                       }
                    else{
                           System.out.print("nope");
                       }
                    System.out.print(m);
		   }
		  }
		    
		}
                }
		
    }

    

