/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wolve
 */
public abstract class Sujeto {

    protected List<Observador> observadores = new ArrayList<Observador>();

    public void agrega(Observador observador) {
        observadores.add(observador);
    }

    public void suprime(Observador observador) {
        observadores.remove(observador);
    }

    public void notifica() {
        for (Observador observador : observadores) {
            observador.actualiza();
        }
    }
}
