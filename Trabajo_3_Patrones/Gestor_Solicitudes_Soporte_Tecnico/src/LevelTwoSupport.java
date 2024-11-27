public class LevelTwoSupport extends Handler{
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getLevel() == 2) {
            System.out.println("Nivel 2 manejando la solicitud: " + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
