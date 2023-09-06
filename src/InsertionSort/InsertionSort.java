package InsertionSort;

public class InsertionSort {
    public static void InsertionSort( int [] array){
        for (int i =1; i<array.length;i++){
            int temp = array[i];
            int j = i-1;
            //it's important to check if j>-1 first because it gonna throw an error if index if out of range
            while (j>-1 && temp < array[j] )
            {
                array[j+1] = array[j];
                array[j]=temp;
                j--;
            }
        }
    }
    public static void main (String args[]){
        int[] myArray = {2,5,98,1,6,3,7,90,8};
        InsertionSort(myArray);
        System.out.println(myArray);
    }
}
