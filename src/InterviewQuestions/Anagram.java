package InterviewQuestions;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//        An Anagram is a word or phrase formed by rearranging the letters of
//        a different word or phrase, typically using all the original letters
//        exactly once.

import java.util.ArrayList;
import java.util.HashSet;

public class Anagram {


    public static boolean Angram(String s, String t) {
        if (s.length() != t.length()) return false;

        ArrayList<Character> hs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            hs.add((s.charAt(i)));

        }
        for (int i = 0; i < t.length(); i++) {
            if (hs.contains(t.charAt(i))== true) {
                hs.remove(t.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean a = Angram("anagram", "nagaram");
        System.out.println(a);

    }
}
