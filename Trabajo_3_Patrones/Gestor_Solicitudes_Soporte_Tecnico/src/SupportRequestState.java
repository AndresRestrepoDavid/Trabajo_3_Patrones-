public abstract class SupportRequestState {
    protected SupportRequest request;

    public SupportRequestState(SupportRequest request) {
        this.request = request;
    }

    public abstract void proceed();
}
