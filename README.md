# RESTfulWS
Evidencia para la materia Computación avanzada en Java.

# Instalación

## Requerimientos

Git
Eclipse
Java EE
Maven
Apache Tomcat

## Pasos

- Clonar repositorio git clone 
``` https://github.com/ilianaporras20/RESTfulWS 
```

- Abrir proyecto desde Eclipse
- Limpiar y construir proyecto
- Clic derecho al proyecto en Eclipse.
- Seleccionar Exportar -> Archivo WAR.
- Acceder al manager tomcat http://localhost:{PORT}/manager con credenciales de usuario con rol admin-gui
- Seleccionar archivo .war creado anteriormente
- Desplegar

# Uso
A en este apartado se explican los métodos disponibles para esta aplicación correspondientemente a cada ruta de acceso:
   ## Ruta api/v1/

- GET: Lista los recursos disponibles.
- OPTIONS: Documentación.

## Ruta api/v1/file

- GET: Descarga archivo en base al parámetro path.
 api/v1/file/?path=
- POST: Sube algún archivo con los parámetros name, dir y file.
api/v1/file/ name="imagen.jpg" dir="/Files" file@/Users/User/Downloads/imagen.jpg --form
- DELETE: Elimina un archivo mediante el parámetro path.
api/v1/file/?path=
- OPTIONS: Documentación.

## Ruta api/v1/directory

- GET: Lista los archivos de un directorio con el parámetro dir.
api/v1/directory/?dir=
- OPTIONS: Documentación.

## Ruta api/v1/notify

- GET: Lista las notificaciones enviadas.
- POST: Envía una notificación en base a los parámetros subject, message, toAddress y ccAddress.
api/v1/notify subject="Test" message="Test Mensaje" toAddress="ej@contoso.com" ccAddress="ej2@contoso.com"
- OPTIONS: Documentación.

## Ruta api/v1/user

- GET: Lista los usuarios.
- POST: Crea un usuario mediante los parámetros username, password y fullName.
api/v1/user username="user" password="pass" fullName="Iliana Porras"
- OPTIONS: Documentación.

## Ruta api/v1/user/{username}

- GET: Muestra la información del usuario.
- PUT: Actualiza la información del usuario mediante los parámetros username, password y fullName.
api/v1/user/user username="user" password="pass" fullName="Iliana Porras"
- DELETE: Elimina al usuario.
- OPTIONS: Documentación.

# Créditos
- Iliana Aracely Porras Rico 2686254

# Licencia
El código está disponible bajo la licencia GNU GPL-3.0
