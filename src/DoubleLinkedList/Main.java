package DoubleLinkedList;

public class Main {
    public static void main(String args[]){
        DoublyLinkedList myDDL = new DoublyLinkedList(7);
        myDDL.getHead();
        myDDL.getTail();
        myDDL.getLength();
        myDDL.append(67);
        myDDL.append(77);
        myDDL.prepend(12);
        myDDL.printList();
        System.out.println("-----");
        myDDL.RemoveFirst();
        myDDL.printList();
        myDDL.get(2);

    }
}
