public class ReviewState implements DocumentState {

    @Override
    public void submitForReview(Document document) {
        System.out.println("The document is already under review.");
    }

    @Override
    public void approve(Document document) {
        System.out.println("The document has been approved.");
        document.setState(new ApprovedState());
    }

    @Override
    public void reject(Document document) {
        System.out.println(
                "The document was rejected and returned to Draft."
        );
        document.setState(new DraftState());
    }

    @Override
    public void publish(Document document) {
        System.out.println(
                "Invalid transition: A document under review cannot be published."
        );
    }

    @Override
    public void sendBackForRevision(Document document) {
        System.out.println(
                "Invalid transition: Reject the document to return it to Draft."
        );
    }

    @Override
    public String getStateName() {
        return "Under Review";
    }
}