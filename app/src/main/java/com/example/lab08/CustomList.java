package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;
    //Small change-add comment
    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public void deleteCity(City city) {
        cities.remove(city);
    }
    public int countCities() {
        return cities.size();
    }

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
}
