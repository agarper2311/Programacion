## Practica 3. Login con Session

Realiza un programa que simule un acceso a un sistema mediante la introducción de usuario y contraseña. Este sistema 
implementará una lógica para agilizar el login de usuarios que tengan una sesión activa en el sistema, es decir, para 
usuarios que ya estén *"logueados"* el sistema únicamente pedirá el nombre de usuario, pero no pedirá la contraseña.

El proceso y las opciones del sistema son las siguientes:

1. El sistema da la bienvenida con un mensaje adecuado
2. El sistema muestra un menú de inicio donde las opciones son:
   - 1.Login
   - 2.Alta
   - 0.Salir
#### Opción 1.Login
3. Si el usuario escoge 1.Login, el sistema pedirá por el nombre de usuario
4. El sistema busca el nombre de usuario en un ArraList de Session y, si el usuario tiene presente una Session activa, entonces el sistema dará la bienvenida al sistema.
5. Si el usuario no tiene una sesión activa, entonces el sistema preguntará por la contraseña.
6. El sistema comprobará usuario y contraseña en un ArrayList de User para comprobar que las credenciales son correctas
7. Si son correctas, el sistema dará la bienvenida al usuario y procederá a insertar una nueva sesión en el ArrayList de Session.
8. Si las credenciales no son correctas, denegará el acceso al sistema.

#### Opción 2.Alta
3. Si el usuario escoge 2.Alta, el sistema pedirá al usuario por el nuevo nombre de usuario que desea
4. El sistema comprobará que dicho usuario no esté duplicado en el ArrayList de User
5. Si el usuario no está duplicado, entonces pedirá por su contraseña y procederá a dar de alta al usuario dentro del ArrayList de User
6. Si el usuario está duplicado, entonces el sistema informará de ello y volverá a preguntar por un nombre de usuario. Cuando se introduzca un nombre de usuario no duplicado, el sistema preguntará por la contraseña y dará de alta al usuario en el ArrayList de User.

#### Opción 0.Salir
3. El sistema mostrará un mensaje de despedida.


### Sistema de clases

**Clase User**
- user: String
- password: String

**Clase Session**
- nSession: String
- lastLogin: LocalDateTime
- sessionExpires: LocalDateTime
- usuario: User

**Clase UserSessionService**
- static usersRegistered: ArrayList\<User>
- static activeSessions: ArrayList\<Session>

+ checkIfUserExists(user: User): boolean
+ checkIfUserIsDuplicate(user: String): boolean
+ checkIfSessionIsActive(user: String): boolean
+ addUser(user: User): boolean
+ addSession(user: User): boolean

**Clase CompuGlobalHiperMegaNet**
+ static main(args: String[])

### Aclaraciones y obligaciones del sistema

1. usersRegistered contiene todos los usuarios registrados en el sistema
2. activeSessions contiene las sesiones activas en el sistema
3. sessionExpires es un atributo que determina hasta cuando la sesión es válida (se determina que las sesiones tienen una validez de 3 minutos)
4. checkIfSessionIsActive(user: String) comprueba si dicho usuario tiene una sesión activa. Si comprueba que la sesión ha expirado, entonces elimina dicha sesión del ArrayList\<Session>
5. user debe tener un formato de 5letras seguidas de 3numeros
6. password debe ser numérica y de longitud 5
7. nSession debe generarse con la clase UUID