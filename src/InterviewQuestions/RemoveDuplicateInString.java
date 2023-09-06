//Write a java program to remove the duplicated character in String
// Second method to remove duplicated words.

package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInString {
    public static void main(String[] args) {
        String str1="Davida";
        String str2 =" David is nice and David is handsome";
        System.out.println(RemoveDuplicate(str1));
        System.out.println(RemoveDuplicatedwords(str2));

    }
    public static String RemoveDuplicate ( String str) {
        Set<Character> set = new HashSet<>();
        StringBuffer newstring = new StringBuffer();

        for (int i = 0; i < str.length();i++){
            Character ch = str.charAt(i);
            if (!set.contains(ch)){
                set.add(ch);
                newstring.append(ch);
            }
        }

        return newstring.toString();
    }
    public static String RemoveDuplicatedwords (String str){
        String[] arr = str.split(" ");
        StringBuffer newstring = new StringBuffer();
        Set<String> set = new HashSet<>();
        for (int i =0; i<arr.length; i++){
            String str1 = arr[i];
            if(!set.contains(str1)){
                set.add(str1);
                newstring.append(str1 +" ");
            }
        }


        return newstring.toString();
    }


}
