package com.es.programacion.tema7.proyectoTrivial.model;

import java.util.ArrayList;
import java.util.Objects;

public class Participante {
    private String nombre;
    private String id;
    private ArrayList<Puntuacion> puntuaciones;


        public Participante(String nombre, String id) {
            this.puntuaciones = new ArrayList<>();
            setNombre(nombre);
            setId(id);
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public ArrayList<Puntuacion> getPuntuaciones() {
            return puntuaciones;
        }

        public void setPuntuaciones(ArrayList<Puntuacion> puntuaciones) {
            this.puntuaciones = puntuaciones;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Participante that = (Participante) o;
            return Objects.equals(id, that.id);
        }

        @Override
        public String toString() {
            return this.nombre + ", "+this.id;
        }
    }