/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author wolve
 */
public abstract class Colega {

    protected IMediador mediador;

    public IMediador getMediador() {
        return this.mediador;
    }

    public void setMediador(IMediador m) {
        this.mediador = m;
    }

    public void comunicar(String mensaje) {
        this.getMediador().enviar(mensaje, this);
    }

    public abstract void recibir(String mensaje);
}
