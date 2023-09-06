//KT: indexOf(char) will return -1 if there is no char in the string

package InterviewQuestions;


import java.util.Locale;

public class PanGram {
    public static void main(String[] args) {
        String st =" The quick brown fox jumps over the lazy dog";
        System.out.println(isPanaGran(st.toLowerCase()));
    }
    private static boolean isPanaGran(String s){
        if (s.length()<26) {
            return false;
        } else {

            for (char ch = 'a'; ch <'z'; ch++){
                if(s.indexOf(ch) <0){
                    return false;
                }

            }
        }
        return true;
    }
}
