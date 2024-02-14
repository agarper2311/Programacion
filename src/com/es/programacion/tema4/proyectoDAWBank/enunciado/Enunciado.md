## Proyecto Clase UbriBank

La empresa NewbiesCoders te ha contratado para desarrollar un software de gestión de una cuenta
bancaria para la cooperativa de banca ética y sostenible UbriBank. Se trata de una aplicación Java
formada por una clase principal UbriBank y otra llamada CuentaBancaria.

El programa pedirá los datos necesarios para crear una cuenta bancaria. Si son válidos, creará la
cuenta y mostrará el menú principal para permitir actuar sobre la cuenta. Tras cada acción se
volverá a mostrar el menú.

1. Datos de la cuenta. Mostrará el IBAN, el titular y el saldo.
2. IBAN. Mostrará el IBAN.
3. Titular. Mostrará el titular.
4. Saldo. Mostrará el saldo disponible.
5. Ingreso. Pedirá la cantidad a ingresar y realizará el ingreso si es posible.
6. Retirada. Pedirá la cantidad a retirar y realizará la retirada si es posible.
7. Movimientos. Mostrará una lista con el historial de movimientos.
8. Salir. Termina el programa.

**Clase CuentaBancaria**  
Una cuenta bancaria tiene como datos asociados el ***iban*** (international bank acount number,
formado por dos letras y 22 números, por ejemplo ES6621000418401234567891), el ***titular*** (un
nombre completo), el ***saldo*** (dinero en euros) y los ***movimientos*** (histórico de los movimientos
realizados en la cuenta, un máximo de 100 para simplificar).

Cuando se crea una cuenta es **obligatorio** que tenga un iban y un titular (que no podrán cambiar
nunca). El saldo será de 0 euros y la cuenta no tendrá movimientos asociados.

El saldo solo puede variar cuando se produce un ingreso (entra dinero en la cuenta) o una retirada
(sale dinero de la cuenta). En ambos casos se deberá registrar la operación en los movimientos. Los
ingresos y retiradas sólo pueden ser de valores superiores a cero.

El saldo de una cuenta nunca podrá ser inferior a -50 euros. Si se produce un movimiento que
deje la cuenta con un saldo negativo (no inferior a -50) habrá que mostrar el mensaje “AVISO: Saldo
negativo”. Si se produce un movimiento superior a 3.000 euros se mostrará el mensaje “AVISO:
Notificar a hacienda”.

**Clase UbriBank**  
Clase principal con función main. Encargada de interactuar con el usuario, mostrar el menú
principal, dar feedback y/o mensajes de error, etc. Utilizará la clase CuentaBancaria. Puedes
implementar las funciones que consideres oportunas.