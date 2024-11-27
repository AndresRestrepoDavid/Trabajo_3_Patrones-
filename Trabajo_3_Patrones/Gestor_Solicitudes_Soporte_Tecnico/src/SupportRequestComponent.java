public class SupportRequestComponent extends Component{
    private SupportRequest request;

    public SupportRequestComponent(Mediator mediator, SupportRequest request) {
        super(mediator);
        this.request = request;
    }

    public void createRequest() {
        mediator.notify(request, "newRequest");
    }

}
