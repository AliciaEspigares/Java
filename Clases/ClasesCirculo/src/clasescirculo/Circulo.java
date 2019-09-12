d/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasescirculo;

/**
 *
 * @author Alicia
 */
public class Circulo {
    
    
        
      public  int radio;
      public  int x;
      public  int y;
    
      public Circulo()
      {
          this.radio=5;
          this.x=0;
          this.y=0;
      }

    public Circulo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int obtenerX()
    {
        return x;
    }
    
    
    
  
    public void centro()
    {
        System.out.println("El centro es ("+this.x+","+this.y+").");
        
        
    }
    
}

    