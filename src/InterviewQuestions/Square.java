//Check wherether given number is a square of number
package InterviewQuestions;

public class Square {
    public static void main(String[] args) {
        int a = 16;
         if (a ==1) {
             System.out.println("Given numbe is square of: " + a);
         }
        for (int i = 0; i < a / 2; i++) {
            if ((i * i) == a) {
                System.out.println("Given numbe is square of: " + i);
            }

        }
    }
}
