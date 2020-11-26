/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;

/**
 *
 * @author wolve
 */
public class AgregadoConcreto implements Agregado {

    protected ArrayList<String> aDatos = new ArrayList();

    // -------------------------
    public AgregadoConcreto() {
        this.llenar();
    }

    // -------------------------
    @Override
    public Iterador getIterador() {
        return new IteradorConcreto(this);
    }

    // -------------------------
    public void llenar() {
        this.aDatos.add(new String("Juan"));
        this.aDatos.add(new String("Pablo"));
        this.aDatos.add(new String("Richard"));
        this.aDatos.add(new String("Parker"));
    }
}
