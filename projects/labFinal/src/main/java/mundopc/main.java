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
        Computadora c;
        c = new Computadora("casa", new Monitor("Acer", 12), new Teclado("logitech", "usb"), new Raton("genius", "usb"));

        System.out.println(c.toString());

    }

}
