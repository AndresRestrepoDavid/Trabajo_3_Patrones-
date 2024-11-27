import java.util.List;

public class DocumentIterator implements Iterator<Document>{
    private List<Document> documents;
    private int position = 0;

    public DocumentIterator(List<Document> documents) {
        this.documents = documents;
    }

    @Override
    public boolean hasNext() {
        return position < documents.size();
    }

    @Override
    public Document next() {
        return documents.get(position++);
    }
}
