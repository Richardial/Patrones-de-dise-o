/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wolve
 */
public class Catalogo {

    /**
     * @param args the command line arguments
     */
    public static int numAutos = 3;
    public static int numScooters = 2;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        FabricaVehiculo fabrica;
        ArrayList<Automovil> autos = new ArrayList();
        ArrayList<Scooter>scooters = new ArrayList();
        System.out.print("Desea utilizar "+ "vehiculos electricos (1) o a gasolina (2):");
        String eleccion = reader.next();
        if (eleccion.equals("1")) {
            fabrica = new FabricaVehiculoElectricidad();
        } else {
            fabrica = new FabricaVehiculoGasolina();
        }
        for (int index = 0; index < numAutos; index++) {
            autos.add(fabrica.creaAutomovil("estandar","amarillo", 6 + index, 3.2));
        }
        for (int index = 0; index < numScooters; index++) {
            scooters.add(fabrica.creaScooter("clasico","rojo", 2 + index));
        }
        for (Automovil auto : autos) {
            auto.mostrarCaracteristicas();
        }
        for (Scooter scooter : scooters) {
            scooter.mostrarCaracteristicas();
        }
    }
}


