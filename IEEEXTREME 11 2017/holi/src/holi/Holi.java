/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holi;

import java.util.*;
import java.lang.*;
import java.io.*;


/**
 *
 * @author Alicia
 */
public class Holi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int[] vector =new int[a];
		vector[0]=1;
		vector[1]=2;
		
		for(int i=0; i<a;i++){
		    int b = in.nextInt();
		    
		       for(int n=0; n<b;n++){
		           vector[n+2]=vector[n]+vector[n+1];
		       }
		  System.out.println(vector[b-1]);
		  
		    
		}
		
		
	}
}
    
    
    

