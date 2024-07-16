/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jav3;

/**
 *
 * @author atset
 */
public class Jav3{

  public static void main( String[] args){
   //area of a circle
    area(3);
   
   // area of a cone
     carea(7);
    
    // voume of a circle 
     double volume = v(5.56,9.45);
     System.out.println(" circle volume = " + volume);
      
     //volume  of a cone
     double volumec =vc(490988789,700);
     System.out.println(" volumec = " + volumec);
     
     
     //addiction
    double x =  (volume + volumec);
     System.out.println(x  );
  } 
    
  public static void area(double r) {
    System.out.println("the area of the circle is :" + Math.PI*Math.pow(r, 2) );
      
  } 
  public static void carea(double r) {
      System.out.println(" the area of the cone is : " + Math.PI*Math.pow(r, 3));
  } 
   public static double v( double r , double h) {
       return r*h*Math.PI;
       
   }
  public static double vc( double r, double h) {
     return (((1/3)*(Math.PI))*((r)*(h))); 
     
  } 
  
  
}




