package com.Programacion.Tema5.proyectoLogginSession.Clases;

import java.time.LocalDateTime;
import java.util.UUID;

public class Session {
    private String nSession;
    private LocalDateTime lastlogin;
    private LocalDateTime sessionExpires;
    private User usuario;

    public Session(User usuario) {
        this.nSession = UUID.randomUUID().toString();
        this.lastlogin = LocalDateTime.now();
        this.sessionExpires = this.lastlogin.plusMinutes(3);
        this.usuario = usuario;
    }

    // Getters y setters
    public String getnSession() {
        return nSession;
    }

    public void setnSession(String nSession) {
        this.nSession = nSession;
    }

    public LocalDateTime getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(LocalDateTime lastlogin) {
        this.lastlogin = lastlogin;
    }

    public LocalDateTime getSessionExpires() {
        return sessionExpires;
    }

    public void setSessionExpires(LocalDateTime sessionExpires) {
        this.sessionExpires = sessionExpires;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }
}
