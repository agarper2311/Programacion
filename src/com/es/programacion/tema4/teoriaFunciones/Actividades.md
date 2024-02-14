## Ejercicios Funciones

### Ejercicio 1
Hacer un método que dada una fecha de nacimiento, devuelva el signo zodiacal de esa persona 
¿Qué le entra por parámetros? -> dia mes y anio
¿Qué devuelve la funcion? -> Un String


### Ejercicio 2
Un método que dado el número de DNI, devuelva la letra correspondiente

La letra asociada a un DNI se obtiene dividiendo el número del DNI entre 23 y el resto es codificado siguiendo la siguiente correspondencia:
0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N",
13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E"
Un método que dado un DNI (con su letra), devuelva true o false si el DNI es válido o no.

NOTAS
Comprobar la longitud
Comprobar que la letra es correcta

### Ejercicio 3
Hacer un método para calcular la efectividad de un ataque pokemon contra otro.
El método recibe el tipo de un pokemon atacante y el tipo del pokemon que recibe el ataque.
Según ambos tipos, el método devuelve un multiplicador de daño según los siguientes criterios:
muy efectivo : devuelve 1.5
poco efectivo: devuelve 0.5
inmune: devuelve 0
normal: devuelve 1

Ejemplo:

tipoAtaca -> "Fuego"
tipoRecibe -> "Planta"

método devuelve -> 1.5

### Ejercicio 4
Escribir un método que reciba por parámetros un String (la contraseña)
y devuelva la misma contraseña ya encriptada, haciendo uso del cifrado
césar

Ejemplo:
pass = "pass123"
pass retornada = "sdvv456"

Consejos:
- Crear una variable auxiliar para almacenar la nueva password
- Recorrer el string y tratar cada uno de los caracteres individualmente
- Sumar 3 a cada caracter -> obtenemos un nuevo caracter
- Concatenar dicho caracter nuevo a la variable auxiliar

Formato del método:

``
public static String cifrarPasswd(String password){
    String passwordCifrada = "";
    return passwordCifrada;
}
``
