/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author wolve
 */
public abstract class OperadorBinario extends Expresion {

    protected Expresion operandoIzquierdo, operandoDerecho;

    public OperadorBinario(Expresion operandoIzquierdo,
            Expresion operandoDerecho) {
        this.operandoIzquierdo = operandoIzquierdo;
        this.operandoDerecho = operandoDerecho;
    }
}
