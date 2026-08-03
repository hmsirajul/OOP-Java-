public class PublishedState implements DocumentState {

    private void showInvalidMessage() {
        System.out.println(
                "Invalid transition: A published document cannot be modified."
        );
    }

    @Override
    public void submitForReview(Document document) {
        showInvalidMessage();
    }

    @Override
    public void approve(Document document) {
        showInvalidMessage();
    }

    @Override
    public void reject(Document document) {
        showInvalidMessage();
    }

    @Override
    public void publish(Document document) {
        System.out.println("The document is already published.");
    }

    @Override
    public void sendBackForRevision(Document document) {
        showInvalidMessage();
    }

    @Override
    public String getStateName() {
        return "Published";
    }
}