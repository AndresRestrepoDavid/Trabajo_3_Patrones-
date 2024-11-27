public class ResolvedState extends SupportRequestState{
    public ResolvedState(SupportRequest request) {
        super(request);
    }

    @Override
    public void proceed() {
        System.out.println("Solicitud ya está resuelta.");
    }
}
