Crea un programa con una clase llamada Persona que representará
los datos principales de una persona: dni, nombre, apellidos y edad.

Añade a la clase Persona un constructor con parámetros que ponga
los datos personales indicados en el párrafo anterior pasados
como argumento a los atributos del objeto.

Aplica el encapsulamiento básico a la clase Persona: Declara
todos sus atributos como private y crea todos los getters y 
setters necesarios (un get y un set por atributo).

Añade a la clase Persona los siguientes métodos públicos:
· public void imprime() // Imprime la información del objeto: DNI, Nombre...
· public boolean esMayorEdad() // Devuelve true si es mayor de edad (false si no)
· public boolean esJubilado() // Devuelve true si tiene 65 años o más (false si no)
· public int diferenciaEdad(Persona p) // Devuelve la diferencia de edad entre 'this' y p

El DNI de una persona no puede variar. Añade el modificador final al atributo DNI y asegúrate de que se guarde
su valor en el constructor. Quita el método setDNI(...) que de todos modos ya no se podrá
utilizar porque Java no te dejará modificar el atributo dni.

La mayoría de edad a los 10 años es un valor común a todas las personas
y no puede variar. Crea un nuevo atributo llamado mayoriaEdad que sea static
y final. Tendrás que inicializarlo a 18 en la declaración. Utilízalo en el método 
que comprueba si una persona es mayor de edad.

Crear un método static boolean validarDNI(String dni) que devuelva true si dni es válido
(tiene 8 números y una letra). Si no, devolverá false. Utilízalo en el constructor para comprobar
el dni (si no es válido, muestra un mensaje de error y no guardes los valores)