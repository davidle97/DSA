//Write a java program to count number of even  and odd digits in a number
package InterviewQuestions;

public class NumberOfOddAndEvenInInteger {
    public static void main(String[] args) {

        int number = 123456;
        int odd =0;
        int even = 0;
        int digit=0;
        while (number!=0){
            digit=number % 10;
            number=number/10;
            if ( digit % 2 == 0){
                odd =odd+1;
            }
            else{
                even =even+1;
            }

        }
        System.out.println("Odd: "+odd);
        System.out.println("Even: "+even);

    }
}
