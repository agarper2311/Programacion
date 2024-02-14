package com.es.programacion.tema4.proyectoPersona.clases;

public class Persona {

    // ATRIBUTOS DE CLASE
    public String nombre, dni, apellidos, colorPiel, colorPelo;
    public int edad;
    public double altura;

    public Direccion direccion;

    /**
     * Añadir un atributo publico "estaTrabajando"
     * Atributo de tipo boolean inicializado por defecto a false.
     */
    public boolean estaTrabajando = false;


    // CONSTRUCTOR DE CLASE
    /**
     * Definir un constructor de clase para Persona
     * Se le pasa el nombre, dni, apellidos y edad
     */
    public Persona(String dni, String nombre, String apellidos, int edad, Direccion dir) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;

        this.direccion = dir;
    }

    public Persona(String dni) {
        this.dni = dni;
    }


    // METODOS DE CLASE
    /**
     * Método para presentar a una persona
     */
    public void presentarse() {
        System.out.println("" +
                "\nHola, mi nombre es "+this.nombre+" " +
                "\ny tengo "+this.edad+" anios.");

        System.out.format("Vivo en la calle %s numero %d , de %s (%s)", this.direccion.calle, this.direccion.numero, this.direccion.localidad, this.direccion.provincia);
    }

    /**
     * Método que anade 1 anio a la edad
     */
    public void cumplirAnios() {
        this.edad = this.edad + 1; // this.edad++; this.edad += 1;
    }

    public void cambiarColorPelo(String nuevoColorPelo) {
        System.out.println("Tenia el pelo de color "+this.colorPelo);
        this.colorPelo = nuevoColorPelo;
        System.out.println("Y ahora lo tengo "+this.colorPelo);
    }

    /**
     * Método que comprueba si esta persona es mayor de edad
     * El método devuelve un boolean
     */
    public boolean esMayorDeEdad() {
        return this.edad>=18;
    }

    /**
     * Método que comprueba si dos personas son iguales
     * El método devuelve un boolean
     */
    public boolean sonIguales(Persona otraPersona) {

        if(this.dni.equals(otraPersona.dni) && this.nombre.equals(otraPersona.apellidos) && this.apellidos.equals(otraPersona.apellidos)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que da de alta y de baja a la persona en un trabajo
     * El método se llama cambiarEstadoTrabajo
     *
     * Si está trabajando -> Se pone a que ya no está trabajando
     * Si no está trabajando -> Se pone a que sí está trabajando
     */
    public void cambiarEstadoTrabajo() {
        if(this.estaTrabajando) {
            this.estaTrabajando = false;
        } else {
            this.estaTrabajando = true;
        }

        // Otra solucion mucho más elegante (Codigo de Angel)
        // this.estaTrabajando = !this.estaTrabajando;
    }






}
