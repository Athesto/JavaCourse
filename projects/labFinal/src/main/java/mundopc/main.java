/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import com.gm.mundopc.*;

/**
 *
 * @author tavo
 */
public class main {

    static public void main(String arg[]) {
        System.out.println("welcome");
        Orden o;
        Computadora c[]= new Computadora[7];
        
        
        c[0] = new Computadora("PC1", new Monitor("Acer", 12), new Teclado("genius", "usb"), new Raton("Samsung", "usb"));
        c[1] = new Computadora("PC2", new Monitor("ASUS", 12), new Teclado("logitech", "usb"), new Raton("windows", "usb"));
        o = new Orden();
        
        o.agregarComputadora(c[0]);
        o.agregarComputadora(c[1]);
        o.mostrarOrden();
        

    }

}
