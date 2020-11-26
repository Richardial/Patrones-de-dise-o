/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author wolve
 */
public class ModeloDecorador extends Decorador {

    public ModeloDecorador(ComponenteGraficoVehiculo componente) {
        super(componente);
    }

    protected void visualizaInformacionTecnica() {
        System.out.println("Información técnica del modelo");
    }

    public void visualiza() {
        super.visualiza();
        this.visualizaInformacionTecnica();
    }
}
