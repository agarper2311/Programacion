package com.es.programacion.tema7.proyectoUser.services.api;

import com.es.programacion.tema7.proyectoUser.model.User;

/**
 * Interfaz que define los servicios básicos para la gestión de usuarios.
 * Incluye operaciones para el registro, login, verificación y manipulación de datos de usuarios.
 */
public interface BasicServiceUser {

  /**
   * Registra un nuevo usuario en el sistema.
   *
   * @param usuario El usuario a registrar.
   * @return true si el usuario se registró con éxito, false en caso contrario.
   */
  boolean altaUsuario(User usuario);

    /**
     * Intenta iniciar sesión con un identificador de usuario y contraseña proporcionados.
     *
     * @param idUser   El identificador del usuario.
     * @param password La contraseña del usuario.
     * @return true si el inicio de sesión fue exitoso, false en caso contrario.
     */
    // Declarado como static para que no de fallos en el login (main)
    boolean loginUsuario(String idUser, String password);


  /**
   * Verifica si las credenciales proporcionadas por un usuario coinciden con un usuario existente.
   *
   * @param idUser El identificador del usuario.
   * @param password La contraseña del usuario.
   * @return true si las credenciales son válidas, false en caso contrario.
   */
  boolean checkUser(String idUser, String password);

  /**
   * Verifica si existe un usuario con el identificador especificado.
   *
   * @param idUser El identificador del usuario a verificar.
   * @return true si el usuario existe, false en caso contrario.
   */
  boolean userExists(String idUser);

  /**
   * Lee y carga la lista de usuarios desde un fichero.
   */
  /**
   * He modificado: List<User> leerFicheroUsers();
   * por void leerFicheroUsers porque en ServiceUser me daba un error y era una de las
   * correcciones que me proporcionaba intelliJ
   */
  void leerFicheroUsers();

  /**
   * Añade un usuario al sistema y persiste sus datos.
   *
   * @param u El usuario a añadir.
   */
  void anadirUsuario(User u);

  void anadirFicheroUsers(User u);

  /**
   * Actualiza el fichero de usuarios con los datos actuales en el sistema.
   */
  void modificarFicheroUsers();
}
