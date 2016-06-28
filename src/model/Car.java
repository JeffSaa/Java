package model;

public class Car {
    
    String owner, id;
    int year;
    float km;

    public Car(String owner, String id, int year, float km) {
        this.owner = owner;
        this.id = id;
        this.year = year;
        this.km = km;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }
    
    
    
}