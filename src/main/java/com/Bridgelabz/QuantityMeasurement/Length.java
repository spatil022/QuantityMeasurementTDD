package com.Bridgelabz.QuantityMeasurement;

public class Length {
    private final double valueOfFeet;
    private final AllUnitsToUse.UnitConverter unit;
    

    public Length(AllUnitsToUse.UnitConverter unit, double valueOfFeet) {
        this.valueOfFeet = valueOfFeet;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.valueOfFeet, valueOfFeet) == 0;
    }
}