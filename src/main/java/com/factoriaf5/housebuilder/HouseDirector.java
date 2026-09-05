package com.factoriaf5.housebuilder;

/**
 * Director class for the Builder pattern.
 * Knows how to construct specific, predefined House configurations
 * using a HouseBuilder, without exposing construction details to the client.
 */
public class HouseDirector {

    private final HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public House buildHouseWithGarage() {
        return builder.setGarage(true)
                .setGarden(false)
                .setSwimmingPool(false)
                .setFancyStatues(false)
                .build();
    }

    public House buildHouseWithGarden() {
        return builder.setGarage(false)
                .setGarden(true)
                .setSwimmingPool(false)
                .setFancyStatues(false)
                .build();
    }

    public House buildHouseWithSwimmingPool() {
        return builder.setGarage(false)
                .setGarden(false)
                .setSwimmingPool(true)
                .setFancyStatues(false)
                .build();
    }

    public House buildHouseWithFancyStatues() {
        return builder.setGarage(false)
                .setGarden(false)
                .setSwimmingPool(false)
                .setFancyStatues(true)
                .build();
    }

    public House buildFullyLoadedHouse() {
        return builder.setGarage(true)
                .setGarden(true)
                .setSwimmingPool(true)
                .setFancyStatues(true)
                .build();
    }
}