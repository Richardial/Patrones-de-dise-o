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
public class EmpresaSinFilial extends Empresa {

    public EmpresaSinFilial(String nombre, String email,
            String direccion) {
        super(nombre, email, direccion);
    }

    public void aceptaVisitante(Visitante visitante) {
        visitante.visita(this);
    }

    public boolean agregaFilial(Empresa filial) {
        return false;
    }
}
