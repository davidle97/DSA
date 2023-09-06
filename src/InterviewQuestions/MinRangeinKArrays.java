//Find the minimum value of 2 elements in sorted arrays
package InterviewQuestions;


public class MinRangeinKArrays {
    public static void main(String[] args) {
        int[] arr1 ={1,2,5,10};
        int[] arr2 = {5,12,45,67};
        int dif = Integer.MAX_VALUE;
        int i = 0;
        int j =0;

        while ( i < arr1.length && j <arr2.length){
            int low = Math.min(arr1[i],arr2[j]);
            int high = Math.max(arr1[i],arr2[j] );
             if (dif > high -low){
                 dif = high -low;
             }
             if (arr1[i]==low){
                 i++;
             } else if (arr2[j]==low){
                 j++;
             }

        }
        System.out.println(dif);
        }
    }

