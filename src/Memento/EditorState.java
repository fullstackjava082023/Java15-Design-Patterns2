package Memento;

public class EditorState {
    private String content;
    private String author;

    public EditorState(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

  
}
