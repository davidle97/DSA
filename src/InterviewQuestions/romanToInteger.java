package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
    public static void main(String[] args) {
        String str = "IV";
        System.out.println(romanToInt(str));

    }
    public static int romanToInt(String s) {
        if (s.length() ==0){
            return -1;
        }
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int length = s.length();
        int result = m.get(s.charAt(length-1));

        for (int i = length-2;i>=0;i--){
            if (m.get(s.charAt(i))>= m.get(s.charAt(i+1))){
                result += m.get(s.charAt(i));
            } else {
                result -= m.get(s.charAt(i));
            }
        }
       return result;

    }
}
