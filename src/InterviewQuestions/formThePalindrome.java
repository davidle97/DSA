//Given string, return true if string can be formed as a Palindrome, if not return false.
package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class formThePalindrome {
  public static void main(String[] args) {
    String str = "";
    isFormedThePalindrome(str);
    System.out.println(isFormedThePalindrome(str));
  }
  private static Boolean isFormedThePalindrome(String str) {
    char[] arr = str.toCharArray();
    Map<Character, Integer> map = new HashMap<>();
    if (arr.length == 0) return true;
    for (int i = 0; i < arr.length; i++) {
      char ch = arr[i];
      if (map.containsKey(ch)) {
        map.put(ch, map.get(ch) + 1);
      } else {
        map.put(ch, 1);
      }
    }
    int evenCount = 0;
    int oddCount = 0;
    if (arr.length % 2 == 0) {
      for (Map.Entry<Character, Integer> entry1 : map.entrySet()) {
        if (entry1.getValue() % 2 == 0) {
          return true;
        } else {
          return false;
        }
      }
    }
     else{
        for (Map.Entry<Character, Integer> entry2 : map.entrySet()) {
          if (entry2.getValue() % 2 == 0) {
            evenCount = evenCount + 2;
          } else {
            oddCount = oddCount + 1;
          }
        }
        if (oddCount < 2 ) return true;
      }
     return false;
  }
}
