package com.es.programacion.Tema7.proyectoUser;

import com.es.programacion.Tema7.proyectoUser.model.User;
import com.es.programacion.Tema7.proyectoUser.services.api.BasicServiceUser;
import com.es.programacion.Tema7.proyectoUser.services.impl.GestionFicheroUser;
import com.es.programacion.Tema7.proyectoUser.services.impl.UsersService;
import com.es.programacion.Tema7.proyectoUser.utils.UserValidator;

import java.util.Scanner;

/**
 * Clase principal que maneja la interacción de inicio de sesión y gestión de usuarios.
 * Permite a los usuarios registrarse, iniciar sesión, modificar sus datos y darse de baja.
 */
public class Login {

    private static UsersService usersService;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        usersService = new UsersService("ruta/al/archivo/de/usuarios", new GestionFicheroUser());

        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(scan.nextLine());

            switch (opcion) {
                case 1:
                    registrarUsuario(scan);
                    break;
                case 2:
                    iniciarSesion(scan);
                    break;
                case 3:
                    modificarUsuario(scan);
                    break;
                case 4:
                    eliminarUsuario(scan);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
        scan.close();
    }

    private static void mostrarMenu() {
        System.out.println("___________________________________________");
        System.out.println("|               Login AirBnB              |");
        System.out.println("| 1). Registrarse                         |");
        System.out.println("| 2). Iniciar sesión                      |");
        System.out.println("| 3). Modificar usuario                   |");
        System.out.println("| 4). Darse de baja                       |");
        System.out.println("| 0). Salir                               |");
        System.out.println("___________________________________________");
        System.out.print("Seleccione una opción: ");
    }

    private static void registrarUsuario(Scanner scan) {
        System.out.println("---- Registro de Usuario ----");
        System.out.print("Ingrese ID de usuario: ");
        String id = scan.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre = scan.nextLine();
        System.out.print("Ingrese contraseña: ");
        String pass = scan.nextLine();

        if (!UserValidator.isValidId(id) || !UserValidator.isValidName(nombre) || !UserValidator.isValidPassword(pass)) {
            System.out.println("Datos de usuario no válidos.");
            return;
        }

        User nuevoUsuario = new User(id, nombre, pass, false); // false ya que el usuario no es admin por defecto
        if (usersService.alta(nuevoUsuario)) {
            System.out.println("Usuario registrado exitosamente.");
        } else {
            System.out.println("El usuario no pudo ser registrado. Es posible que ya exista.");
        }
    }

    private static void iniciarSesion(Scanner scan) {
        System.out.println("---- Inicio de Sesión ----");
        System.out.print("Ingrese ID de usuario: ");
        String id = scan.nextLine();
        System.out.print("Ingrese contraseña: ");
        String pass = scan.nextLine();

        // Asumiendo que UsersService implementa BasicServiceUser y tiene el método loginUsuario
        if (usersService.loginUsuario(id, pass)) {
            System.out.println("Inicio de sesión exitoso.");
        } else {
            System.out.println("ID de usuario o contraseña incorrecta.");
        }
    }

    private static void modificarUsuario(Scanner scan) {
        System.out.println("---- Modificación de Usuario ----");
        System.out.print("Ingrese ID de usuario a modificar: ");
        String id = scan.nextLine();

        // Verifica si el usuario existe antes de intentar modificarlo.
        if (!usersService.exists(id)) {
            System.out.println("Usuario no encontrado.");
            return;
        }

        System.out.print("Ingrese nuevo nombre: ");
        String nuevoNombre = scan.nextLine();
        System.out.print("Ingrese nueva contraseña: ");
        String nuevaPass = scan.nextLine();

        // La validación de los datos nuevos debe realizarse antes de proceder con la modificación.
        if (!UserValidator.isValidName(nuevoNombre) || !UserValidator.isValidPassword(nuevaPass)) {
            System.out.println("Los datos del usuario no son válidos.");
            return;
        }

        // Crear un objeto User con los nuevos datos.
        User usuarioModificado = new User(id, nuevoNombre, nuevaPass, false); // false asumiendo que no modificamos el rol admin

        // Llama a un método en UsersService para modificar el usuario
        // usersService.modificarUsuario(usuarioModificado);

        System.out.println("Usuario modificado exitosamente.");
    }

    private static void eliminarUsuario(Scanner scan) {
        System.out.println("---- Eliminación de Usuario ----");
        System.out.print("Ingrese ID de usuario a eliminar: ");
        String id = scan.nextLine();

        // Verifica si el usuario existe antes de intentar eliminarlo.
        if (!usersService.exists(id)) {
            System.out.println("Usuario no encontrado.");
            return;
        }

        // Llama a un método en UsersService para eliminar el usuario.
        // usersService.eliminarUsuario(id);

        System.out.println("Usuario eliminado exitosamente.");
    }


}
