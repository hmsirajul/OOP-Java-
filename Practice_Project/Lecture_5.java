package com.mycompany.lecture_5;

public class Lecture_5 {

//    private int aNumber = 12;
//    private int anotherNumber;
//    static private CarClass ourCar = new CarClass();
//    static private CarClass ourAnotherCar;
//
//    public static void main(String[] args) {
////       ourAnotherCar = new CarClass("TOYOTA", "Allion","qwerty", 1500,30);
////       // access directly useing Atributes/constructer name;
////       System.out.println("Manufacturar : "+ourAnotherCar.manufacturerName);
////        // access directly useing methode name ,... becuase Atribute is private;
////       System.out.println("Model Name :  "+ourAnotherCar.getmodelName());
////       System.out.println("Password Match : "+ourAnotherCar.matchPassword("hello"));
////       System.out.println("1st car CC " +ourCar.engineCC);
//
//        CarClass thirdCar = new CarClass("MAZDA", "Axela", "asdf", 1500, 20);
//        SuperCarClass ourSubCar = new SuperCarClass("BMW", "7 Series", "zzxcz", 3000, 25, 10, "grey");
//
//        ourAnotherCar = new CarClass("TOYOTA", "Allion", "qwerty", 10000, 30);
//
//        //first car
//        ourAnotherCar.printAllInfo();
//
//        //2nd car
//        thirdCar.printAllInfo();
//        //subcar
//        ourSubCar.printAllInfo();
////		ourSubCar.
private int aNumber = 12;
    private int anotherNumber;
    static private CarClass ourCar = new CarClass();
    static private CarClass ourAnotherCar;

    public static void main(String[] args) {
        CarClass thirdCar = new CarClass("MAZDA", "Axela", "asdf", 1500, 20);
        SuperCarClass ourSubCar = new SuperCarClass("BMW", "7 Series", "zzxcz", 3000, 25, 10, "grey");

        ourAnotherCar = new CarClass("TOYOTA", "Allion", "qwerty", 10000, 30);

        // First Car
        ourAnotherCar.printAllInfo();

        // Second Car
        thirdCar.printAllInfo();

        // Super Car
        ourSubCar.printAllInfo();
    }
    }

