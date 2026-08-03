public class DraftState implements DocumentState {
        @Override
        public void submitForReview(Document document) {
            System.out.println("The draft document submitted for review.");
            document.setState(new ReviewState());
        }
        public void approve(Document document) {
            System.out.println(
                    "Invalid transition: Draft document can't be approved."
            );
        }
        public void reject(Document document) {
            System.out.println(
                    "Invalid transition: A draft document cannot be rejected."
            );
        }
        public void publish(Document document) {
            System.out.println(
                    "Invalid transition: A draft document cannot be published."
            );
        }
        public void sendBackForRevision(Document document) {
            System.out.println("The document is already in the Draft state.");
        }
        public String getStateName() {
            return "Draft";
        }

}
