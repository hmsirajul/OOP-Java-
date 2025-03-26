
package com.mycompany.lecture_5;

public class CarClass {
   public String manufacturerName;

    // Default Variable
    int engineCC;

    // Private Variables
    private String modelName;
    private String carKeyValue;
    private float fuelAmount;
    final private float amountOfFuelConsumedPerSecond = 0.02f;

    // Protected Variable
    protected int manufacturingYear;

    // Default Constructor
    public CarClass() {
        manufacturerName = "";
        modelName = "";
        engineCC = 1000;
        fuelAmount = 0;
        manufacturingYear = 0;
    }

    // Constructor with One Parameter
    public CarClass(String carName) {
        manufacturerName = carName;
        modelName = "";
        engineCC = 0;
        fuelAmount = 0;
        manufacturingYear = 0;
    }

    // Constructor with Multiple Parameters
    public CarClass(String manu, String model, String key, int engineCC, float fuel) {
        manufacturerName = manu;
        modelName = model;
        carKeyValue = key;
        this.engineCC = engineCC;
        fuelAmount = fuel;
        manufacturingYear = 0;
    }

    // Constructor with Year Parameter
    public CarClass(String manu, String model, String key, int engineCC, float fuel, int year) {
        this(manu, model, key, engineCC, fuel);
        manufacturingYear = year;
    }

    // Getter and Utility Methods
    public float presentAmountOfFuel() {
        return fuelAmount;
    }

    public String getmanufacturerName() {
        return manufacturerName;
    }

    public String getmodelName() {
        return modelName;
    }

    public boolean matchPassword(String userInput) {
        return userInput.equals(carKeyValue);
    }

    public void addFuel(float fuelAmount) {
        this.fuelAmount += fuelAmount;
    }

    public void runForSeconds(int timeInSecond) {
        float usedFuel = timeInSecond * amountOfFuelConsumedPerSecond;
        fuelAmount -= usedFuel;
    }

    public void printAllInfo() {
        System.out.println("\n\nManufacturer: " + manufacturerName);
        System.out.println("Model Name: " + getmodelName());
        System.out.println("Password Match: " + matchPassword("ahbvjahsb"));
        System.out.println("Engine CC: " + engineCC);
        System.out.println("Amount of Fuel: " + presentAmountOfFuel() + "L");
        addFuel(2);
        System.out.println("Amount of Fuel after adding 2L: " + presentAmountOfFuel() + "L");
    }

  
}
