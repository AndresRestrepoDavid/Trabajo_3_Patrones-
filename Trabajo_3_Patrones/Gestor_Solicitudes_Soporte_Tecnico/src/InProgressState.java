public class InProgressState extends SupportRequestState{
    public InProgressState(SupportRequest request) {
        super(request);
    }

    @Override
    public void proceed() {
        System.out.println("Solicitud en proceso, cambiando a estado Resuelta.");
        request.setState(new ResolvedState(request));
    }
}
