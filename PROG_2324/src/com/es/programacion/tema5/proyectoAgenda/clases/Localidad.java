package com.es.programacion.tema5.proyectoAgenda.clases;

import com.es.programacion.tema5.proyectoAgenda.utils.AgendaUtils;

public class Localidad {

    private String munipio;
    private String provincia;
    private String cp;

    public String getMunipio() {
        return munipio;
    }

    public void setMunipio(String munipio) {
        this.munipio = munipio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        if(AgendaUtils.checkCP(cp)) {
            this.cp = cp;
        }
    }

    public void presentacion() {
        System.out.printf("%s (%s), %s", this.munipio, this.provincia, this.cp);
    }
}
