## TEORIA MÉTODOS

#### ¿Qué es un método?

Un método es una colección de declaraciones o instrucciones que realizan una tarea 
específica. Los métodos en Java se utilizan para encapsular la lógica y el 
comportamiento de una parte del programa y permiten la **reutilización de código**.

Los métodos son utilizados para **evitar la repetición de código** en los programas. Estos 
métodos pueden ser llamados y ejecutados desde diferentes partes del programa.

En definitiva, el concepto básico de los métodos, es el de encapsular un conjunto de
instrucciones dentro de una declaración específica, permitiendo así descomposición funcional 
y la diferenciación de tareas.

La utilidad principal de los métodos es:

- Agrupar código que forma una entidad propia o una idea concreta
- Agrupar código que se necesitará varias veces en el programa, con la finalidad de no repetir código.
- Dividir el código de un programa grande en subprogramas, cada uno de ellos especializados en resolver una parte del problema.

#### ¿De qué se componen los métodos?

Los métodos están compuestos de varias partes:

- *Identificador*: Se definen mediante un nombre único que representa el bloque de código
- *Parámetros de entrada*: Se les pueden pasar valores para que los procesen de alguna manera.
- *Parámetro de salida*: Los métodos pueden (o no) devolver un valor en forma de parámetro de salida.
  - **return** es la palabra reservada en Java que se usa para devolver un valor.
- *Visibilidad*: Los métodos tienen una visibilidad para poder aplicar el principio de la *ocultación de la información* de la POO.
  - Los valores pueden ser: **public**, **private**, **default**, **protected**
- *static*: La directiva **static** se usa para hacer que un método o atributo pueda ser accedido o invocado sin la necesidad de instanciar un objeto. (Es opcional)

Ejemplo en pseudocódigo de función:  

```
visibilidad [static] parametro_de_salida identificador(parametros_de_entrada identificador_para_parametro) {  
    //operaciones que hace el método  
    return parametro_de_salida  
}
```



