package com.factoriaf5.housebuilder;

/**
 * Represents a House with configurable optional features.
 * This is the "Product" in the Builder design pattern.
 */
public class House {

    private final boolean garage;
    private final boolean garden;
    private final boolean swimmingPool;
    private final boolean fancyStatues;

    public House(boolean garage, boolean garden, boolean swimmingPool, boolean fancyStatues) {
        this.garage = garage;
        this.garden = garden;
        this.swimmingPool = swimmingPool;
        this.fancyStatues = fancyStatues;
    }

    public boolean hasGarage() {
        return garage;
    }

    public boolean hasGarden() {
        return garden;
    }

    public boolean hasSwimmingPool() {
        return swimmingPool;
    }

    public boolean hasFancyStatues() {
        return fancyStatues;
    }

    @Override
    public String toString() {
        return "House{" +
                "garage=" + garage +
                ", garden=" + garden +
                ", swimmingPool=" + swimmingPool +
                ", fancyStatues=" + fancyStatues +
                '}';
    }
}