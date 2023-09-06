// Write a java program to find intersection of 2 arrays in java
package InterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] ={4,2,1,3,6};
        int arr2[]= {5,4,7,8,6};
     //   printIntersection(arr1,arr2);
        SecondSolution(arr1,arr2);
     }

    private static void printIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int j = 0; j< arr2.length;j++){
            if(hs.contains(arr2[j])){
                System.out.println(arr2[j]);
            }
        }

    }
    private static void SecondSolution(int[] arr1, int[] arr2){
        ArrayList<Integer> newArray1 = new ArrayList<>();
        for (int i =0; i<arr1.length;i++){
            newArray1.add(arr1[i]);
        }
        for (int i=0;i<arr1.length;i++){
            if(newArray1.contains(arr2[i])){
                System.out.println(arr2[i]);
            }
        }
    }
}
