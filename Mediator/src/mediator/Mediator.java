/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author wolve
 */
public class Mediator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Crear el objeto centralizador de la comunicación
         Mediador m = new Mediador();
        // Crear los objetos que participarán en la comunicación
        Colega cc1 = new ColegaConcreto1( m );
        Colega cc2 = new ColegaConcreto2( m );
        Colega cc3 = new ColegaConcreto3( m );
        // Agregarlos al objeto centralizador
         m.agregarColega( cc1 );
         m.agregarColega( cc2 );
         m.agregarColega( cc3 );
        // Provocar un cambio en un uno de los elementos
        cc2.comunicar("ColegaConcreto2 ha cambiado!");
    }
    
}
