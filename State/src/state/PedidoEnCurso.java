/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author wolve
 */
public class PedidoEnCurso extends EstadoPedido {

    public PedidoEnCurso(Pedido pedido) {
        super(pedido);
    }

    public void agregaProducto(Producto producto) {
        pedido.getProductos().add(producto);
    }

    public void borra() {
        pedido.getProductos().clear();
    }

    public void suprimeProducto(Producto producto) {
        pedido.getProductos().remove(producto);
    }

    public EstadoPedido estadoSiguiente() {
        return new PedidoValidado(pedido);
    }
}
