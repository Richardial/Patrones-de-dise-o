/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author wolve
 */
public class VistaVehiculo {

    protected String descripcion;

    public VistaVehiculo(String descripcion) {
        this.descripcion = descripcion;
    }

    public void dibuja() {
        System.out.print(descripcion);
    }
}
