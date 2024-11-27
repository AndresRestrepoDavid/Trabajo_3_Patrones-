public class PrintVisitor implements Visitor {
    @Override
    public void visit(Document document) {
        System.out.println("Contenido del documento: " + document.getContent());
    }
}
