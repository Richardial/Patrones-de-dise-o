/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author wolve
 */
public class Proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animacion animacion = new AnimacionProxy();
        animacion.dibuja();
        animacion.clic();
        animacion.dibuja();
    }

}
