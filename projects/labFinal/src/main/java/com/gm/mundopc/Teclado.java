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
public class Teclado extends DispositivoEntrada {

    public static int getContadorTeclados() {
        return contadorTeclados;
    }

    public static void setContadorTeclados(int aContadorTeclados) {
        contadorTeclados = aContadorTeclados;
    }
    private int idTeclado;
    private static int contadorTeclados = 0;

    public Teclado(String marca, String tipoEntrada) {
        super(marca, tipoEntrada);
        Teclado.contadorTeclados++;

    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

    @Override
    public String toString() {
        return " Teclado{" + "idTeclado=" + idTeclado + ", contadorTeclados:" + Teclado.contadorTeclados + ", " + super.toString() + '}';
    }

}
