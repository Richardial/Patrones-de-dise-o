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
import java.util.List;

public interface WebServiceAuto {
    String documento(int indice);
    List<String> buscaVehiculos(int precioMedio, int desviacionMax);
}
