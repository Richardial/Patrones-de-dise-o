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
public class EmpresaSinFilial extends Empresa {

    public boolean agregaFilial(Empresa filial) {
        return false;
    }

    public double calculaCosteMantenimiento() {
        return nVehiculos * costeUnitarioVehiculo;
    }
}
