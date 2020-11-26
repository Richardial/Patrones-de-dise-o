/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author wolve
 */
public class ComponenteGestionDocumento implements GestionDocumento {

    public String documento(int indice) {
        return "Documento número " + indice;
    }
}
