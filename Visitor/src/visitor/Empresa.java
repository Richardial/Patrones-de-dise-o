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
public abstract class Empresa {

    protected String nombre, email, direccion;

    public Empresa(String nombre, String email, String direccion) {
        this.setNombre(nombre);
        https://www.facebook.com/pages/Planeta-Java/445981695433321
        this.setEmail(email);
        this.setDireccion(direccion);
    }

    public String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    protected void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public abstract boolean agregaFilial(Empresa filial);

    public abstract void aceptaVisitante(Visitante visitante);
}
