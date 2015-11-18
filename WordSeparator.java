/*
Given an input string and a dictionary of words,
segment the input string into a space-separated
sequence of dictionary words if possible. For
example, if the input string is "applepie" and
dictionary contains a standard set of English words,
then we would return the string "apple pie" as output.
*/

import java.io.*;
import java.util.HashMap;


public class WordSeparator {

    public static HashMap<String, String> dict = new HashMap<String, String>();

    String wordSplit(String in) {

        if (in.equals("")) return null;

        if (dict.get(in) != null) return in;

        for (int i = 0; i < in.length(); i++) {
            String prefix = in.substring(0, i);
            if (dict.get(prefix) != null) {
                String suffix = in.substring(i, in.length());
                String suffixSplit = wordSplit(suffix);
                if (suffixSplit != null) {
                    return prefix + " " + suffixSplit; 
                }            
            }
        }
        return null;
    }

    public static void main(String[] args) {
        WordSeparator ws = new WordSeparator();
        ws.dict.put("a", "true");
        ws.dict.put("apple", "true");
        ws.dict.put("pie", "true");
        System.out.println(ws.wordSplit("applepie"));
    }
}







