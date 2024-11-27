public class NewState extends SupportRequestState {
    public NewState(SupportRequest request) {
        super(request);
    }

    @Override
    public void proceed() {
        System.out.println("Solicitud nueva, cambiando a estado En Proceso.");
        request.setState(new InProgressState(request));
    }

}

