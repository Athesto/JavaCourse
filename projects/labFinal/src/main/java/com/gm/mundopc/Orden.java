/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.mundopc;

/**
 *
 * @author tavo
 */
public class Orden {
    private int idOrden;
    Computadora computadoras[] = null;
    static int contadorOrden = 0;
    private int contadorComputadoras = 0;
    private final int MAX_COMPUTADORAS = 7;
    
    public Orden(){
        
        contadorOrden++;
        computadoras = new Computadora[MAX_COMPUTADORAS];
        
    }
    
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras< MAX_COMPUTADORAS){
            computadoras[this.contadorComputadoras] = computadora;
            this.contadorComputadoras++;
        }
    }
    
    public double calcularTotal(){
        return 0;
    }
    
    public void mostrarOrden(){
        for(var i = 0; i < this.contadorComputadoras; i++){
            System.out.println(this.computadoras[i].toString());
        }
        System.out.println("Total: " + this.contadorComputadoras +" PCs");
        
    }
    
}
