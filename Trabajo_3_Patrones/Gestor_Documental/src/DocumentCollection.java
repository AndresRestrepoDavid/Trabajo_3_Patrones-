import java.util.ArrayList;
import java.util.List;

public class DocumentCollection {
    private List<Document> documents = new ArrayList<>();

    public void addDocument(Document document) {
        documents.add(document);
    }

    public Iterator<Document> createIterator() {
        return new DocumentIterator(documents);
    }
}
