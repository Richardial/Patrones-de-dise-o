/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.List;

/**
 *
 * @author wolve
 */
public class DibujaUnVehiculoPorLinea implements DibujaCatalogo {

    public void dibuja(List<VistaVehiculo> contenido) {
        System.out.println(
                "Dibuja los vehiculos mostrando un vehiculo por linea");
        for (VistaVehiculo vistaVehiculo : contenido) {
            vistaVehiculo.dibuja();
            System.out.println();
        }
        System.out.println();
    }
}
