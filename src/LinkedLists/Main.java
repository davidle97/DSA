package LinkedLists;

public class Main {
    public static void main(String[] args){
        /*LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.Append(6);
        myLinkedList.getLength();*/

//        LinkedList myLinkedlist2 = new LinkedList(2);
//        myLinkedlist2.Append(6);
//        myLinkedlist2.printList();
//        //print out 2 item of linkedlist
//        System.out.println(myLinkedlist2.RemoveLast().value);
//        //print put 1 item of linkedlist
//        System.out.println(myLinkedlist2.RemoveLast().value);
//        //print out empty linkedlist
//        System.out.println(myLinkedlist2.RemoveLast());

        LinkedList myLinkedList3 = new LinkedList(2);
        myLinkedList3.Append(3);
        myLinkedList3.Append(4);
        myLinkedList3.Prepend(1);
       // myLinkedList3.RemoveFirst();
       // myLinkedList3.printList();
        System.out.println("index of 1 is:" + myLinkedList3.get(1).value);
        myLinkedList3.Insert(1,10);
       // myLinkedList3.printList();
        myLinkedList3.set(3,7);
        myLinkedList3.printList();
        System.out.println("_________");
        myLinkedList3.Remove(2);
        myLinkedList3.printList();
        System.out.println("_________");
        myLinkedList3.Reverse();
        myLinkedList3.printList();


    }
}
