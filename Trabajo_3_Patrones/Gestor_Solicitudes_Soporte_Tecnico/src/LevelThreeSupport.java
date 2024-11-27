public class LevelThreeSupport extends Handler{
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getLevel() == 3) {
            System.out.println("Nivel 3 manejando la solicitud: " + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
