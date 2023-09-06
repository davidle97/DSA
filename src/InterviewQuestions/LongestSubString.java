// Java program to find longest substring without repetition

package InterviewQuestions;

import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcdefeknugasy";
        System.out.println(longest(str));
    }

    private static String longest(String str) {
        HashSet<Character> set = new HashSet<>();
        String longestOveral="";
        String longestTillNow="";
        for( int i =0; i<str.length();i++){
            char c=str.charAt(i);
            if (set.contains(c)){
                longestTillNow="";
                set.clear();
            }
            set.add(c);
            longestTillNow+=c;

            if (longestTillNow.length()>longestOveral.length()){
                longestOveral=longestTillNow;
            }
        }
        return longestOveral;
    }
}
