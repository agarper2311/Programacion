### Proyecto Peliculas

#### Estructura de carpetas
La estructura de carpetas del proyecto a realizar es el siguiente:

- proyectoPeliculas
    - clases
        - Pelicula.java
    - utils
        - JsonReaderUtil.java
    - Main.java

#### Librería GSON externa y uso de la misma

Sigue las instrucciones que podrás ver en Moodle para incorporar la librería GSON a tu proyecto.

#### Lectura de archivo de peliculas

Para poder realizar la práctica deberás seguir exactamente los pasos que se indican:
1. Descarga e incluye en tu proyecto el archivo *Top250Movies.json*
2. La estructura de carpetas donde deberás incluir dicho archivo es la siguiente
    - resources
        - IMDB-api
            - Top250Movies.json
3. Dentro de la clase Main.java incluye las siguientes dos líneas de código:
```java:
String pelisPath = "IMDB-api/Top250Movies.json";
ArrayList<Pelicula> peliculas = JsonReaderUtil.loadJsonFile(pelisPath);
```
4. La clase Pelicula debe ser exactamente como se indica en la práctica.

#### Ejercicios a realizar

La práctica consiste en realizar un pequeño programa que permita realizar consultas sobre los datos que tenemos de películas.
A la hora de tratar con estos datos, simplemente vamos a tener que ir accediendo al ArrayList para comprobar lo que se nos pida.

***RECUERDA***
La manera que conocemos de recorrer un ArrayList es con un for normal y corriente de la siguiente manera:
```java:
for(int i=0; i< peliculas.size(); i++) {
    sout(peliculas.getTitle()); // Esto imprimirá por pantalla cada uno de los títulos de las películas que tenemos 
}
```

Realiza un menú con las siguientes opciones:

1. Imprimir las películas de una década dada por teclado
    - Mostrar el título completo, nota, reparto y posición en la lista de todas las películas de dicha década.
    - Si no encuentra ninguna película con los parámetros indicados mostrará un mensaje adecuado indicándolo.
2. Opción para incorporar una nueva película en el ArrayList\<Pelicula>.
    - El programa pedirá el título, el anio y la puntuación.
    - También pedirá el director y los dos actores/actrices principales de la película (recuerda seguir el formato correcto a la hora de establecer los datos)
    - Por último, la película se incorporará en la posición correcta de la lista según su nota
3. Opción para eliminar una película de la lista (por posición en la lista)
    - El programa pedirá la posición de la lista que se quiere eliminar
    - Es imprescindible mostrar un mensaje de error si se introduce una posición que está fuera del rango de películas existentes.
4. Opción para eliminar una película de la lista (por nombre de la película)
    - El programa pedirá el nombre de la película y procederá a eliminar dicha película de la lista
    - Si no encuentra la película deberá mostrar un mensaje indicándolo.
5. Opción para cambiar los datos de una película de la lista.
    - El programa pedirá el nombre de la película a modificar y seguidamente mostrará todos los datos de la misma.
    - Una vez se vean los datos, se pedirán los nuevos datos relativos a:
        - Título
        - Anio
        - Nota
        - Director/a
        - Reparto (2 actores/actrices principales)
        - El resto de datos no se pueden modificar
    - Si no se encuentra la película indicada el programa debe mostrar un mensaje indicándolo.