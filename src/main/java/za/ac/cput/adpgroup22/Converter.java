/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpgroup22;

/**
 *
 * @author Jody Kearns - 209023651 
 * This is a simple measurement converter that converts Centimeters to Inches and Inches to Centimeters.
 */
public class Converter {

    private double measurement;
    private String unitOfMeasurement;

    public Converter(double measurement, String unitOfMeasurement) {
        this.measurement = measurement;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public String measurementConverter() {

        switch (unitOfMeasurement.toUpperCase()) {
            case "CM":
                return "The measurement in Inches is: " + (measurement / 2.54);
            case "F":
                return "The measurement in Centimeters is: " + (measurement * 2.54);
            default:
                return "Invalid unit of measurement";
        }

    }

    public double getMeasurement() {
        return measurement;
    }

    public void setMeasurement(double measurement) {
        this.measurement = measurement;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    @Override
    public String toString() {
        return "Measurement = " + measurement + ", Unit of measurement = " + unitOfMeasurement;
    }

    public static void main(String[] args) {
        Converter meassure1 = new Converter(10, "CM");

        System.out.println(meassure1);

        System.out.println(meassure1.measurementConverter());

    }

}
