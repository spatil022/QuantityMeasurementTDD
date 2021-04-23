package com.Bridgelabz.QuantityMeasurement;

public class AllUnitsToUse {
    public enum UnitConverter {
        FEET {
            public double convertToInches(double length) {
                return length * 12;
            }
        },
        INCHES;
    }
}
