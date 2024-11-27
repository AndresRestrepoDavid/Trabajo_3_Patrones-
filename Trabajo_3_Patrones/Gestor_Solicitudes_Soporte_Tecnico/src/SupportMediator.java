
public class SupportMediator implements Mediator{
    private Handler handlerChain;

    public SupportMediator() {
        // Configuramos la cadena de responsabilidad
        Handler levelOne = new LevelOneSupport();
        Handler levelTwo = new LevelTwoSupport();
        Handler levelThree = new LevelThreeSupport();

        levelOne.setNextHandler(levelTwo);
        levelTwo.setNextHandler(levelThree);

        this.handlerChain = levelOne;
    }

    @Override
    public void notify(SupportRequest request, String event) {
        if (event.equals("newRequest")) {
            handlerChain.handleRequest(request);
        }
    }
}
