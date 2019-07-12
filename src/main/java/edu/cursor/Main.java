package edu.cursor;

import edu.cursor.analysis.AllWordsCounter;
import edu.cursor.analysis.PopularWords;
import edu.cursor.analysis.UnnecessaryWordsCounter;
import static edu.cursor.analysis.AllWordsCounter.findingText;
import static edu.cursor.analysis.UnnecessaryWordsCounter.unnecessaryWords;

public class Main {
    public static void main(String[] args) {
        System.out.println("Today we will analyze the song: Guns N' Roses - \"Get in the Ring\"\n");

        AllWordsCounter.allWordsCounter();
        System.out.println("Total words in text of the song is " +findingText.size()+"\n");

        UnnecessaryWordsCounter.searchUnnecessaryWords();
        System.out.println("The count of unnecessary words(swearing and words less than 4 letters) is: "+ unnecessaryWords.size()+"\n");

        System.out.println("The most popular words (there are more than 5 times:");
        PopularWords.countPopularWords();

    }
}
