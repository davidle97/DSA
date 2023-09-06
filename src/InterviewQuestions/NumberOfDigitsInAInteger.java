//Write a java program to count number of digits in an integer
package InterviewQuestions;

public class NumberOfDigitsInAInteger {
    public static void main(String[] args) {
        int number = 32434;
        int count =0;
        int sum =0;
        while (number!=0){
            sum = number % 10;
            number = number/10;
            count+= sum;
        }
        System.out.println(count);
    }
}
