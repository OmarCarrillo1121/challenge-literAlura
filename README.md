# Catálogo de Libros - Literalura

¡Hola! Mi nombre es **Omar Carrillo**, soy estudiante de programación en Java dentro del programa **Oracle Next Education**. Este ejercicio es parte de los retos o desafíos propuestos dentro del curso de manejo de Java y SpringBoot, llamado **Literalura**. La aplicación consiste en la consulta datos reales de la API de **Gutendex** (librería de Project Gutenberg) y los almacena en una base de datos propia para su posterior consulta.

## Funciones principales de Literalura

El programa funciona a través de la consola y permite gestionar una biblioteca personal. El programa cuenta con un menú con las siguientes opciones:

* **Buscar libros por título:** El sistema busca en la web de Gutendex, trae la información y la guarda en la base de datos.
* **Listar libros registrados:** Muestra un historial de todos los libros buscados y guardados.
* **Listar autores:** Presenta una lista de escritores guardados, su año de nacimiento y fallecimiento.
* **Filtro de autores vivos:** Permite ingresar un año específico para saber qué autores estaban vivos en ese tiempo.
* **Estadísticas por idioma:** Se puede consultar cuántos libros han sido registrados en español (es) o en inglés (en).

## Tecnologías utilizadas

Para este proyecto dimos un salto tecnológico importante, utilizando herramientas de nivel profesional:

* **Java 25:** Como base del proyecto.
* **Spring Boot:** Framework usado para el desarrollo de la aplicación.
* **Spring Data JPA:** Para manejar la persistencia de datos y comunicación con la base de datos.
* **PostgreSQL 17:** Base de datos relacional donde guardamos libros y autores.
* **Jackson:** Librería para mapear los datos JSON de la API a objetos Java.
* **HttpClient:** Para realizar las peticiones a la API de Gutendex.

## Descargar y ejecutar

Para probar este catálogo en tu computadora, sigue estos pasos:

1.  **Clonar el código** 
2.  **Configura tu Base de Datos:** Recomendable usar PostgreSQL 17. Crea una base de datos llamada `literalura`.
3.  **Ajusta las credenciales:** Entra al archivo `src/main/resources/application.properties` y coloca tus credenciales de Postgres en tu_usuario_aqui y tu_contraseña_aquí respectivamente.
4.  **Ejecuta el proyecto:** Ejecuta la clase `LiteraluraApplication.java` en tu IDE.
5.  **Explora:** Usa el menú en consola para empezar a buscar tus libros favoritos.

## Lo que aprendí

En este reto aprendí a trabajar con **bases de datos relacionales**, a entender cómo funcionan las relaciones entre tablas (como un autor que tiene muchos libros) y a utilizar **Spring Boot** para organizar el código. 

El principal desafio fue el maneja de la base de datos, manejo de duplicados y la comunicación entre la API y JPA, que al final se solventaron de manera correcta.

----------------
Si tienes algún consejo para que pueda seguir mejorando como programador, será muy bien recibido. ¡Gracias por visitar mi proyecto! 
