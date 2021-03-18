package com.codevillain679.memento;

public class MementoPattern {
    public MementoPattern(){
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");

        editor.restore(history.pop());  //undo
        editor.restore(history.pop());  //undo

        editor.setContent("b");
        history.push(editor.createState());  //redo

        System.out.println(editor.getContent());
    }
}
