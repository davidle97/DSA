//Given Array, but the best profit if buy and sell stock

package InterviewQuestions;

public class SellAndBuyStock {
    public static void main(String[] args) {
        int[] arr ={12,4,7,2,9,6,13};
        int min = arr[0];
        int newprofit =0;
        int overalprofit=0;
        int max = arr[0];

        for ( int i =1 ; i<arr.length;i++){
            if(arr[i]< min){
                min = arr[i];

            } else if (arr[i]>min){
                max=arr[i];
                newprofit=max-min;

            }
            if( newprofit>overalprofit){
                overalprofit=newprofit;
            }
        }
        System.out.println(overalprofit);
    }
}
