/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wolve
 */
public class EmpresaMadre extends Empresa {

    protected List<Empresa> filiales = new ArrayList<Empresa>();

    public EmpresaMadre(String nombre, String email, String direccion) {
        super(nombre, email, direccion);
    }

    @Override
    public void aceptaVisitante(Visitante visitante) {
        visitante.visita(this);
        for (Empresa filial : filiales) {
            filial.aceptaVisitante(visitante);
        }
    }

    @Override
    public boolean agregaFilial(Empresa filial) {
        return filiales.add(filial);
    }
}
