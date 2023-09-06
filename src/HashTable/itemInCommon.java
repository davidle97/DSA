package HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class itemInCommon {

    public static boolean Mutualitem(int[] array1, int[] array2){
        HashMap<Integer,Boolean> myHashMap = new HashMap<>();
        for (int i: array1){
            myHashMap.put(i,true);
        }
        for (int j: array2){
            if(myHashMap.get(j) != null) return true;
        }

        return false;

    }
    public static boolean CommonItems(int arr1[], int[] array2){
        Set<Integer> common= new HashSet<>();
        for (int i: arr1){
            common.add(i);
        }
        for (int j: array2){
            if (common.contains(j)){
                return true;
            }
        }
        return false;
    }
    public static void main (String args[]){
        int[] array1={1,2,3};
        int[] array2 = {2,4,5};
        System.out.println(Mutualitem(array1,array2));
    }
}
