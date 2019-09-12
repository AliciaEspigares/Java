/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runingupstairs.pkg2a.forma;
// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
     public static int factor(int n) {
         
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
        
    }
    public static int factorial(int numDig, int numDos)
    {
        int solucion = 0;
        solucion = factor(numDig)/(factor(numDos)*factor(numDig-numDos));
        return solucion;
    }
     
	public static void main (String[] args) throws java.lang.Exception {
	   Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int suma = 0;
	//	int numDig;
		int numDos;
		   
		for(int i=0; i<a;i++){
		    int b = in.nextInt();
		    double u=(double)b/2;
		       int numDig=(b/2)+1;
		       if(u%2==0){
		           numDos=numDig;
		       }
		       else{
		       numDos=numDig-1;
		       }
		     
		 suma = factorial(numDig, numDos) + suma;
		  // System.out.println("suma 1 "+suma);
		  while(numDos>0 && numDig<b){
		        
		  numDig++;
		  numDos--;
		 
		 suma = factorial(numDig, numDos) + suma;
	//	 System.out.println("suma "+suma+" numero digitos "+numDig);
		  }
		  System.out.println(suma);
		  numDig=0;
		  numDos=0;
		  suma=0;
		    }
		  
		}
		
		
		
	}