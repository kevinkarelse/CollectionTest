package za.ac.cput.collectiontest;

import java.util.Objects;

public class Vehicles {
    private int id;
    private String brand;

    public Vehicles(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    public Vehicles(int id) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicles vehicles = (Vehicles) o;
        return id == vehicles.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
