package com.factoriaf5.housebuilder;

/**
 * Builder interface for constructing a House step by step.
 * Each method returns "this" to allow method chaining (fluent API).
 */
public interface HouseBuilder {

    HouseBuilder setGarage(boolean garage);

    HouseBuilder setGarden(boolean garden);

    HouseBuilder setSwimmingPool(boolean swimmingPool);

    HouseBuilder setFancyStatues(boolean fancyStatues);

    House build();
}