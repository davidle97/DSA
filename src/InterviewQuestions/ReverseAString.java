package InterviewQuestions;

public class ReverseAString {
    public static void main(String[] args) {
        String a = "Hello";
        for (int i = a.length()-1; i>=0;i--){
            System.out.print(a.charAt(i));
        }
    }
}



