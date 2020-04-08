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
public class Computadora {

    int idComputadora;
    String nombre;
    Monitor monitor;
    Teclado teclado;
    Raton raton;

    public Computadora() {

    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computador{" + " Nombre= " + this.nombre + ", " + this.monitor.toString() + this.teclado.toString() + this.raton.toString() + "} ";
    }

}
