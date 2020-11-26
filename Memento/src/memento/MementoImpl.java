/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wolve
 */
public class MementoImpl implements Memento {

    protected List<OpcionVehiculo> opciones
            = new ArrayList<OpcionVehiculo>();

    public void setEstado(List<OpcionVehiculo> opciones) {
        this.opciones.clear();
        this.opciones.addAll(opciones);
    }

    public List<OpcionVehiculo> getEstado() {
        return opciones;
    }
}
