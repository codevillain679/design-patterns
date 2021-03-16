package com.codevillain679.memento;

public class Editor {
    private History history;
    private String content;

    public Editor(){
        history = new History();
        content = null;
    }

    public void write(String content){
        this.content = content;
        createState();
    }

    public void undo(){
        EditorState editorState = history.pop();
        restore(editorState);
    }

    @Override
    public String toString() {
        return content;
    }

    private void createState(){
        EditorState editorState = new EditorState();
        editorState.setContent(content);
        history.push(editorState);
    }

    public void restore(EditorState state){
        this.content = state.getContent();
    }
}
