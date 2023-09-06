//This question is to insert into an array at specific position
package InterviewQuestions;

import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        int[] Arr= new int[5];
        System.out.println("Enter the element");
        Scanner sc = new Scanner(System.in);

        for(int i =0; i< Arr.length-1;i++){
            Arr[i] = sc.nextInt();
        }
        System.out.println("Enter the location you wannt insert");
        int location = sc.nextInt();
        System.out.println("Enter the value you wannt insert");
        int value = sc.nextInt();

        for(int i = Arr.length-1;i>location;i--){
            Arr[i] = Arr[i-1];
        }
        Arr[location] = value;
        for (int i: Arr){
            System.out.println(i);
        }
    }
}
