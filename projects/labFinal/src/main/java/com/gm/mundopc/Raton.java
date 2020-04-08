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
public class Raton extends DispositivoEntrada {

    public static int getContadorRatones() {
        return contadorRatones;
    }

    public static void setContadorRatones(int aContadorRatones) {
        contadorRatones = aContadorRatones;
    }
    private int idRaton;
    private static int contadorRatones = 0;

    public Raton(String marca, String tipoEntrada) {
        super(marca, tipoEntrada);
        Raton.contadorRatones++;

    }

    public int getIdRaton() {
        return idRaton;
    }

    public void setIdRaton(int idRaton) {
        this.idRaton = idRaton;
    }

    @Override
    public String toString() {
        return " Raton{" + "idRaton=" + idRaton + ", contadorRatones:" + Raton.contadorRatones + ", " + super.toString() + '}';
    }

}
