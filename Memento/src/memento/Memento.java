/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.List;

/**
 *
 * @author wolve
 */
public interface Memento {
    void setEstado(List<OpcionVehiculo> opciones);
    List<OpcionVehiculo> getEstado();
}
