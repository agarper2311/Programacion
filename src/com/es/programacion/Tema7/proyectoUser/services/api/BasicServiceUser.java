package com.es.programacion.Tema7.proyectoUser.services.api;
import com.es.programacion.tema7.proyectoUser.model.User;
public interface BasicServiceUser {


  public boolean altaUsuario();
  public boolean loginUsuario();
  public boolean checkUser(String idUser, String password);
  public boolean checkExists(String idUser);

  public void leerFicheroUsers();
  public void anadirFihceroUsers(User u);
  public void modificarFicheroUsers();

}
