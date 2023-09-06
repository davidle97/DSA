//Check whether a given String is well formed or not?
// String is well form mean every{}, (), [], always has open and close.
package InterviewQuestions;

import java.util.Stack;

public class StringIsWellFormed {
    public static void main(String[] args) {
        String str ="{(hello)]}";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(st.empty()){
                st.push(ch);
            } else if(ch=='{'||ch=='('|| ch=='['){
                st.push(ch);

            } else if(ch=='}' &&st.peek()=='{'){
                st.pop();
            }
            else if(ch==')' &&st.peek()=='('){
                st.pop();
            }
            else if(ch==']' &&st.peek()=='['){
                st.pop();
            }else{
                st.push(ch);
            }

        }
        if (st.empty()){
            System.out.println("Given String is well form");
        } else{
            System.out.println("Given String is not well form");

        }
    }
}
