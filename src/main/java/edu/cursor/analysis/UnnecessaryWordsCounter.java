package edu.cursor.analysis;

import java.util.ArrayList;
import java.util.List;

public class UnnecessaryWordsCounter extends AllWordsCounter {

    public static List<String> swearing = new ArrayList<>();
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

        for (int i = 0; i < findingText.size(); i++) {
            if (findingText.get(i).length() <= 3) {
                unnecessaryWords.add(findingText.get(i));
            }
        }
        for (int i = 0; i < findingText.size(); i++) {
            for (int j = 0; j < swearing.size(); j++) {
                if (findingText.get(i).length() > 3) {
                    if (findingText.get(i).substring(0, 3).equals(swearing.get(j).substring(0, 3))) {
                        unnecessaryWords.add(findingText.get(i));
                    }
                }
            }
        }
    }
}