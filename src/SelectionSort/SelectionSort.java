package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void Selectionsort(int[] array){
        for (int i=0; i<array.length;i++){
            int minIndex = i;
            for (int j =i+1;j<array.length; j++){
                if (array[j] < array[minIndex]){
                    minIndex=j;
                }
            }
            if (i != minIndex){
            int temp =array[i];
            array[i]=array[minIndex];
            array[minIndex]= temp;
            }
        }
    }
    public static void main (String args[]){
        int[] array1={1,6,3,4,8,2,5};
        Selectionsort(array1);
        System.out.println(Arrays.toString(array1));

    }
}
