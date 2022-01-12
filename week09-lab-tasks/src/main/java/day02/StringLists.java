package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> shortestWords (List<String> words) {
        List<String> shortestWords = new ArrayList<>();
        for (String word : words) {
            if (shortestWords.size() == 0 || word.length() == shortestWords.get(0).length()) {
                shortestWords.add(word);
            } else if (word.length() < shortestWords.get(0).length()) {
                shortestWords.clear();
                shortestWords.add(word);
            }
        }
        return shortestWords;
    }
}