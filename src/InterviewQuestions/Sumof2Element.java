//Given array and sum, return the total pairs of elemnts if sum of 2 element is equal to sum
package InterviewQuestions;

import java.util.HashSet;

public class Sumof2Element {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9}; //{2,8} {3,7} {6,4}
        int sum = 10;
        int count = 0;

        HashSet<Integer> hs = new HashSet<>();
        for (int i =0; i<arr.length;i++){
            hs.add(i);
        }

        for (int i=0; i<arr.length;i++){
            if (hs.contains(sum-arr[i])){
                count++;
            }
        }
        System.out.println(count/2);


    }
}
