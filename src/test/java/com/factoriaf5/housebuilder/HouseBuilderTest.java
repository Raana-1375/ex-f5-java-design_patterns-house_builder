package com.factoriaf5.housebuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseBuilderTest {

    @Test
    void builderCreatesHouseWithGarageOnly() {
        House house = new ConcreteHouseBuilder()
                .setGarage(true)
                .build();

        assertTrue(house.hasGarage());
        assertFalse(house.hasGarden());
        assertFalse(house.hasSwimmingPool());
        assertFalse(house.hasFancyStatues());
    }

    @Test
    void builderCreatesHouseWithAllFeatures() {
        House house = new ConcreteHouseBuilder()
                .setGarage(true)
                .setGarden(true)
                .setSwimmingPool(true)
                .setFancyStatues(true)
                .build();

        assertTrue(house.hasGarage());
        assertTrue(house.hasGarden());
        assertTrue(house.hasSwimmingPool());
        assertTrue(house.hasFancyStatues());
    }

    @Test
    void builderCreatesHouseWithNoFeaturesByDefault() {
        House house = new ConcreteHouseBuilder().build();

        assertFalse(house.hasGarage());
        assertFalse(house.hasGarden());
        assertFalse(house.hasSwimmingPool());
        assertFalse(house.hasFancyStatues());
    }

    @Test
    void builderMethodsReturnSameInstanceForChaining() {
        HouseBuilder builder = new ConcreteHouseBuilder();

        assertSame(builder, builder.setGarage(true));
        assertSame(builder, builder.setGarden(true));
        assertSame(builder, builder.setSwimmingPool(true));
        assertSame(builder, builder.setFancyStatues(true));
    }

    @Test
    void houseToStringContainsAllFieldValues() {
        House house = new ConcreteHouseBuilder()
                .setGarage(true)
                .setGarden(false)
                .setSwimmingPool(true)
                .setFancyStatues(false)
                .build();

        String result = house.toString();

        assertTrue(result.contains("garage=true"));
        assertTrue(result.contains("garden=false"));
        assertTrue(result.contains("swimmingPool=true"));
        assertTrue(result.contains("fancyStatues=false"));
    }

    @Test
    void directorBuildsHouseWithGarage() {
        HouseDirector director = new HouseDirector(new ConcreteHouseBuilder());

        House house = director.buildHouseWithGarage();

        assertTrue(house.hasGarage());
        assertFalse(house.hasGarden());
        assertFalse(house.hasSwimmingPool());
        assertFalse(house.hasFancyStatues());
    }

    @Test
    void directorBuildsHouseWithGarden() {
        HouseDirector director = new HouseDirector(new ConcreteHouseBuilder());

        House house = director.buildHouseWithGarden();

        assertFalse(house.hasGarage());
        assertTrue(house.hasGarden());
        assertFalse(house.hasSwimmingPool());
        assertFalse(house.hasFancyStatues());
    }

    @Test
    void directorBuildsHouseWithSwimmingPool() {
        HouseDirector director = new HouseDirector(new ConcreteHouseBuilder());

        House house = director.buildHouseWithSwimmingPool();

        assertFalse(house.hasGarage());
        assertFalse(house.hasGarden());
        assertTrue(house.hasSwimmingPool());
        assertFalse(house.hasFancyStatues());
    }

    @Test
    void directorBuildsHouseWithFancyStatues() {
        HouseDirector director = new HouseDirector(new ConcreteHouseBuilder());

        House house = director.buildHouseWithFancyStatues();

        assertFalse(house.hasGarage());
        assertFalse(house.hasGarden());
        assertFalse(house.hasSwimmingPool());
        assertTrue(house.hasFancyStatues());
    }

    @Test
    void directorBuildsFullyLoadedHouse() {
        HouseDirector director = new HouseDirector(new ConcreteHouseBuilder());

        House house = director.buildFullyLoadedHouse();

        assertTrue(house.hasGarage());
        assertTrue(house.hasGarden());
        assertTrue(house.hasSwimmingPool());
        assertTrue(house.hasFancyStatues());
    }
}