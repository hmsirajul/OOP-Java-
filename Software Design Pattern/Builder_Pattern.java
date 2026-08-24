// Product class
// This is the final object that we want to create.
class Computer {

    // Properties of Computer
    private String cpu;
    private int ram;
    private String storage;
    private String graphicsCard;
    private String operatingSystem;


    // Private constructor
    // The Computer object can only be created through the Builder.
    private Computer(Builder builder) {

        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }


    // Method to display Computer information
    public void showDetails() {

        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Operating System: " + operatingSystem);
    }


    // =====================================================
    // Builder Class
    // =====================================================
    // This class is responsible for building the Computer
    // object step by step.

    public static class Builder {

        // Builder properties
        private String cpu;
        private int ram;
        private String storage;
        private String graphicsCard;
        private String operatingSystem;


        // Set CPU
        // 'return this' allows method chaining.
        public Builder setCPU(String cpu) {

            this.cpu = cpu;
            return this;
        }


        // Set RAM
        public Builder setRAM(int ram) {

            this.ram = ram;
            return this;
        }


        // Set Storage
        public Builder setStorage(String storage) {

            this.storage = storage;
            return this;
        }


        // Set Graphics Card
        // This property is optional.
        public Builder setGraphicsCard(String graphicsCard) {

            this.graphicsCard = graphicsCard;
            return this;
        }


        // Set Operating System
        public Builder setOperatingSystem(String operatingSystem) {

            this.operatingSystem = operatingSystem;
            return this;
        }


        // Build method
        // This creates and returns the final Computer object.
        public Computer build() {

            return new Computer(this);
        }
    }
}


// =========================================================
// Main Class
// =========================================================

public class Main {

    public static void main(String[] args) {


        // =================================================
        // Creating a Gaming Computer
        // =================================================

        // We create the Computer step by step using Builder.
        Computer gamingPC = new Computer.Builder()

                .setCPU("Intel Core i5")
                .setRAM(16)
                .setStorage("512GB SSD")
                .setGraphicsCard("RTX 4060")
                .setOperatingSystem("Windows 11")

                // Finally create the Computer object
                .build();


        // Display Gaming PC information
        System.out.println("===== GAMING PC =====");

        gamingPC.showDetails();


        System.out.println();


        // =================================================
        // Creating an Office Computer
        // =================================================

        // We don't need a Graphics Card for the Office PC.
        // Therefore, we simply don't call setGraphicsCard().
        Computer officePC = new Computer.Builder()

                .setCPU("Intel Core i3")
                .setRAM(8)
                .setStorage("256GB SSD")
                .setOperatingSystem("Windows 11")

                // Create the final Computer object
                .build();


        // Display Office PC information
        System.out.println("===== OFFICE PC =====");

        officePC.showDetails();
    }
}