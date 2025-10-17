package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<Object> {
    private String city;
    private String province;

    /**
     * This creates a new city object
     * @param city
     * The city string
     * @param province
     * The province string
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This obtains the city
     * @return
     * Returns the city name string itself
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This obtains the city
     * @return
     * Returns the province name string itself
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This makes this object comparable to other objects
     * @param o
     * The object to be compared to
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * This makes this object comparable to other objects
     * @param o
     * The object to be compared to
     * @return
     * Returns whether it is equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return this.city.equals(city1.city) && this.province.equals(city1.province);
    }

    /**
     * This makes Cities of the same name and province strings possess the same hash code,
     * rendering them comparable.
     * @return
     * Hashcode, the unique identifier of this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}