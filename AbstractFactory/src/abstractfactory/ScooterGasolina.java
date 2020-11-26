/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author wolve
 */
public class ScooterGasolina extends Scooter {

    public ScooterGasolina(String modelo, String color,
            int potencia) {
        super(modelo, color, potencia);
    }

    public void mostrarCaracteristicas() {
        System.out.println("Scooter de gasolina de modelo: "+ modelo + " de color: " + color+ " de potencia: " + potencia);
    }
}
