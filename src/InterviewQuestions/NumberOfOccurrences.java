//Java Program to find number of occurrences of character in String
package InterviewQuestions;

import java.util.Scanner;

public class NumberOfOccurrences {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        int initialLength = str.length();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the Character to find the occurence");
        String str1 = sc.nextLine();
        String str2 = str.replace(str1,"");
        int finalLength = str2.length();
        System.out.println("Occurences is "+(initialLength -finalLength));
    }

}
