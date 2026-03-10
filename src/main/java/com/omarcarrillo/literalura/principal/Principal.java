package com.tuusuario.literalura.principal;

import com.tuusuario.literalura.model.*;
import com.tuusuario.literalura.repository.*;
import com.tuusuario.literalura.service.*;
import java.util.*;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private final String URL_BASE = "https://gutendex.com/books/?search=";
    private LibroRepository libroRepo;
    private AutorRepository autorRepo;

    public Principal(LibroRepository lRepo, AutorRepository aRepo) {
        this.libroRepo = lRepo;
        this.autorRepo = aRepo;
    }

    public void muestraElMenu() {
        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    1 - Buscar libro por título
                    2 - Listar libros registrados
                    3 - Listar autores registrados
                    4 - Listar autores vivos en un determinado año
                    5 - Listar libros por idioma (es, en)
                    0 - Salir
                    """;
            System.out.println(menu);
            try {
                opcion = Integer.parseInt(teclado.nextLine());
                switch (opcion) {
                    case 1 -> buscarLibroWeb();
                    case 2 -> listarLibros();
                    case 3 -> listarAutores();
                    case 4 -> listarAutoresVivos();
                    case 5 -> listarPorIdioma();
                    case 0 -> System.out.println("Cerrando...");
                }
            } catch (Exception e) {
                System.out.println("Opción inválida.");
            }
        }
    }

    private void buscarLibroWeb() {
        System.out.println("Ingrese el nombre del libro:");
        var nombreLibro = teclado.nextLine();
        var json = consumoApi.obtenerDatos(URL_BASE + nombreLibro.replace(" ", "+"));
        var datos = conversor.obtenerDatos(json, DatosRespuesta.class); // Necesitas un Record wrapper para el "results" de Gutendex

        if (datos.resultados().isPresent()) {
            DatosLibro dLibro = datos.resultados().get();
            // Lógica para guardar libro y autor (verificando duplicados en la DB)
            System.out.println("Libro encontrado: " + dLibro.titulo());
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}