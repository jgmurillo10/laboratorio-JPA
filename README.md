# JAX-RS Template Application

This is a template for a lightweight RESTful API using JAX-RS. The sample code is a call for getting the current time.
    
## Running the application locally

First build with:

    $mvn clean install

Then run it with:

    $ java -cp target/classes:target/dependency/* com.example.Main


    DOCS
    - Solicitudes POSTMAN
    	En la carpeta docs/ se encuentra un archivo con todas las solicitudes necesarias para probar la app, puede abrirlas en Postman.
    	

    SERVICES

    - Dar todos los competitors
    	GET: http://localhost:8080/competitors/get
    	Retorna en formato JSON todos los competitors
    - Agregar un competitor
    	POST: http://localhost:8080/competitors/add
    	Hace un post de un competitor dar el siguiente formato JSON
    	{
		    "address": "laura.gomez@gmail.com",
		    "name": "Laura",
		    "id": 2,
		    "country": "Colombia",
		    "password": "laurita",
		    "surname": "Gomez",
		    "age": 20,
		    "telephone": "7659675",
		    "cellphone": "3002345436",
		    "city": "Bogota",
		    "winner": false,
		}

	- Hacer login
		POST: http://localhost:8080/competitors/login
		Hace un post de un correo y una contrasena de un competitor para autorizar o no el ingreso
		{
		    "password":"laurita",
		    "address":"laura.gomez@gmail.com"
		}
		En este caso la solcitud respondera con un mensaje en "raw" que dira "haciendo login"
		Sy el passwrod y address no pertenecen a ningun competitor retornara una exception tipo Unauthorized - 401
