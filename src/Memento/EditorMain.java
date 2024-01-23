package Memento;

public class EditorMain {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setContent("first content");
        editor.setAuthor("ilia");
        editor.undo();
        System.out.println(editor);
        editor.setAuthor("Arja");
        editor.setAuthor("john");
        editor.setContent("game of thrones");
        editor.setContent("harry potter");
        System.out.println(editor);
        editor.undo();
        System.out.println(editor);
        editor.undo();
        System.out.println(editor);
        editor.undo();
        System.out.println(editor);


    }
}
