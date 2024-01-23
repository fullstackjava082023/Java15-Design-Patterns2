package Memento;

import java.util.Stack;

public class Editor {


    private String author;
    private String content;//a//b -> undo -> //a //c//d//e undo undo  < a >  content = c ->a
    private Stack<EditorState> stateHistory = new Stack<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        createState();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
        createState();
    }

    private void createState() {
        EditorState newEditorState = new EditorState(content,author);
        stateHistory.push(newEditorState);//save into the history
    }

    public void undo() {
        restoreState();
    }

    private void restoreState() {
        stateHistory.pop();
        EditorState previousEditorState = stateHistory.peek();
        content = previousEditorState.getContent();
        author = previousEditorState.getAuthor();
    }

    @Override
    public String toString() {
        return "Editor{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
