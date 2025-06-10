package com.javarush.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(schema = "movie", name = "rental")
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_id")
    private Short id;

    @Column(name = "rental_date")
    private LocalDateTime rentalDate;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "return_date")
    private LocalDateTime returnDate;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;

    @Column(name = "last_update")
    @UpdateTimestamp
    private LocalDateTime lastUpdate;

    public Short getId() {
        return id;
    }

    public LocalDateTime getRentalDate() {
        return rentalDate;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public Staff getStaff() {
        return staff;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }


    public void setId(Short id) {
        this.id = id;
    }

    public void setRentalDate(LocalDateTime rentalDate) {
        this.rentalDate = rentalDate;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
