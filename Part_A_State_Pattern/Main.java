public class Main {

    public static void main(String[] args) {
        Document document =
                new Document("State Pattern Lab Report");

        document.displayStatus();
        System.out.println("\n1. Submitting document:");
        document.submitForReview();

        System.out.println("\n2. Approving document:");
        document.approve();

        System.out.println("\n3. Publishing document:");
        document.publish();

        System.out.println("\n4. Attempting an invalid transition:");
        document.sendBackForRevision();

        System.out.println();
        document.displayStatus();
    }
}