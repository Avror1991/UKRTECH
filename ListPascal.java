package com.company;

import java.util.ArrayList;

public class ListPascal {
    public static void main(String[] args) {
        ArrayList<String> programing = new ArrayList<String>();
        programing.add("JS");
        programing.add("Java");
        programing.add("Pascal");
        programing.add("PHP");

        if(programing.contains("Pascal")){
            programing.remove("Pascal");
        }
        System.out.println(programing);

    }
}
