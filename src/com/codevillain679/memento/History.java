package com.codevillain679.memento;

import java.util.Stack;

public class History {
    private Stack<EditorState> states;

    public History(){
        this.states = new Stack<>();
    }

    public void push(EditorState state){
        states.push(state);
    }

    public EditorState pop(){
        if(!states.empty()){
            states.pop(); // remove last element
            if(!states.empty()){
                EditorState editorState = states.peek();
                return editorState;
            }
        }
        return new EditorState(); // return new editorState object
    }
}
