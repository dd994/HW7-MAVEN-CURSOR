package edu.cursor.analysis;

import java.util.HashMap;
import java.util.Map;

public class PopularWords extends AllWordsCounter {

    private static Map<String, Integer> counts = new HashMap<>();


    public  static void countPopularWords() {
        for (String str : findingText) {
            if (counts.containsKey(str)) {
                counts.put(str, counts.get(str) + 1);
            } else {
                counts.put(str, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }
}