package com.Programacion.Tema4.proyectoCombatePokemon;

public class Pokemon {
    private String[] nombres;
    private String[] habilidades;
    private Tipo[] tipos;
    private int[] puntosVida;
    private Ataque[] ataques;

    public Pokemon(String[] nombres, String[] habilidades, Tipo[] tipos, int[] puntosVida, Ataque[] ataques) {
        this.nombres = nombres;
        this.habilidades = habilidades;
        this.tipos = tipos;
        this.puntosVida = puntosVida;
        this.ataques = ataques;
    }

    public String[] getNombres() {
        return nombres;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public Tipo[] getTipos() {
        return tipos;
    }

    public int[] getPuntosVida() {
        return puntosVida;
    }

    public Ataque[] getAtaques() {
        return ataques;
    }
}