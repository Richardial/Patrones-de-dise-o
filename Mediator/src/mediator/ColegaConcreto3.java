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
public class ColegaConcreto3 extends Colega {

    public ColegaConcreto3(IMediador m) {
        this.setMediador(m);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("ColegaConcreto3: " + mensaje);
    }
}
