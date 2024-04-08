package com.es.programacion.Tema7.proyectoAirbnb.model;

public class Alojamiento implements Comparable<Alojamiento> {
    // Atributos de clase
    private String id;
    private String name;
    private Propietario propietario;
    private double price;

    /**
     * Constructor que recibe por parámetros:
     * @param id
     * @param name
     * @param propietario
     * @param price
     */

    public Alojamiento(String id, String name, Propietario propietario, double price) {
        this.id = id;
        this.name = name;
        this.propietario = propietario;
        this.price = price;
    }


    // Metodo toString
    @Override
    public String toString() {
        return "Alojamiento{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", propietario=" + propietario +
                ", price=" + price +
                '}';
    }

    // Metodo compareTo
    @Override
    public int compareTo(Alojamiento o) {
        return Double.compare(this.price, o.price);
    }

    // Metodo equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Alojamiento that = (Alojamiento) obj;
        return id.equals(that.id);
    }

    // Getters y setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}