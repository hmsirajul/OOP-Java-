public interface DocumentState {

        void submitForReview(Document document);
        void approve(Document document);
        void reject(Document document);
        void publish(Document document);
        void sendBackForRevision(Document document);
        String getStateName();

}
