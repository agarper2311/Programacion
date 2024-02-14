package com.es.programacion.tema6.proyectoMascotas.clases;

public class Ave extends Mascota {

    protected String pico;
    protected boolean vuela;

    public Ave(String nombre, String pico, boolean vuela) {
        super(nombre);

        this.pico = pico;
        this.vuela = vuela;
    }


    public void volar() {
        if(this.vuela) {
            System.out.println("Passsso que voy volandooo...");
        } else {
            System.out.println("Pa voladora tú aguila calva...");
        }
    }

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
}
