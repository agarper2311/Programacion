# EJERCICIO 6 - VEHÍCULOS

Es muy aconsejable hacer el diseño UML antes de empezar a programar.

Debes crear varias clases para un software de una empresa de transporte. Implementa la jerarquía
de clases necesaria para cumplir los siguientes criterios:

- Los vehículos de la empresa de transporte pueden ser terrestres, acuáticos y aéreos. 
  - Los vehículos terrestres pueden ser coches y motos. Los vehículos acuáticos pueden ser barcos y
    submarinos. Los vehículos aéreos pueden ser aviones y helicópteros.


- Todos los vehículos tienen matrícula y modelo (datos que no pueden cambiar).
  - La matrícula de los coches terrestres deben estar formadas por 4 números y 3 letras. 
  - La de los vehículos acuáticos por entre 3 y 10 letras. La de los vehículos aéreos por 4 letras y 6 números.


- Los vehículos terrestres tienen un número de ruedas (dato que no puede cambiar).
- Los vehículos acuáticos tienen eslora (dato que no puede cambiar).
- Los vehículos aéreos tienen un número de asientos (dato que no puede cambiar).
- Los coches pueden tener aire acondicionado o no tenerlo.
- Las motos tienen un color.
- Los barcos pueden tener motor o no tenerlo.
- Los submarinos tienen una profundidad máxima.
- Los aviones tienen un tiempo máximo de vuelo.
- Los helicópteros tienen un número de hélices.
- No se permiten vehículos genéricos, es decir, no se deben poder instanciar objetos que sean
vehículos sin más. Pero debe ser posible instanciar vehículos terrestres, acuáticos o aéreos
genéricos (es decir, que no sean coches, motos, barcos, submarinos, aviones o helicópteros).

El diseño debe obligar a que todas las clases de vehículos tengan un método imprimir() que
imprima por pantalla la información del vehículo en una sola línea.
Implementa todas las clases necesarias con: atributos, constructor con parámetros, getters/setters
y el método imprimir. Utiliza abstracción y herencia de la forma más apropiada.
Implementa también una clase Programa para hacer algunas pruebas: Instancia varios vehículos de
todo tipo (coches, motos, barcos, submarinos, aviones y helicópteros) así como vehículos genéricos
(terrestres, acuáticos y aéreos). Crea un ArrayList y añade todos los vehículos. Recorre la lista y
llama al método imprimir de todos los vehículos.