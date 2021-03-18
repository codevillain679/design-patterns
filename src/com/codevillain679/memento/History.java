package com.codevillain679.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states;

    public History(){
        this.states = new ArrayList<>();
    }

    public void push(EditorState state){
        states.add(state);
    }

    public EditorState pop(){
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }
}
