package MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int[] array1, int[] array2){
        int [] combined = new int[array1.length + array2.length];
        int index = 0; // index of new array
        int i = 0;//index of array1
        int j = 0; // index of array 2

        while(i <array1.length && j <array2.length){
            if (array1[i]< array2[j]) {
                combined[index]=array1[i];
                index++;
                i++;
            } else {
                combined[index] = array2[j];
                index++;
                j++;
            }
        }
            while(i< array1.length){
                combined[index]=array1[i];
                index++;
                i++;
            }
            while (j< array2.length){
                combined[index]=array2[j];
                index++;
                j++;
            }
        return combined;
    }

    public static int[] mergeSort(int[] array){
        if(array.length==1) return array;
        int mid = array.length/2;
        int[] left = Arrays.copyOfRange(array,0,mid);
        int[] right = Arrays.copyOfRange(array, mid,array.length);
        return merge(mergeSort(left),mergeSort(right));
    }

    public static void main (String args[]){
        int[] Array1= {1,3,2,67,564,7,8};
        System.out.println(Arrays.toString(mergeSort(Array1)));
    }
}
