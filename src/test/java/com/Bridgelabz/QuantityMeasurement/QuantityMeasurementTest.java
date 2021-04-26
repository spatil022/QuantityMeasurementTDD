package com.Bridgelabz.QuantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_whenCompare_shouldReturnEqual() {
        QuantityMeasurement lengthValue1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET, 0.0);
        QuantityMeasurement lengthValue2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET, 0.0);
        Assert.assertEquals(lengthValue1, lengthValue2);
    }

    @Test
    public void givenValueZeroAndOneFeet_shouldReturnFalse() {
        QuantityMeasurement lengthValue1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET, 0.0);
        QuantityMeasurement lengthValue2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET, 1.0);
        Assert.assertNotEquals(lengthValue1, lengthValue2);
    }

    @Test
    public void givenNullAndOneValueInFeet_shouldReturnFalse() {
        QuantityMeasurement lengthValue1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET, 0.0);
        lengthValue1.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given0InchesAnd0Inches_shouldReturnTrue(){
        QuantityMeasurement valueInInches1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0.0);
        QuantityMeasurement valueInInches2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0.0);
        Assert.assertEquals(valueInInches1,valueInInches2);
    }

    @Test
    public void given0InchAnd1Inch_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInInches1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0.0);
        QuantityMeasurement valueInInches2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,1.0);
        Assert.assertNotEquals(valueInInches1,valueInInches2);
    }

    @Test
    public void givenNullAndOneValueInInch_shouldReturnFalse(){
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0.0);
        valueInInches.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given0FeetAnd0Inches_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,0.0);
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0.0);
        boolean check = valueInFeet.checkCompare(valueInInches);
        Assert.assertTrue(check);
    }

    @Test
    public void given0InchesAnd0Feet_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0.0);
        QuantityMeasurement valueInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,0.0);
        boolean check = valueInInches.checkCompare(valueInFeet);
        Assert.assertTrue(check);
    }

    @Test
    public void given1InchAnd1Feet_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.0);
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,1.0);
        Assert.assertNotEquals(valueInInches,valueInFeet);
    }

    @Test
    public void given1FeetAnd1Inch_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,1.0);
        QuantityMeasurement valueInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.0);
        Assert.assertNotEquals(valueInFeet,valueInInches);
    }

    @Test
    public void given1FeetAnd12Inches_whenCompare_shouldEqualsTrue(){
        QuantityMeasurement valueInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.0);
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,12.0);
        boolean check = valueInFeet.checkCompare(valueInInches);
        Assert.assertTrue(check);
    }

    @Test
    public void given12InchesAnd1Feet_whenCompare_shouldEqualsTrue(){
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,12.0);
        QuantityMeasurement valueInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.0);
        boolean check = valueInInches.checkCompare(valueInFeet);
        Assert.assertTrue(check);
    }

    @Test
    public void given0YardsAnd0Yards_whenCompare_shouldReturnTrue(){
        QuantityMeasurement value1InYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,0.0);
        QuantityMeasurement value2InYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,0.0);
        Assert.assertEquals(value1InYards,value2InYards);
    }

    @Test
    public void givenValuesIn0yardAnd1yardValues_ShouldReturnFalse() {
        QuantityMeasurement value1InYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,0.0);
        QuantityMeasurement value2InYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,1.0);
        Assert.assertNotEquals(value1InYards, value2InYards);
    }

    @Test
    public void givenOneNUllValueYardUnit_IfNull_ShouldReturnFalse() {
        QuantityMeasurement value1InYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,10.0);
        value1InYards.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void givenValuesAsThreeFeetAndOneYard_whenCompare_ShouldReturnTrue() {
        QuantityMeasurement valuesInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,3.0);
        QuantityMeasurement valueInYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,1.0);
        boolean compareCheck = valuesInFeet.checkCompare(valueInYards);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenValuesAsOneFeetAndOneYard_whenCompare_ShouldReturnFalse() {
        QuantityMeasurement valuesInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.0);
        QuantityMeasurement valueInYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,1.0);
        boolean compareCheck = valuesInFeet.checkCompare(valueInYards);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenValuesAsOneInchAndOneYard_whenCompare_ShouldReturnFalse() {
        QuantityMeasurement valuesInInch = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,1.0);
        QuantityMeasurement valueInYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,1.0);
        boolean compareCheck = valuesInInch.checkCompare(valueInYards);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1Yard36Inches_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,1.0);
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,36.00);
        boolean check = valueInYards.checkCompare(valueInInches);
        Assert.assertTrue(check);
    }

    @Test
    public void given36Inches1Yards_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,36.00);
        QuantityMeasurement valueInYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,1.0);
        boolean check = valueInInches.checkCompare(valueInYards);
        Assert.assertTrue(check);
    }

    @Test
    public void givenValuesAsOneYardAnd3Feet_whenCompare_ShouldReturnTrue() {
        QuantityMeasurement valueInYards = new QuantityMeasurement(AllUnitsToUse.UnitConverter.YARDS,1.0);
        QuantityMeasurement valuesInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,3.0);
        boolean compareCheck = valueInYards.checkCompare(valuesInFeet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenValuesAsZeroCmAndZeroCm_shouldReturnTrue(){
        QuantityMeasurement valueInCm1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,0);
        QuantityMeasurement valueInCm2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,0);
        Assert.assertEquals(valueInCm1,valueInCm2);
    }

    @Test
    public void givenValuesAsZeroAndOneCm_whenCompare_shouldReturnFalse()
    {
        QuantityMeasurement cmValue1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,0.0);
        QuantityMeasurement cmValue2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,1.0);
        Assert.assertNotEquals(cmValue1, cmValue2);
    }

    @Test
    public void givenNullAndOneValueInCm_shouldReturnFalse(){
        QuantityMeasurement valueInCm = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,0.0);
        valueInCm.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given0InchesAnd0Cm_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0.0);
        QuantityMeasurement valueInCm = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,0.0);
        boolean check = valueInInches.checkCompare(valueInCm);
        Assert.assertTrue(check);
    }

    @Test
    public void given1CmAnd1Inches_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,1.0);
        QuantityMeasurement valueInCm = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,1.0);
        Assert.assertNotEquals(valueInCm,valueInInches);
    }

    @Test
    public void given2InchesAnd5Cm_whenCompare_shouldEqualsTrue(){
        QuantityMeasurement valueInFInches = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,5.0);
        QuantityMeasurement valueInCm = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,2.0);
        boolean check = valueInFInches.checkCompare(valueInCm);
        Assert.assertTrue(check);
    }

    @Test
    public void given0InchesAnd0Inches_whenAdded_shouldReturnTrue(){
        QuantityMeasurement valueInFInch1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0);
        QuantityMeasurement valueInInch2= new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,0);
        double check = valueInFInch1.addition(valueInInch2);
        Assert.assertEquals(0,check,0);
    }

    @Test
    public void given2InchesAnd2Inches_whenAdded_shouldReturn4(){
        QuantityMeasurement valueInInch1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,2.0);
        QuantityMeasurement valueInInch2= new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,2.0);
        double check = valueInInch1.addition(valueInInch2);
        Assert.assertEquals(4,check,0);
    }

    @Test
    public void givenOneFeetAndTwoInch_whenAdded_shouldReturn14Inches(){
        QuantityMeasurement valueInFeet = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.00);
        QuantityMeasurement valueInInch = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,2.00);
        double check = valueInFeet.addition(valueInInch);
        Assert.assertEquals(14,check,0);
    }

    @Test
    public void givenOneFeetAndOneFeet_whenAdded_shouldReturn24Inches(){
        QuantityMeasurement valueInFeet1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.00);
        QuantityMeasurement valueInFeet2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.FEET,1.00);
        double check = valueInFeet1.addition(valueInFeet2);
        Assert.assertEquals(24,check,0);
    }

    @Test
    public void givenTwoInchesAndTwoAndHalfCmt_whenAdded_shouldReturn3Inches(){
        QuantityMeasurement valueInCm = new QuantityMeasurement(AllUnitsToUse.UnitConverter.CENTIMETER,2.5);
        QuantityMeasurement valueInInch = new QuantityMeasurement(AllUnitsToUse.UnitConverter.INCHES,2.00);
        double check = valueInCm.addition(valueInInch);
        Assert.assertEquals(3,check,0);
    }

    @Test
    public void given0GallonAnd0Gallon_whenCompare_shouldReturnEqual(){
        QuantityMeasurement valueInGallon1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,0.0);
        QuantityMeasurement valueInGallon2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,0.0);
        Assert.assertEquals(valueInGallon1, valueInGallon2);
    }

    @Test
    public void given0GallonAnd1Gallon_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInGallon1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,0.0);
        QuantityMeasurement valueInGallon2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,1.0);
        Assert.assertNotEquals(valueInGallon1, valueInGallon2);
    }

    @Test
    public void givenNullAndOneValueInGallon_shouldReturnFalse(){
        QuantityMeasurement valueInGallon = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,0.0);
        valueInGallon.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given0LiterAnd0Liter_whenCompare_shouldReturnEqual(){
        QuantityMeasurement valueInLiter1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,0.0);
        QuantityMeasurement valueInLiter2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,0.0);
        Assert.assertEquals(valueInLiter1, valueInLiter2);
    }

    @Test
    public void given0LiterAnd1Liter_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInLiter1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,0.0);
        QuantityMeasurement valueInLiter2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,1.0);
        Assert.assertNotEquals(valueInLiter1, valueInLiter2);
    }

    @Test
    public void givenNullAndOneValueInLiter_shouldReturnFalse(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,0.0);
        valueInLiter.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given0GallonAnd0Liter_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,0.0);
        QuantityMeasurement valueInGallon = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,0.0);
        boolean check = valueInLiter.checkCompare(valueInGallon);
        Assert.assertTrue(check);
    }

    @Test
    public void given1GallonAnd1Liter_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,1.0);
        QuantityMeasurement valueInGallon = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,1.0);
        boolean check = valueInLiter.checkCompare(valueInGallon);
        Assert.assertFalse(check);
    }

    @Test
    public void given1GallonAnd3point78Liter_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,3.785);
        QuantityMeasurement valueInGallon = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,1.0);
        boolean check = valueInLiter.checkCompare(valueInGallon);
        Assert.assertTrue(check);
    }

    @Test
    public void given0MilliLiterAnd0MilliLiter_whenCompare_shouldReturnTue(){
        QuantityMeasurement valueInMl1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,0.0);
        QuantityMeasurement valueInMl2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,0.0);
        Assert.assertEquals(valueInMl1, valueInMl2);
    }

    @Test
    public void given0MilliLiterAnd1MilliLiter_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInMl1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,0.0);
        QuantityMeasurement valueInMl2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,1.0);
        Assert.assertNotEquals(valueInMl1, valueInMl2);
    }

    @Test
    public void givenNullAndOneValueInMiliLiter_shouldReturnFalse(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,0.0);
        valueInLiter.equals(null);
        Assert.assertFalse(false);
    }

    @Test
    public void given0MililiterAnd0Liter_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,0.0);
        QuantityMeasurement valueInMl = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,0.0);
        boolean check = valueInLiter.checkCompare(valueInMl);
        Assert.assertTrue(check);
    }

    @Test
    public void given1MililiterAnd1Liter_whenCompare_shouldReturnFalse(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,1.0);
        QuantityMeasurement valueInMl = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,1.0);
        boolean check = valueInLiter.checkCompare(valueInMl);
        Assert.assertFalse(check);
    }

    @Test
    public void given1000MililiterAnd1Liter_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,1.0);
        QuantityMeasurement valueInMl = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,1000.0);
        boolean check = valueInLiter.checkCompare(valueInMl);
        Assert.assertTrue(check);
    }

    @Test
    public void givenZeroGallonAndZeroLiter_whenAdded_shouldRetuenZero(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,0.0);
        QuantityMeasurement valueInGallon = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,0.0);
        double check = valueInGallon.addition(valueInLiter);
        Assert.assertEquals(0,check,0);
    }

    @Test
    public void givenOneGallonAndOneGallon_whenAdded_shouldReturn3point79Liters(){
        QuantityMeasurement valueInGallon1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,1.0);
        QuantityMeasurement valueInGallon2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.GALLON,1.0);
        double check = valueInGallon1.addition(valueInGallon2);
        Assert.assertEquals(7.57,check,0);
    }

    @Test
    public void givenOneLiterAnd1000Ml_whenAdded_shouldReturn2Liters(){
        QuantityMeasurement valueInLiter = new QuantityMeasurement(AllUnitsToUse.UnitConverter.LITER,1.0);
        QuantityMeasurement valueInMl = new QuantityMeasurement(AllUnitsToUse.UnitConverter.MILILITER,1000.0);
        double check = valueInLiter.addition(valueInMl);
        Assert.assertEquals(2,check,0);
    }

    @Test
    public void givenZeroKgAndZeroKg_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInKG1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.KILOGRAM,0);
        QuantityMeasurement valueInKG2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.KILOGRAM,0);
        Assert.assertEquals(valueInKG1,valueInKG2);
    }

    @Test
    public void givenOneKgAndZeroKg_whenCompare_shouldReturnTrue(){
        QuantityMeasurement valueInKG1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.KILOGRAM,1.0);
        QuantityMeasurement valueInKG2 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.KILOGRAM,0.0);
        Assert.assertNotEquals(valueInKG1,valueInKG2);
    }

    @Test
    public void givenNullAndOneValueInKg_shouldReturnFalse(){
        QuantityMeasurement quantityMeasurementValue1 = new QuantityMeasurement(AllUnitsToUse.UnitConverter.KILOGRAM,0.0);
        quantityMeasurementValue1.equals(null);
        Assert.assertFalse(false);
    }
}
