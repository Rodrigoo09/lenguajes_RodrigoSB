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
public class Imc {
    private float peso;
    private float altura;
    private boolean flaco;

    
    public void isFlaco(boolean flaco){
        this.flaco=flaco;
    }
    public boolean isflaco(){
        return flaco;
        
    }
    public float getPeso(){
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    public Imc(/*float p, float a*/){
       // peso=p;
        //altura=a;
    }
    
    public float calcular(){
        float imc=peso/(altura*altura);
        return imc;
    }
}
