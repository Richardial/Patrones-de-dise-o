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
public interface Visitante {

    void visita(EmpresaSinFilial empresa);

    void visita(EmpresaMadre empresa);
}
