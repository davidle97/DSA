package Stack;

public class Main {
    public static void main(String args[]){
        Stack myStack = new Stack(5);

        myStack.getTop();
        myStack.getHeight();
        myStack.push(2);
        myStack.push(4);
        myStack.printStack();
        System.out.println("--------");
        myStack.pop();
        myStack.printStack();


    }
}
