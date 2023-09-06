/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
 */
package InterviewQuestions;

public class LonggestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"Hello", "Hella", "Hell"};
        String[] str2 ={"Flower","Baby", "David"};
        System.out.println(LongestCommonPre(str));
    }

    private static String LongestCommonPre(String[] str) {
        String str1 = str[0];
        for (int i=1; i< str.length;i++){
            while (str[i].indexOf(str1) !=0){
                str1 = str1.substring(0,str1.length() -1);
            }
        }
        return str1;

    }
}
