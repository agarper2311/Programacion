package com.Programacion.Tema5.proyectoAgenda.clases;

import com.Programacion.Tema5.proyectoAgenda.utils.AgendaUtils;

public class Persona1 {

    private String nombre;
    private String dni;
    private int edad;
    private String email;
    private String telefono;
    private Direccion direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (AgendaUtils.checkNombre(nombre)) {
            this.nombre = nombre;
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if(AgendaUtils.checkDni(dni)) {
            this.dni = dni;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(AgendaUtils.checkEmail(email)) {
            this.email = email;
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if(AgendaUtils.checkTlfn(telefono)) {
            this.telefono = telefono;
        }
    }



    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void presentacion() {
        System.out.printf("Hola me llamo %s, con dni %s y tengo %d anios\n", this.nombre, this.dni, this.edad);
        System.out.printf("Puedes contactarme en %s o en mi teléfono %s\n", this.email, this.telefono);

        System.out.print("Si quieres vistarme, ven a ");
        // direccion.presentacion();
    }
}