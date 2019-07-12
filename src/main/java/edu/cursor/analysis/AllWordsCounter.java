package edu.cursor.analysis;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AllWordsCounter {

    public static List<String> findingText = new ArrayList<>();

    public   static void allWordsCounter() {
        File file = new File("src/data.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    for (String word : line.toLowerCase().split(" ")) {
                        findingText.add(word);
                    }
                }
            }
            bufferedReader.close();
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            System.out.println("Error");
        }
    }
}
