/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author wolve
 */
public abstract class Empresa {

    protected static double costeUnitarioVehiculo = 5.0;
    protected int nVehiculos;

    public void agregaVehiculo() {
        nVehiculos = nVehiculos + 1;
    }

    public abstract double calculaCosteMantenimiento();

    public abstract boolean agregaFilial(Empresa filial);
}
