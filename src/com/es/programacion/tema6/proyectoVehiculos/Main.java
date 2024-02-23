package com.es.programacion.tema6.proyectoVehiculos;

import com.es.programacion.tema6.proyectoVehiculos.classes.api.Vehiculo;
import com.es.programacion.tema6.proyectoVehiculos.classes.impl.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Instanciar vehículos
        Coche lambo = new Coche("1234CGH", "Lamborghini Aventador", 4, true);
        Moto kawasaki = new Moto("5822TYX", "Kawasaki", 2, "Verde");
        Barco yate = new Barco("AWDS", "Yate", 20, true);
        Submarino severstal = new Submarino("DRSS", "Proyecto 941", 30, 500);
        Avion f35 = new Avion("IJKL897634", "Falcon 35", 2, 17);
        Helicoptero apache = new Helicoptero("HEAC896574", "Helicoptero Apache de Combate Sovietico", 2, 2);

        // Crear el ArrayList para almacenar todos los vehículos
        List<Vehiculo> vehiculos = new ArrayList<>();

        // Añadir los vehículos al ArrayList.
        vehiculos.add(lambo);
        vehiculos.add(kawasaki);
        vehiculos.add(yate);
        vehiculos.add(severstal);
        vehiculos.add(f35);
        vehiculos.add(apache);

        // Recorrer la lista y llamar al método imprimir de cada vehículo usando un bucle for normal
        for (int i = 0; i < vehiculos.size(); i++) {
            vehiculos.get(i).imprimir();
        }



    }
}
