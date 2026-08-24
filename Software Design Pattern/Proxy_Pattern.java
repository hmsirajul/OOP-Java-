// =====================================================
// Subject Interface
// =====================================================
// Defines the common operation for both the Proxy
// and the Real Object.

interface Document {

    //Declare abstract methods

    void open();
}


// =====================================================
// Real Subject
// =====================================================
// This is the actual object that performs the operation.

class RealDocument implements Document {

    private String fileName;

    public RealDocument(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void open() {

        System.out.println("Opening confidential document: " + fileName );
    }
}


// =====================================================
// Proxy
// =====================================================
// Proxy controls access to the RealDocument.
//
// It checks whether the user is authorized before
// allowing access to the real object.

class DocumentProxy implements Document {

    //Variable Declaration

    private RealDocument realDocument;
    private String userRole;
    private String fileName;

    // constructor 


    public DocumentProxy(String fileName, String userRole) {

        this.fileName = fileName;
        this.userRole = userRole;
    }


    @Override
    public void open() {

        // Check user permission
        if (userRole.equals("Admin")) {

            System.out.println("Access granted.");

            // Create the real object only when needed
            if (realDocument == null) {

                realDocument = new RealDocument(fileName);
            }

            // Forward request to the Real Object
            realDocument.open();

        } else {

            System.out.println("Access denied. Admin permission required.");
        }
    }
}


// =====================================================
// Main Class
// =====================================================

public class Main {

    public static void main(String[] args) {

        // User with Admin permission
        //creating a object of DocumentProxy class and passing the file name and user role as parameteres. 
        Document adminDocument =new DocumentProxy("CompanySecrets.pdf","Admin" );

        System.out.println("===== ADMIN USER =====");
        //method call

        adminDocument.open();


        System.out.println();


        // User without Admin permission
        Document normalUserDocument = new DocumentProxy("CompanySecrets.pdf","User");

        System.out.println("===== NORMAL USER =====");

        normalUserDocument.open();
    }
}