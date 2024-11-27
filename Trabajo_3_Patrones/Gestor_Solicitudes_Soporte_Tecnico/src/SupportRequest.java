public class SupportRequest {
    private String description;
    private int level;
    private SupportRequestState state;

    public SupportRequest(String description, int level) {
        this.description = description;
        this.level = level;
        this.state = new NewState(this);
    }

    public String getDescription() {
        return description;
    }

    public int getLevel() {
        return level;
    }

    public void setState(SupportRequestState state) {
        this.state = state;
    }

    public void proceed() {
        state.proceed();
    }
}
