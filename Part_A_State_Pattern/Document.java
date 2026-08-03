public class Document {
    private DocumentState state;
    private final String title;

    public Document(String title) {
        this.title = title;
        this.state = new DraftState();
    }
    public void setState(DocumentState state) {
        this.state = state;
        System.out.println("State changed to: " + state.getStateName());
    }
    public DocumentState getState() {
        return state;
    }
    public void submitForReview() {
        state.submitForReview(this);
    }
    public void approve() {
        state.approve(this);
    }
    public void reject() {
        state.reject(this);
    }
    public void publish() {
        state.publish(this);
    }
    public void sendBackForRevision() {
        state.sendBackForRevision(this);
    }
    public void displayStatus() {
        System.out.println(
                "Document: " + title +
                        " | Current state: " + state.getStateName()
        );
    }
}
