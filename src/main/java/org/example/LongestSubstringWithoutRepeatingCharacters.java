package org.example;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                max += 1;
                map.put(s.charAt(i), i);
            }
            for (int j = i + 1; j < s.length(); j++) {
                if (!map.containsKey(s.charAt(j))) {
                    max += 1;
                    map.put(s.charAt(j), j);
                } else {
                    break;
                }
            }
            if (result < max) {
                result = max;
            }
            max = 0;
            map.clear();
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" "));
    }
}
