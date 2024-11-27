
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new SupportMediator();

        SupportRequest request1 = new SupportRequest("Problema con la conexión a internet", 1);
        SupportRequestComponent component1 = new SupportRequestComponent(mediator, request1);
        component1.createRequest();
        request1.proceed();
        request1.proceed();

        SupportRequest request2 = new SupportRequest("Error en el sistema operativo", 2);
        SupportRequestComponent component2 = new SupportRequestComponent(mediator, request2);
        component2.createRequest();
        request2.proceed();
        request2.proceed();
    }
}