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

1. Imprimir las películas de mayor a menor nota
   - Mostrar por pantalla el título y la nota de la película 
2. Imprimir las películas de menor a mayor nota
  - Mostrar por pantalla el título y la nota de la película
3. Imprimir las películas cuyo año de publicación sea del 2000 hasta la actualidad
  - Mostrar por pantalla el título completo de la película (nombre y año)
4. Imprimir las películas cuyo año de publicación sea del 2000 hasta la actualidad que tengan una nota por encima de 8.8 (incluído)
  - Mostrar por pantalla el título completo, nota y reparto.
5. Imprimir las películas cuyo año de publicación sea del 2000 hasta la actualidad que tengan una nota por encima de una nota que diga el usuario por teclado
   - Mostrar por pantalla el título completo, nota y reparto.
   - Si no encuentra ninguna película con los parámetros indicados mostrará un mensaje adecuado indicándolo.
6. Imprimir por pantalla una película que el usuario introduce por teclado.
  - Mostrar el título completo, nota, reparto y posición en la lista
  - Si no encuentra ninguna película con los parámetros indicados mostrará un mensaje adecuado indicándolo.
7. Imprimir por pantalla las peliculas de un director que el usuario introduce por teclado.
  - Mostrar el nombre del director seguido del título completo de todas las peliculas que ha realizado.
  - Si no encuentra ninguna película con los parámetros indicados mostrará un mensaje adecuado indicándolo.