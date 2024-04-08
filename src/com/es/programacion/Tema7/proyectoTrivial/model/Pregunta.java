package com.es.programacion.Tema7.proyectoTrivial.model;

import java.util.Objects;

public class Pregunta {

    private String pregunta;
    private String respuesta;


    public Pregunta(String pregunta, String respuesta) {
        setPregunta(pregunta);
        setRespuesta(respuesta);
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pregunta pregunta1 = (Pregunta) o;
        return Objects.equals(pregunta, pregunta1.pregunta) && Objects.equals(respuesta, pregunta1.respuesta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pregunta, respuesta);
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "pregunta='" + pregunta + '\'' +
                ", respuesta='" + respuesta + '\'' +
                '}';
    }
}