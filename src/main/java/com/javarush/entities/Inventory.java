package com.javarush.entities;


import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(schema = "movie", name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @Column(name = "last_update")
    @UpdateTimestamp
    private LocalDateTime lastUpdate;

    public Integer getId() {
        return id;
    }

    public Film getFilm() {
        return film;
    }

    public Store getStore() {
        return store;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
