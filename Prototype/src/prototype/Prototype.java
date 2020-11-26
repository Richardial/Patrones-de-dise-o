/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author wolve
 */
public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DocumentacionEnBlanco documentacionEnBlanco
                = DocumentacionEnBlanco.Instance();
        documentacionEnBlanco.incluye(new OrdenDePedido());
        documentacionEnBlanco.incluye(new CertificadoCesion());
        documentacionEnBlanco.incluye(new SolicitudMatriculacion());
        DocumentacionCliente documentacionCliente1= new DocumentacionCliente("Martin");
        DocumentacionCliente documentacionCliente2= new DocumentacionCliente("Simon");
        documentacionCliente1.visualiza();
        documentacionCliente2.visualiza();
    }

}
