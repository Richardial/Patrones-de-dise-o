/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

/**
 *
 * @author wolve
 */
public class Vehiculo extends ObjetoBasico {

    protected String descripcion;

    public Vehiculo(String descripcion) {
        this.descripcion = descripcion;
    }

    protected String getDescripcion() {
        return descripcion;
    }
}
