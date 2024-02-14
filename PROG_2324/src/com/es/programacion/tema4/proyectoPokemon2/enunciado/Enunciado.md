# Proyecto Combate Pokemon

### Enunciado
El proyecto va a girar en torno a la creación de una pequeña aplicación que simule un combate
pokemon. Cada jugador tendrá como máximo 3 pokemon, y habrá un máximo de 2 jugadores.
Cada jugador elegirá un equipo en función de los pokemon ofrecidos.

El combate empezará y el pokemon nº1 del jugador 1 se enfrentará al pokemon nº1 del jugador 2, los cuales
*lucharán* hasta que uno de los dos se quede sin energía. Cuando uno de los dos se quede sin energía, entrará
en combate el siguiente pokemon del jugador. Este proceso seguirá hasta que uno de los jugadores se quede sin Pokemon.

Cuando se declare un ganador, se mostrará un mensaje adecuado para tal efecto y el programa terminará.

### Clases

Todas las clases que se indican a continuación deberán contener como mínimo todos los atributos, constructores y métodos
que se indican.

#### *Clase Pokemon*

La clase Pokemon será la encargada de contener la abstracción de las entidades
Pokemon. Esta tendrá los atributos que se indican a continuación.  

Tendrá un constructor de clase personalizado que establecerá los atributos que se especifican.

*Atributos de clase*
```
nombre: String
lore: String
tipo: Tipo
vida: int
ataques: Ataque[]
```

*Constructores de clase*
```
Pokemon(nombre: String, tipo: Tipo, vida: int)
```

#### *Clase Tipo*

La clase Tipo será la encargada de la abstracción de los tipos 
de los Pokemon. Tendrá los atributos que se indican en el apartado
*atributos de clase*.  

Tendrá un constructor personalizado, el cual deberá
llamar al método de clase *checkTipoExiste* de la clase *Pokedex* para comprobar que
el nombre del tipo que se intenta poner es correcto.

*Atributos de clase*
```
nombre: String
```

*Constructores de clase*
```
Tipo(nombre: String)
```

*Métodos de clase*
```
```

#### *Clase Ataque*

La clase Ataque será la encargada de contener la abstracción de cada ataque de los Pokemon. Tendrá los atributos 
que se indican en el apartado *atributos de clase*

Tendrá un constructor personalizado, el cual recibe por parámetros todo lo que se indica dentro del apartado


*Atributos de clase*
```
nombre: String
tipo: Tipo
danio: int
```

*Constructores de clase*
```
Ataque(nombre: String, tipo: Tipo, danio: int)
```

#### *Clase Pokedex*

La clase Pokedex será la encargada de contener la abstracción relativa a la comprobación de tipos, de efectividades, etc.  

Como atributos de clase, contendrá los indicados dentro del apartado *atributos de clase*. Como indicación extra, el atributo
**tiposAceptados**, es un array de String que contendrá todos los tipos aceptados por la aplicación.

El método *checkTipoExiste* comprobará la existencia del tipo para así asegurar que el tipo que se intenta poner es correcto.

*Atributos de clase*  
```
private tiposAceptados: String[]
```

*Constructores de clase*
```
```

*Métodos de clase*
```
public boolean checkTipoExiste(nombre: String)
public double checkEfectividad(tipoAtaque: Tipo, tipoRecibeAtaque: Tipo)
```


