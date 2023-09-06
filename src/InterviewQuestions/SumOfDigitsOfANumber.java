//Write a java program to find sum of digits of a number
package InterviewQuestions;

import java.util.Scanner;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        int digit =0;

        while(num>0){
            digit = num%10;
            sum=sum+digit;
            num = num/10;
        }
        System.out.println("Sum Of digit is: " +sum);


    }
}
