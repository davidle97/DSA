/* Given an integer array nums sorted in non-decreasing order,
 remove the duplicates in-place such that each unique element appears
  only once. The relative order of the elements should be kept the same.
 */
package InterviewQuestions;

import java.util.Arrays;

public class removeDublicateFromArray {
    public static void main(String[] args) {
        Integer[] arr = {1,2,5,5,6,6};
        System.out.println(Arrays.toString(Removedublicated(arr)));
    }
    private static Integer[] Removedublicated(Integer[] arr) {
        if (arr.length ==0 || arr.length==1) return arr;
        int i = 1;
        int j = 0;
        for (i =1 ; i<arr.length; i++){
            if (arr[i] != arr[j]){
                j++;
                arr[j]= arr[i];
            }
        }
        j=j+1;
        while (j < arr.length){
            arr[j] = 0;
            j++;
        }

        return arr;
    }
}
