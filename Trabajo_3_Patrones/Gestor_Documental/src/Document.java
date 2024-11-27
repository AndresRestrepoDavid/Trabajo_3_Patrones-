import java.util.Stack;

public class Document {
    private String content;
    private Stack<DocumentMemento> history = new Stack<>();

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        saveState();
        this.content = content;
    }

    public void saveState() {
        history.push(new DocumentMemento(content));
    }

    public void restoreState() {
        if (!history.isEmpty()) {
            DocumentMemento memento = history.pop();
            this.content = memento.getContent();
        }
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    private class DocumentMemento {
        private final String content;

        public DocumentMemento(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }
    }
}


