/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author wolve
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// inicialización del comercial en el sistema
        Comercial elComercial = Comercial.Instance();
        elComercial.setNombre("Comercial Auto");
        elComercial.setDireccion("Madrid");
        elComercial.setEmail("comercial@comerciales.com");
// muestra el comercial del sistema
visualiza();
    }

    public static void visualiza() {
        Comercial elComercial = Comercial.Instance();
        elComercial.visualiza();
    }
}


