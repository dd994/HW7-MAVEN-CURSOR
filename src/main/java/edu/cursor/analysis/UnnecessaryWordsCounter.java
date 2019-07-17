package edu.cursor.analysis;

import java.util.ArrayList;
import java.util.List;

public class UnnecessaryWordsCounter extends AllWordsCounter {

    private static List<String> swearing = new ArrayList<>();
    public static List<String> unnecessaryWords = new ArrayList<>();

    public static void searchUnnecessaryWords() {

        swearing.add("fuck");
        swearing.add("shit");
        swearing.add("damn");
        swearing.add("bitch");
        swearing.add("asshole");
        swearing.add("bullshit");
        swearing.add("ass");
        swearing.add("nigger");
        swearing.add("poop");
        swearing.add("whore");

        for (String s : findingText) {
            if (s.length() <= 3) {
                unnecessaryWords.add(s);
            }
        }

        for (String s : findingText) {
            for (String value : swearing) {
                if (s.length() > 3) {
                    if (s.substring(0, 3).equals(value.substring(0, 3))) {
                        unnecessaryWords.add(s);
                    }
                }
            }
        }
    }
}