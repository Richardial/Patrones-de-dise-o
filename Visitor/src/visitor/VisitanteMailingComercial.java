/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author wolve
 */
public class VisitanteMailingComercial implements Visitante {

    public void visita(EmpresaSinFilial empresa) {
        System.out.println("Envía un email a "+ empresa.getNombre() + " dirección: " + empresa.getEmail() + " Propuesta comercial para su empresa");
    }

    public void visita(EmpresaMadre empresa) {
        System.out.println("Envía un email a " + empresa.getNombre() + " dirección: " + empresa.getEmail() + " Propuesta comercial para su grupo");
        System.out.println("Impresión de un correo para " + empresa.getNombre() + " dirección: " + empresa.getDireccion() + " Propuesta comercial para su grupo");
    }
}
