package com.es.programacion.tema7.proyectoAirbnb.model;

import org.jetbrains.annotations.NotNull;


public class Propietario implements Comparable<Propietario>{

    // Atributos de clase
    private String host_id;
    private String host_name;

    /**
     * Constructor que recibe por par�metros
     * @param host_id
     * @param host_name
     */

    public Propietario(String host_id, String host_name) {
        this.host_id = host_id;
        this.host_name = host_name;
    }
    // M�todo toString
    @Override
    public String toString() {
        return "Propietario{" +
                "host_id='" + host_id + '\'' +
                ", host_name='" + host_name + '\'' +
                '}';
    }

    // M�todo equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Propietario that = (Propietario) obj;
        return host_id.equals(that.host_id) && host_name.equals(that.host_name);
    }

    // M�todo compareTo
    @Override
    public int compareTo(@NotNull Propietario o) {
        return 0;
    }

    // Getters y Setters

    public String getHost_id() {
        return host_id;
    }

    public void setHost_id(String host_id) {
        this.host_id = host_id;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }
}