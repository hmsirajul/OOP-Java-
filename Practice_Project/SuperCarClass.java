
package com.mycompany.lecture_5;

public class SuperCarClass extends CarClass {
   private float chargeInBattery;
    private String colorString;

    // Default Constructor
    public SuperCarClass() {
        super(); // Call parent constructor
    }

    // Constructor with Parameters
    public SuperCarClass(String manu, String model, String key, int engineCC, float fuel, float charge, String color) {
        super(manu, model, key, engineCC, fuel);
        this.chargeInBattery = charge;
        this.colorString = color;
    }

    // Constructor with Year Parameter
    public SuperCarClass(String manu, String model, String key, int engineCC, float fuel, int year, float charge, String color) {
        super(manu, model, key, engineCC, fuel, year);
        this.chargeInBattery = charge;
        this.colorString = color;
    }

    // Getter and Setter
    public float getChargeInBattery() {
        return chargeInBattery;
    }

    public void setChargeInBattery(float chargeInBattery) {
        this.chargeInBattery = chargeInBattery;
    }

    public String getColorString() {
        return colorString;
    }

    // Overriding printAllInfo()
    @Override
    public void printAllInfo() {
        super.printAllInfo();
        runForSeconds(60);
        System.out.println("Amount of Fuel after driving for 60s: " + presentAmountOfFuel() + "L");
        System.out.println("Charge in Battery: " + getChargeInBattery());
        System.out.println("Color of Car: " + getColorString());
    }
	
    
}
