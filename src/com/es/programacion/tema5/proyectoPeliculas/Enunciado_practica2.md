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
1ª Parte de la clase  
Mejorar el acceso a los atributos de clase  
A la hora de acceder a los atributos de clase, ya sabemos que tenemos que aplicar el principio de la
ocultación de la información. Por ahora, lo estamos dejando sencillo, es decir, no estamos controlando
los valores que se pueden establecer para nuestros atributos de clase. Vamos a pensar qué restricciones
podemos aplicar a los atributos de la clase Película, e implementamos la lógica pertinente.
- El fullTitle -> Se compone simplemente del titulo junto con el anio de la peli
- El year -> Debemos cerciorarnos de que el anio es positivo y además de que es un número
- El crew -> Se compone del director seguido de (dir.) y del nombre de los dos actores/actrices principales
- El imdbRating -> Es una nota de tipo double (separada por un punto). Cerciorarnos de que es mayor que 0.0

2ª Parte de la clase
CRUD de Peliculas

¿Qué es un CRUD?
CRUD son las siglas de Create (Crear) Read (Leer) Update (Actualizar) Delete (Eliminar).
Hacer un CRUD es simplemente implementar una serie de funcionalidades para conseguir cada una
de las siglas.
Cada aplicación tiene sus reglas propias en cuanto a la actualización o modificación de los registros
de la base de datos.
Vamos a implementar las funcionalidades relativas a un CRUD simple:
C -> Crear un registro nuevo
R -> Obtener un registro concreto por título de película
U -> Actualizar un registro concreto por título de película
D -> Eliminar un registro concreto por título de película


Realiza un menú con las siguientes opciones:

1. Opción para incorporar una nueva película en el ArrayList\<Pelicula>.
   - El programa pedirá el título, el anio y la puntuación.
   - También pedirá el director y los dos actores/actrices principales de la película (recuerda seguir el formato correcto a la hora de establecer los datos)
   - Por último, la película se incorporará en la posición correcta de la lista según su nota
2. Opción para eliminar una película de la lista (por posición en la lista)
   - El programa pedirá la posición de la lista que se quiere eliminar
   - Es imprescindible mostrar un mensaje de error si se introduce una posición que está fuera del rango de películas existentes.
3. Opción para eliminar una película de la lista (por nombre de la película)
   - El programa pedirá el nombre de la película y procederá a eliminar dicha película de la lista
   - Si no encuentra la película deberá mostrar un mensaje indicándolo.
4. Opción para cambiar los datos de una película de la lista.
   - El programa pedirá el nombre de la película a modificar y seguidamente mostrará todos los datos de la misma.
   - Una vez se vean los datos, se pedirán los nuevos datos relativos a:
     - Título
     - Anio
     - Nota
     - Director/a
     - Reparto (2 actores/actrices principales)
     - El resto de datos no se pueden modificar
   - Si no se encuentra la película indicada el programa debe mostrar un mensaje indicándolo.