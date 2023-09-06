/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself.
 */
package InterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null){
            return false;
        }
        if (s.length() != t.length()){
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i =0; i < s.length(); i ++){
            char x = s.charAt(i);
            char y = t.charAt(i);
            if (map.containsKey(x)){
                if (map.get(x) != y) {
                    return false;
                }
            } else {
                if (set.contains(y)){
                    return false;
                }
                map.put(x,y);
                set.add(y);
            }
        }
        return true;
    }
}
