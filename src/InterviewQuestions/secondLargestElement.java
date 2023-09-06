package InterviewQuestions;


public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if (arr.length < 2) {
            System.out.println("Invalid Input");;
        }

        for (int i = 0; i< arr.length; i++){
            if (arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i]> secondLargest && arr[i]<firstLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);


    }
}
