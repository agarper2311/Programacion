package com.es.programacion.tema7.proyectoUbriCine.utils;

import com.es.programacion.tema7.proyectoUbriCine.model.User;

/**
 * Clase de utilidad para validar las propiedades de los objetos User.
 * Proporciona métodos estáticos para realizar diferentes validaciones,
 * como verificar la validez del ID, nombre, y contraseña de un usuario.
 */
public class UserValidator {

    /**
     * Valida el ID del usuario.
     *
     * @param id El ID del usuario a validar.
     * @return true si el ID es válido, false en caso contrario.
     */
    public static boolean isValidId(String id) {
        // Implementación de ejemplo: verifica que el ID no sea nulo y no esté vacío.
        return id != null && !id.trim().isEmpty();

        /*
        Nota:
        He hecho uso de .trim para eliminar los espacios en
        blanco que pudiese haber al inicio o al final de la
        línea para evitar errores
         */
    }

    /**
     * Valida el nombre del usuario.
     *
     * @param name El nombre del usuario a validar.
     * @return true si el nombre es válido, false en caso contrario.
     */
    public static boolean isValidName(String name) {
        // Implementación de ejemplo: verifica que el nombre no sea nulo, no esté vacío y tenga una longitud adecuada.
        return name != null && !name.trim().isEmpty() && name.length() >= 2;
    }

    /**
     * Valida la contraseña del usuario.
     *
     * @param password La contraseña del usuario a validar.
     * @return true si la contraseña es válida, false en caso contrario.
     */
    public static boolean isValidPassword(String password) {
        // Implementación de ejemplo: verifica que la contraseña no sea nula, no esté vacía y cumpla con una longitud mínima.
        return password != null && !password.trim().isEmpty() && password.length() >= 6;
    }

    /**
     * Valida un objeto User completo, verificando su ID, nombre y contraseña.
     *
     * @param user El objeto User a validar.
     * @return true si el usuario es válido, false en caso contrario.
     */
    public static boolean isValidUser(User user) {
        return isValidId(user.getId()) && isValidName(user.getName()) && isValidPassword(user.getPassword());
    }
}
