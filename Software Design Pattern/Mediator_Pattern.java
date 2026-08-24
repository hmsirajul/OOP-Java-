// =====================================================
// Mediator Interface
// =====================================================
// Defines how users communicate through the mediator.

interface ChatMediator {

    // Add a user to the chat room
    void addUser(User user);

    // Send a message to other users
    void sendMessage(String message, User sender);
}


// =====================================================
// Concrete Mediator
// =====================================================
// ChatRoom is the actual Mediator.
//
// It controls communication between users.

class ChatRoom implements ChatMediator {

    // Store all users
    private java.util.List<User> users = new java.util.ArrayList<User>();


    // Add a user
    @Override
    public void addUser(User user) {

        users.add(user);
    }


    // Send message
    @Override
    public void sendMessage(String message,User sender) {


        // Send message to every user except sender
        for (User user : users) {

            if (user != sender) {

                user.receive(message, sender);
            }
        }
    }
}


// =====================================================
// Colleague / User
// =====================================================
// User communicates with other users through the
// Mediator instead of communicating directly.

class User {

    private String name;

    private ChatMediator mediator;


    // Constructor
    public User(String name,ChatMediator mediator) {

        this.name = name;
        this.mediator = mediator;
    }


    // Get user name
    public String getName() {

        return name;
    }


    // Send message
    public void send(String message) {

        System.out.println(name + " sends: " + message);

        // Ask mediator to send the message
        mediator.sendMessage(message, this);
    }


    // Receive message
    public void receive(String message,User sender) {

        System.out.println(name + " receives from "+ sender.getName()+ ": " + message);
    }
}


// =====================================================
// Main Class
// =====================================================

public class Main {

    public static void main(String[] args) {

        // Create Mediator
        ChatMediator chatRoom =new ChatRoom();


        // Create Users
        User rahim =new User("Rahim", chatRoom);

        User karim =new User("Karim", chatRoom);

        User hasan =new User("Hasan", chatRoom);


        // Add users to ChatRoom
        chatRoom.addUser(rahim);
        chatRoom.addUser(karim);
        chatRoom.addUser(hasan);


        System.out.println("===== CHAT =====");


        // Rahim sends a message
        rahim.send("Hello everyone!");


        System.out.println();


        // Karim sends a message
        karim.send("Hi Rahim!");
    }
}