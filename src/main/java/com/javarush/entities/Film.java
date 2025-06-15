package com.javarush.entities;


import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;


@Entity
@Table(schema = "movie", name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Short id;

    @Column(name = "title")
    private String title;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "release_year",columnDefinition = "year")
    @Convert(converter=YearAttributeConverter.class)
    private Year year;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

    @ManyToOne
    @JoinColumn(name = "original_language_id")
    private Language originalLanguage;

    @Column(name = "rental_duration")
    private Byte rentalDuration;

    @Column(name = "rental_rate")
    private BigDecimal rentalRate;

    @Column(name = "length")
    private Short length;

    @Column(name = "replacement_cost")
    private BigDecimal replacementCost;

    @Column(name = "rating",columnDefinition = "enum('G', 'PG', 'PG-13', 'R', 'NC-17')")
    @Convert(converter = RatingConverter.class)
    private Rating rating;

    @Column(name = "special_features",columnDefinition = "set('Trailers', 'Commentaries', 'Deleted Scenes', 'Behind the Scenes')")
    private String specialFeatures;

    @Column(name = "last_update")
    @UpdateTimestamp
    private LocalDateTime lastUpdate;

    @ManyToMany
    @JoinTable(name = "film_actor",
            joinColumns = @JoinColumn(name = "film_id",referencedColumnName = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id",referencedColumnName = "actor_id"))
    private Set<Actor> actors;

    @ManyToMany
    @JoinTable(name = "film_category",
            joinColumns = @JoinColumn(name = "film_id",referencedColumnName = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id",referencedColumnName = "category_id"))
    private Set<Category> categories;


    public Short getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Year getYear() {
        return year;
    }

    public Language getLanguage() {
        return language;
    }

    public Language getOriginalLanguage() {
        return originalLanguage;
    }

    public Byte getRentalDuration() {
        return rentalDuration;
    }

    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public Short getLength() {
        return length;
    }

    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public Rating getRating() {
        return rating;
    }

    public Set<Feature> getSpecialFeatures() {
        if(isNull(specialFeatures) || specialFeatures.isEmpty()) {
            return null;
        }
        Set<Feature> result = new HashSet<>();
        String[] features = specialFeatures.split(",");
        for (String feature : features) {
            result.add(Feature.getFeatureByValue(feature));

        }
        result.remove("null");
        return result;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setOriginalLanguage(Language originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public void setRentalDuration(Byte rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public void setSpecialFeatures(Set<Feature> features) {

      if(isNull(features)){
          specialFeatures=null;
      }
      else{
            specialFeatures= features.stream().map(Feature::getValue).collect(Collectors.joining(","));
      }
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
