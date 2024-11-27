public class UpperCaseVisitor implements Visitor {
    @Override
    public void visit(Document document) {
        document.setContent(document.getContent().toUpperCase());
    }
}
