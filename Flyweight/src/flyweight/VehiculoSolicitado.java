/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wolve
 */
public class VehiculoSolicitado {

    protected List<OpcionVehiculo> opciones = new ArrayList<OpcionVehiculo>();
    protected List<Integer> precioDeVentaOpciones = new ArrayList<Integer>();

    public void agregaOpciones(String nombre, int precioDeVenta,FabricaOpcion fabrica) {
        opciones.add(fabrica.getOption(nombre));
        precioDeVentaOpciones.add(precioDeVenta);
    }

    public void muestraOpciones() {
        int indice, tamaño;
        tamaño = opciones.size();
        for (indice = 0; indice < tamaño; indice++) {
            opciones.get(indice).visualiza(precioDeVentaOpciones.get(indice));
            System.out.println();
        }
    }
}
