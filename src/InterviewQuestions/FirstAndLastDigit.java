package InterviewQuestions;

public class FirstAndLastDigit {
    public static void main(String[] args) {
        int a = 3456;

        if ( a <10 ){
            System.out.println("last digit and first digit is: "+a);
        }
        int last_digit = a %10;
        while(a > 10){
            a= a/10;
        }
        System.out.println("last digit is: " + last_digit);
        System.out.println("first digit is: " + a);


    }
}
