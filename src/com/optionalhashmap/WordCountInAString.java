package com.optionalhashmap;
import java.util.HashMap;
public class WordCountInAString {

    public static HashMap<String, Integer> countString(String str) {
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        String[] words = str.split("\\s+");

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        String input = "Happy birthday to you. Happy birthday to you. Happy birthday dear friend, Happy birthday to you.";
        HashMap<String, Integer> frequencyMap = countString(input);

        System.out.println(frequencyMap);
    }

}
