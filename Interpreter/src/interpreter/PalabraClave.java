/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author wolve
 */
public class PalabraClave extends Expresion {

    protected String palabraClave;

    public PalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    public boolean evalua(String descripcion) {
        return descripcion.indexOf(palabraClave) != -1;
    }

// parte análisis sintáctico
    public static Expresion parsea() throws Exception {
        Expresion resultado;
        resultado = new PalabraClave(pieza);
        siguientePieza();
        return resultado;
    }
}
