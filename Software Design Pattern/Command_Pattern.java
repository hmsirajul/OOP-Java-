// =====================================================
// Receiver
// =====================================================
// The Receiver is the object that actually performs
// the requested operation.

class Light {

    public void turnOn() {

        System.out.println("Light is ON.");
    }

    public void turnOff() {

        System.out.println("Light is OFF.");
    }
}


// =====================================================
// Command Interface
// =====================================================
// Defines the common operation for all commands.

interface Command {

    //Declare abstract methods

    void execute();
}


// =====================================================
// Concrete Command 1
// =====================================================
// This command turns the light ON.

class TurnOnCommand implements Command {

    private Light light;


    public TurnOnCommand(Light light) {

        this.light = light;
    }


    @Override
    public void execute() {

        light.turnOn();
    }
}


// =====================================================
// Concrete Command 2
// =====================================================
// This command turns the light OFF.

class TurnOffCommand implements Command {

    private Light light;


    public TurnOffCommand(Light light) {

        this.light = light;
    }


    @Override
    public void execute() {

        light.turnOff();
    }
}


// =====================================================
// Invoker
// =====================================================
// The RemoteControl is the Invoker.
// It stores a command and executes it.

class RemoteControl {

    private Command command;


    // Set the command
    public void setCommand(Command command) {

        this.command = command;
    }


    // Execute the selected command
    public void pressButton() {

        command.execute();
    }
}


// =====================================================
// Main Class
// =====================================================

public class Main {

    public static void main(String[] args) {

        // Create Receiver
        Light light = new Light();


        // Create Commands
        Command turnOn =new TurnOnCommand(light);

        Command turnOff =new TurnOffCommand(light);


        // Create Invoker
        RemoteControl remote = new RemoteControl();


        // ---------------------------------------------
        // Turn ON the light
        // ---------------------------------------------

        remote.setCommand(turnOn);

        System.out.println("Press ON button:");

        remote.pressButton();


        System.out.println();


        // ---------------------------------------------
        // Turn OFF the light
        // ---------------------------------------------

        remote.setCommand(turnOff);

        System.out.println("Press OFF button:");

        remote.pressButton();
    }
}