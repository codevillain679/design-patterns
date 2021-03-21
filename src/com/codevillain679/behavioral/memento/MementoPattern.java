package com.codevillain679.behavioral.memento;

/**
 * Using the Memento design pattern gives us a way to capture and store an object’s (text editor data here) internal state so that we can restore it later.
 * It enables us to do this without compromising on the encapsulation.

 * In this, we create a snapshot of the editor data before applying any operation to the editor.
 * This snapshot represents the state of the text editor at a given point in time. We store this snapshot in a stack.
 * To undo an operation, we pop a snapshot entry from the stack and restore the editor to that point in time.
 * In other words, we set the editor’s internal data values from the values of the snapshot.
*/

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
