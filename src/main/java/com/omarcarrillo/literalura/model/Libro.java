package com.omarcarrillo.literalura.model;

import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    private String idioma;
    private Double numeroDescargas;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Autor autor;

    public Libro() {}

    public Libro(DatosLibro datos, Autor autor) {
        this.titulo = datos.titulo();
        this.idioma = datos.idiomas().get(0);
        this.numeroDescargas = datos.numeroDescargas();
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "----- LIBRO -----\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + (autor != null ? autor.getNombre() : "N/A") + "\n" +
                "Idioma: " + idioma + "\n" +
                "Descargas: " + numeroDescargas + "\n" +
                "-----------------";
    }
}