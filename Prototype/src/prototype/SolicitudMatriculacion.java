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
public class SolicitudMatriculacion extends Documento {

    public void visualiza() {
        System.out.println("Muestra la solicitud de matriculacion: " + contenido);
    }

    public void imprime() {
        System.out.println("Imprime la solicitud de matriculacion: " + contenido);
    }
}
