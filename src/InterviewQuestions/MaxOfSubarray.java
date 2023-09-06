package InterviewQuestions;

public class MaxOfSubarray {
    public static void main(String[] args) {
        int[] arr={-2,-1,-3,4,-1,2,1,-5,4};
        int maxsofar =arr[0];
        int maxendhere = arr[0];
        for (int i =0; i<arr.length;i++){
            maxendhere=Math.max(maxendhere+arr[i],arr[i]);
            maxsofar = Math.max(maxsofar,maxendhere);
        }
        System.out.println(maxsofar);
    }
}
