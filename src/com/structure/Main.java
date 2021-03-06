package com.structure;

import java.util.Locale;

public class Main {
    public static void main(String[] args){
        String sentence = "To be or not to be";
        String sentence1 = "Paranoids are not paranoid because they are paranoid but" +
                "because they keep putting themselves deliberately into"+
                "paranoid avoidable situations";
        MyHashMap<String,Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words){
            Integer value = myHashMap.get(word);
            if (value==null) value = 1;
            else value=value+1;
            myHashMap.add(word, value);
        }int frequency = myHashMap.get("to");
        System.out.println(myHashMap);
    }
}
