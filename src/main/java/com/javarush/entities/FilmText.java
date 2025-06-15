package com.javarush.entities;


import jakarta.persistence.*;
import org.hibernate.annotations.Type;

@Entity
@Table(schema = "movie", name = "film_text")
public class FilmText {
    @Id
    @Column(name = "film_id")
    private Short id;


    @OneToOne
    @JoinColumn(name = "film_id")
    private Film film;

    @Column(name = "title")
    private String title;

    @Column(name = "description",columnDefinition = "text")
    @Type(type = "text")
    private String description;

    public Short getId() {
        return id;
    }

    public Film getFilm() {
        return film;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
