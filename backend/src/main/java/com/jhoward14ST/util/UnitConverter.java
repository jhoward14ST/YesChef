package main.java.com.jhoward14ST.util;

import main.java.com.jhoward14ST.model.ImperialUnit;

/**
 * Utility class for converting between different imperial units.
 */
public class UnitConverter {

    /**
     * Converts a quantity from one imperial unit to another.
     *
     * @param quantity   the quantity to convert
     * @param fromUnit   the unit of the quantity to convert from
     * @param toUnit     the unit of the quantity to convert to
     * @return the converted quantity as a String
     */
    public static String convert(double quantity, ImperialUnit fromUnit, ImperialUnit toUnit) {
        double baseQuantity = quantity * fromUnit.getConversionFactor();
        double convertedQuantity = baseQuantity / toUnit.getConversionFactor();
        return formatQuantity(convertedQuantity);
    }

    /**
     * Formats the converted quantity into a human-readable string, potentially using fractions.
     *
     * @param quantity the quantity to format
     * @return a formatted string representing the quantity
     */
    private static String formatQuantity(double quantity) {
        // Might implement a more sophisticated formatting, potentially using fractions.
        // Currently rounding to two decimal places.
        return String.format("%.2f", quantity);
    }
}
