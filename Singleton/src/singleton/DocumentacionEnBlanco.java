/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;

/**
 *
 * @author wolve
 */
public class DocumentacionEnBlanco extends Documentacion {

    private static DocumentacionEnBlanco _instance = null;

    private DocumentacionEnBlanco() {
        documentos = new ArrayList<Documento>();
    }

    public static DocumentacionEnBlanco Instance() {
        if (_instance == null) {
            _instance = new DocumentacionEnBlanco();
        }
        return _instance;
    }
    
}