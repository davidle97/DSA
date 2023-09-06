package InterviewQuestions;
import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));

    }
    public static boolean isPalindrome(int x) {
        int q = x;
        if (x < 0){
            return false;
        }
        int y =0;
        while (x > 0 ){
            y = y*10;
            y = y+ x%10;
            x = x /10;
        }
        return q == y;
    }
}
