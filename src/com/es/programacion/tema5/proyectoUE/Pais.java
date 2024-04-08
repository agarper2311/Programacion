package com.Programacion.Tema5.proyectoUE;

public class Pais {

    // Variable estática
    public static int numPaisesUE;

    // Variables de objetos

    private String nombre;
    public int nProvincias, nHabitantes;
    private boolean esMonarquia;


    // Constructor de clase

    public Pais(String nombre, int nProvincias, int nHabitantes, boolean esMonarquia){

        this.nombre = nombre;
        if (nProvincias > 0){
            this.nProvincias = nProvincias;
        }

        if (nHabitantes > 0){
            this.nHabitantes = nHabitantes;
        }

        this.esMonarquia = esMonarquia;

        // Al crearse un pais, el nPaises de la UE ha aumentado en 1
        Pais.numPaisesUE++; // Pais.nPaisesUE +=1; Pais.nPaisesEU = Pais.nPaisesEU+1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnProvincias() {
        return nProvincias;
    }

    public void setnProvincias(int nProvincias) {
        this.nProvincias = nProvincias;
    }

    public int getnHabitantes() {
        return nHabitantes;
    }

    public void setnHabitantes(int nHabitantes) {
        this.nHabitantes = nHabitantes;
    }

    public boolean isEsMonarquia() {
        return esMonarquia;
    }

    public void setEsMonarquia(boolean esMonarquia) {
        this.esMonarquia = esMonarquia;
    }
}
