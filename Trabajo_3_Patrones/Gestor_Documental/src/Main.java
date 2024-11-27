public class Main {
    public static void main(String[] args) {
        DocumentCollection collection = new DocumentCollection();

        Document doc1 = new Document("Hola Mundo");
        Document doc2 = new Document("Patrones de Diseño");

        collection.addDocument(doc1);
        collection.addDocument(doc2);

        Iterator<Document> iterator = collection.createIterator();

        Visitor printVisitor = new PrintVisitor();
        Visitor upperCaseVisitor = new UpperCaseVisitor();

        while (iterator.hasNext()) {
            Document doc = iterator.next();
            doc.accept(printVisitor);
            doc.accept(upperCaseVisitor);
            doc.accept(printVisitor);
        }

        // Restaurar el estado original del primer documento
        doc1.restoreState();
        doc1.accept(printVisitor);
    }
}