/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import java.util.Scanner;

/**
 *
 * @author wolve
 */
public class FormHtmlImpl implements FormularioImpl {

    Scanner reader = new Scanner(System.in);

    public void dibujaTexto(String texto) {
        System.out.println("HTML: " + texto);
    }

    public String administraZonaIndicada() {
        return reader.next();
    }
}
