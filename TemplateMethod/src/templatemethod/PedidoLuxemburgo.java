/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author wolve
 */
public class PedidoLuxemburgo extends Pedido {

    protected void calculaIVA() {
        importeIVA = importeSinIVA * 0.15;
    }
}
