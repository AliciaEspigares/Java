/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackgate.penitentiary.continuacion;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author Alicia
 */
public class BlackgatePenitentiaryContinuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    
	    //Inicializamos variables
	   	int n = in.nextInt(); 
	    String[] a = new String[n] ;
	    int[] b = new int[n];
	    int NumeroMayor, PosicionMayor;
	    
	    //Llenamos array
	    for(int i=0; i<n;i++){
		 a[i] = in.next();
		 b[i] = in.nextInt();
	    }
	    
NumeroMayor = b[0];
PosicionMayor = 0;

for (int x=0;x<b.length;x++){
 if (b[x]>NumeroMayor){
   NumeroMayor = b[x];
   PosicionMayor = x+1;
  }  
}
int[] orden = new int[n];
for(int i=0;i<=n;i++){
    orden[i]=0;
}
   
   orden[0]=NumeroMayor;
for(int p=1;p<=n; Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		for(int i=0; i<5;i++){
		    
		}p++){
    for(int i=0;i<=n;i++){
    if(orden[p]<b[i]&&b[i]<NumeroMayor){
       orden[p]=b[i];
        System.out.println(orden[p]);
}
    else{ }
   
}
//  for(int i=0;i<n;i++){
 //   System.out.print(orden[i]);
//}
}
System.out.println(orden[0]);
System.out.println(orden[1]);
System.out.println(orden[2]);
System.out.println(orden[3]);

 
    
 System.out.print(NumeroMayor+" posicion "+PosicionMayor);
    }
}

