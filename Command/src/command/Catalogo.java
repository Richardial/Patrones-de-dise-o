/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wolve
 */
public class Catalogo {

    protected List<Vehiculo> vehiculosStock
            = new ArrayList<Vehiculo>();
    protected List<SolicitudRebaja> solicitudes
            = new ArrayList<SolicitudRebaja>();

    public void ejecutaSolicitudRebaja(SolicitudRebaja solicitud) {
        solicitudes.add(0, solicitud);
        solicitud.rebaja(vehiculosStock);
    }

    public void anulaSolicitudRebaja(int orden) {
        solicitudes.get(orden).anula();
    }

    public void restableceSolicitudRebaja(int orden) {
        solicitudes.get(orden).restablece();
    }

    public void agrega(Vehiculo vehiculo) {
        vehiculosStock.add(vehiculo);
    }

    public void visualiza() {
        for (Vehiculo vehiculo : vehiculosStock) {
            vehiculo.visualiza();
        }
    }
}
