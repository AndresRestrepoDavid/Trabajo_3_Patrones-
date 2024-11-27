public class LevelOneSupport extends Handler{
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getLevel() == 1) {
            System.out.println("Nivel 1 manejando la solicitud: " + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
