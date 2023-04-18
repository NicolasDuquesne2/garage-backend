package com.data.garage.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    public enum Color {
        RED,
        GREEN,
        YELLOW,
        BLUE,
        BLACK,
        BROWN,
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String model;

    private String brand;

    @Column(name = "release_date")
    private int date;
    private String color;

    public Car() {}
    public Car(Long id, String model, String brand, int date) {
        super();
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.date = date;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
