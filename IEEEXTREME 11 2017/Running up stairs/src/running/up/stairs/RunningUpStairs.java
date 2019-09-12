/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package running.up.stairs;

// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int[] vector =new int[22000];
		vector[0]=1;
		vector[1]=2;
		
		for(int i=0; i<a;i++){
		    int b = in.nextInt();
		    
		       for(int n=0; n<22000;n++){
		           vector[n+2]=vector[n]+vector[n+1];
		       }
		  System.out.println(vector[b-1]);
		  
		    
		}
		
		
	}
}
    
