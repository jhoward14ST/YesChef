package com.jhoward14ST.model;

/**
 * Enumeration of imperial units with conversion factors relative to a teaspoon.
 */
public enum ImperialUnit {
    TEASPOON(1.0), // base unit
    TABLESPOON(3.0), // 3 teaspoons in a tablespoon
    CUP(48.0), // 48 teaspoons in a cup
    PINT(96.0), // 96 teaspoons in a pint
    QUART(192.0), // 192 teaspoons in a quart
    GALLON(768.0); // 768 teaspoons in a gallon

    private final double conversionFactor;

    ImperialUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }
}
