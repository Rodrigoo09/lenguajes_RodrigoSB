/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-107
 */
public class InterfazImc {
    
    public static void main(String []oso){
        
      Imc imc=new Imc(80,1.67f);
     
       
    
     System.out.println(  imc.calcular());
     
     
     //primitivos integrales
     byte b=2;
     short s=2;
     int i=2;
     long l=2;
    
     //casting forzado se hace con parentesis 
b=(byte)s;
s=b;
i=(int)l;
i=s;
s=(short)i;
                                        
  float f=2.0f;
  double d=2.0;
  
  boolean valor=false;
  
 // Imc otro=new Imc();
 // System.out.println(otro.isflaco());
  
     
     
}
}






