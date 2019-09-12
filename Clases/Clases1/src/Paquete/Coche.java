/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

public class Coche {
    
 public   double peso;
public    double altura;
public    double ancho;
public    double largo;
public    int numeroPuertas;
public    String modelo;


public Coche(){
   this.numeroPuertas=5;
    this.altura= 1.9;
    
}

    public Coche(double peso, double altura, double ancho, double largo, int numeroPuertas, String modelo) {
        this.peso = peso;
        this.altura = altura;
        this.ancho = ancho;
        this.largo = largo;
        this.numeroPuertas = numeroPuertas;
        this.modelo = modelo;
    }
   
    
public void numPuertas()
{
    System.out.println("El número de puertas es "+this.numeroPuertas);
}

}

 
