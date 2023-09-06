//Givestring {{2,3}} =2*2+3*2 = 10 because 2,3 in level 2 of depth.
package InterviewQuestions;

import java.util.Stack;

public class SumbyDeep {
    public static void main(String[] args) {
        String str ="{{1,5},7,{3,6}";
        int sum = 0 ;
        int dept =0;
        int total=0;
        Stack<Character> st = new Stack<>();

        for (int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='{'){
                st.push(ch);
                dept++;
            } else if(ch == '1'||ch == '2'||ch == '3'||ch == '4'||ch == '5'||ch == '6'||ch == '7'||ch == '8'||ch == '9'){
                int a = ch -'0';
                sum = a*dept;
                total += sum;

            } else if(ch=='}'){
                dept--;
            }
        }
        System.out.println(total);
    }
}
