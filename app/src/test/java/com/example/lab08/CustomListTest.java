package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);

        // This will fail initially because deleteCity() doesn't exist
        list.deleteCity(edmonton);
        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        // Test with empty list
        assertEquals(0, list.countCities());

        // Add cities and test count
        City calgary = new City("Toronto", "ON");
        City edmonton = new City("Edmonton", "AB");
        City vancouver = new City("Calgary", "AB");

        list.addCity(calgary);
        assertEquals(1, list.countCities());

        list.addCity(edmonton);
        assertEquals(2, list.countCities());

        list.addCity(vancouver);
        // This will fail initially because countCities() doesn't exist
        assertEquals(3, list.countCities());
    }
}