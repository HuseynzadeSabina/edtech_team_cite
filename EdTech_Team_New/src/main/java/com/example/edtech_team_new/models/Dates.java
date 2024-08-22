package com.example.edtech_team_new.models;

public class Dates {
    private int id;
    private int temprature;
    int humidity;
    int x;
    int y;
    int z;
    int lat;
    int longg;

    public Dates(int temprature, int humidity, int x, int y, int z, int lat, int longg) {
        this.temprature = temprature;
        this.humidity = humidity;
        this.x = x;
        this.y = y;
        this.z = z;
        this.lat = lat;
        this.longg = longg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTemprature() {
        return temprature;
    }

    public void setTemprature(int temprature) {
        this.temprature = temprature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getLongg() {
        return longg;
    }

    public void setLongg(int longg) {
        this.longg = longg;
    }
}
