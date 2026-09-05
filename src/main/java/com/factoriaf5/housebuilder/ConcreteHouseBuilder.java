package com.factoriaf5.housebuilder;

/**
 * Concrete implementation of HouseBuilder.
 * Accumulates configuration and produces a House instance via build().
 */
public class ConcreteHouseBuilder implements HouseBuilder {

    private boolean garage = false;
    private boolean garden = false;
    private boolean swimmingPool = false;
    private boolean fancyStatues = false;

    @Override
    public HouseBuilder setGarage(boolean garage) {
        this.garage = garage;
        return this;
    }

    @Override
    public HouseBuilder setGarden(boolean garden) {
        this.garden = garden;
        return this;
    }

    @Override
    public HouseBuilder setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
        return this;
    }

    @Override
    public HouseBuilder setFancyStatues(boolean fancyStatues) {
        this.fancyStatues = fancyStatues;
        return this;
    }

    @Override
    public House build() {
        return new House(garage, garden, swimmingPool, fancyStatues);
    }
}
