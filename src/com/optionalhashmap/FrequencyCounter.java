package com.optionalhashmap;
import java.util.HashMap;
public class FrequencyCounter {

    public static HashMap<Integer, Integer> frequency(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num: nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        int[] input = {1,1,3,3,3,5,7,7,7,7};
        HashMap<Integer, Integer> frequencyMap = frequency(input);

        System.out.println(frequencyMap);
    }
}
