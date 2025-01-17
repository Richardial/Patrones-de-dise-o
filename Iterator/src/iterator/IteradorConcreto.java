/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author wolve
 */
public class IteradorConcreto implements Iterador
{
     private AgregadoConcreto agregado;
     private int posicion_actual = 0;
    // -------------------------
    public IteradorConcreto( AgregadoConcreto agregado )
    {
         this.agregado = agregado;
    }
    // -------------------------
    @Override
     public Object primero()
    {
        Object obj = null;
        if( this.agregado.aDatos.isEmpty() == false )
        {
            this.posicion_actual = 0;
            obj = this.agregado.aDatos.get(0);
        }
        return obj;
    }
    // -------------------------
    @Override
     public Object siguiente()
    {
        Object obj = null;
        if( (this.posicion_actual ) < this.agregado.aDatos.size() )
        {
            obj = this.agregado.aDatos.get(this.posicion_actual);
            this.posicion_actual = this.posicion_actual + 1;
        }
        return obj;
    }
    // -------------------------
    @Override
     public boolean hayMas()
    {
        boolean ok = false;
        if( this.posicion_actual < (this.agregado.aDatos.size() ) )
        {
            ok = true;
        }
        return ok;
    }
    // -------------------------
    @Override
     public Object actual()
    {
        Object obj = null;
        if( this.posicion_actual < this.agregado.aDatos.size() )
        {
            obj = this.agregado.aDatos.get( this.posicion_actual );
        }
        return obj;
    }
}