# **RESTfulWS**
Evidencia para la materia Computación avanzada en Java.

# Instalación

## Requerimientos de la evidencia:
Estos son los requermientos que utilizamos en nuestra evidencia
1. Git
2. Eclipse
3. Java EE
4. Maven
5. Apache Tomcat

## Pasos a seguir

- Tenemos que clonar el repositorio 
``` git clone https://github.com/ilianaporras20/RESTfulWS ```
- Tenemos que abrir proyecto desde Eclipse y tambien hay que limpiar y construir proyecto
- Daremos clic derecho al proyecto en Eclipse.
- Le daremos clic a  **Exportar -> Archivo WAR**.
-  Tenemos que accesar almanager tomcat http://localhost:{PORT}/manager con credenciales de usuario con rol admin-gui
- Daremos clic al archivo .war creado anteriormente
- Para finalizae se desplegara

# Uso:
A en este apartado se explicaremos los métodos disponibles para esta aplicación:
 1. Ruta api/v1/

- **GET**: *Comando de ista de los recursos disponibles.*
- **OPTIONS**: *Comando de documentación.*

 2. Ruta api/v1/file

- **GET**: *Este comando se descarga archivo en base al parámetro path.*
```
 api/v1/file/?path= 
 ```
- **POST**: *Este comando sube archivos con los parámetros name, dir y file.*
``` 
api/v1/file/ name="logo.jpg" dir="/Files" file@/Users/User/Desk/imagen.jpg --form

```
- **DELETE**: *Este comando elimina un archivo mediante el parámetro path.*
``` 
api/v1/file/?path=
``` 
3. Ruta api/v1/directory

- **GET**: *Este comando es una lista de los archivos de un directorio con el parámetro dir.*
``` 
api/v1/directory/?dir=
``` 
- **OPTIONS**: *Comando de documentación.*

4. Ruta api/v1/notify

- **GET**: *Este comando realiza una lista las notificaciones enviadas.*
- **POST**: *Este comando envía una notificación en base a los parámetros subject, message, toAddress y ccAddress.*
``` 
api/v1/notify subject="Test" message="Test Mensaje" toAddress="iliana.porras@gmail.com"  ccAddress="iliana_099@gmail.com"
ili``` 
- **OPTIONS**: *Comando de documentación.*

5. Ruta api/v1/user

- **GET**: *Este comando realiza Listas de usuarios*
- **POST**: *Este comando crea un usuario con los parámetros username,password y fullName.*

```
api/v1/user username="u" password="iAp" fullName="Iliana Porras"
``` 
- **OPTIONS**: *Comando de documentación.*

6. Ruta api/v1/user/{username}

- **GET**: *Este comando nos enseña la información del usuario*
- **PUT**: *Este comando actualiza la información del usuario con los parámetros username, password y fullName.*
``` 
api/v1/user/user username="u" password="iAp" fullName="Iliana Porras" 
``` 
- **DELETE**: *Este comando Eliminar un usuario*
- **OPTIONS**: *Comando de documentación.*

# Créditos
- Iliana Aracely Porras Rico **2686254**

# Licencia
*El código está disponible bajo la licencia GNU GPL-3.0*
