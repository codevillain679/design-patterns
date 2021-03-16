package com.codevillain679;

import com.codevillain679.memento.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var editor = new Editor();

        editor.write("a");
        editor.write("b");

        editor.undo();

        System.out.println(editor.toString());
    }
}
