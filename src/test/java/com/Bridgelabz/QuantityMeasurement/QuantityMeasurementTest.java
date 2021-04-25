package com.Bridgelabz.QuantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_whenCompare_shouldReturnEqual() {
        Length lengthValue1 = new Length(AllUnitsToUse.UnitConverter.FEET, 0.0);
        Length lengthValue2 = new Length(AllUnitsToUse.UnitConverter.FEET, 0.0);
        Assert.assertEquals(lengthValue1, lengthValue2);
    }

    @Test
    public void givenValueZeroAndOneFeet_shouldReturnFalse() {
        Length lengthValue1 = new Length(AllUnitsToUse.UnitConverter.FEET, 0.0);
        Length lengthValue2 = new Length(AllUnitsToUse.UnitConverter.FEET, 1.0);
        Assert.assertNotEquals(lengthValue1, lengthValue2);
    }

    @Test
    public void givenNullAndOneValueInFeet_shouldReturnFalse() {
        Length lengthValue1 = new Length(AllUnitsToUse.UnitConverter.FEET, 0.0);
        lengthValue1.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given0InchesAnd0Inches_shouldReturnTrue(){
        Length valueInInches1 = new Length(AllUnitsToUse.UnitConverter.INCHES,0.0);
        Length valueInInches2 = new Length(AllUnitsToUse.UnitConverter.INCHES,0.0);
        Assert.assertEquals(valueInInches1,valueInInches2);
    }

    @Test
    public void given0InchAnd1Inch_whenCompare_shouldReturnFalse(){
        Length valueInInches1 = new Length(AllUnitsToUse.UnitConverter.INCHES,0.0);
        Length valueInInches2 = new Length(AllUnitsToUse.UnitConverter.INCHES,1.0);
        Assert.assertNotEquals(valueInInches1,valueInInches2);
    }

    @Test
    public void givenNullAndOneValueInInch_shouldReturnFalse(){
        Length valueInInches = new Length(AllUnitsToUse.UnitConverter.INCHES,0.0);
        valueInInches.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given0FeetAnd0Inches_whenCompare_shouldReturnTrue(){
        Length valueInFeet = new Length(AllUnitsToUse.UnitConverter.FEET,0.0);
        Length valueInInches = new Length(AllUnitsToUse.UnitConverter.INCHES,0.0);
        boolean check = valueInFeet.checkCompare(valueInInches);
        Assert.assertTrue(check);
    }

    @Test
    public void given0InchesAnd0Feet_whenCompare_shouldReturnTrue(){
        Length valueInInches = new Length(AllUnitsToUse.UnitConverter.INCHES,0.0);
        Length valueInFeet = new Length(AllUnitsToUse.UnitConverter.FEET,0.0);
        boolean check = valueInInches.checkCompare(valueInFeet);
        Assert.assertTrue(check);
    }

    @Test
    public void given1InchAnd1Feet_whenCompare_shouldReturnFalse(){
        Length valueInFeet = new Length(AllUnitsToUse.UnitConverter.FEET,1.0);
        Length valueInInches = new Length(AllUnitsToUse.UnitConverter.INCHES,1.0);
        Assert.assertNotEquals(valueInInches,valueInFeet);
    }

    @Test
    public void given1FeetAnd1Inch_whenCompare_shouldReturnFalse(){
        Length valueInInches = new Length(AllUnitsToUse.UnitConverter.INCHES,1.0);
        Length valueInFeet = new Length(AllUnitsToUse.UnitConverter.FEET,1.0);
        Assert.assertNotEquals(valueInFeet,valueInInches);
    }

    @Test
    public void given1FeetAnd12Inches_whenCompare_shouldEqualsTrue(){
        Length valueInFeet = new Length(AllUnitsToUse.UnitConverter.FEET,1.0);
        Length valueInInches = new Length(AllUnitsToUse.UnitConverter.INCHES,12.0);
        boolean check = valueInFeet.checkCompare(valueInInches);
        Assert.assertTrue(check);
    }

    @Test
    public void given12InchesAnd1Feet_whenCompare_shouldEqualsTrue(){
        Length valueInInches = new Length(AllUnitsToUse.UnitConverter.INCHES,12.0);
        Length valueInFeet = new Length(AllUnitsToUse.UnitConverter.FEET,1.0);
        boolean check = valueInInches.checkCompare(valueInFeet);
        Assert.assertTrue(check);
    }
}