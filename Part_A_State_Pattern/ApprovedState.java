public class ApprovedState implements DocumentState {

    public void submitForReview(Document document) {
        System.out.println(
                "Invalid transition: The document is already approved."
        );
    }
    public void approve(Document document) {
        System.out.println("The document is already approved.");
    }
    public void reject(Document document) {
        System.out.println(
                "Invalid transition: An approved document cannot be rejected."
        );
    }
    public void publish(Document document) {
        System.out.println("The approved document has been published.");
        document.setState(new PublishedState());
    }

    public void sendBackForRevision(Document document) {
        System.out.println("The document has been sent back for revision.");
        document.setState(new DraftState());
    }
    public String getStateName() {
        return "Approved";
    }
}