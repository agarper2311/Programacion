# Proyecto Combate Pokémon

### Enunciado

El proyecto va a girar en torno a la creación de una pequeña aplicación que simule
un combate Pokémon. Cada jugador tendrá como máximo 3 pokemon, y habrá un máximo de
2 jugadores. Cada jugador elegirá un equipo en función de los poquemon ofrecidos.

El combate empezará y el pokemon nº1 del jugador 1 se enfrentará al pokemon nº1 del
jugador 2, los cuales lucharán hasta que uno de los 2 pokemons que se enfrentan se 
queden sin vida. Entonces, cuando el pokemon del jugador 1 o el jugador 2 se quede sin 
vida, dará paso al siguiente, así hasta que uno de los 2 jugadores se quede sin pokemons.

Cuando se declare un ganador, se mostrará un mensaje con el nombre del jugador que ha ganado
y finalizará el juego.


#### Clases

##### Clase Pokemon
Deberá de contener:

- Una lista de los nombres de los pokemons.
- El lore de cada Pokemon (la historia).
- El tipo de pokemon que es.
- La vida máxima de cada pokemon.
- Y una lista de ataques de cada pokemon.

##### Clase tipo
Deberá contener:

- Un constructor personalizado, el cual deberá llamar al método checkTipoExiste de la 
clase Pokedex, para comprobar que el nombre del tipo que se intenta poner es correcto.

Atributos de clase

nombre: String
Constructores de clase

Tipo(nombre: String)


##### Clase Ataque
La clase Ataque será la encargada de contener la abstracción de cada ataque de los Pokemon. Tendrá los atributos que se indican en el apartado atributos de clase

Tendrá un constructor personalizado, el cual recibe por parámetros todo lo que se indica dentro del apartado

Atributos de clase

nombre: String
tipo: Tipo
danio: int
Constructores de clase

Ataque(nombre: String, tipo: Tipo, danio: int)

##### Clase Pokédex
La clase Pokedex será la encargada de contener la abstracción relativa a la comprobación de tipos, de efectividades, etc.

Como atributos de clase, contendrá los indicados dentro del apartado atributos de clase. Como indicación extra, el atributo tiposAceptados, es un array de String que contendrá todos los tipos aceptados por la aplicación.

El método checkTipoExiste comprobará la existencia del tipo para así asegurar que el tipo que se intenta poner es correcto.

Atributos de clase

private tiposAceptados: String[]

public boolean checkTipoExiste(nombre: String)
public double checkEfectividad(tipoAtaque: Tipo, tipoRecibeAtaque: Tipo)