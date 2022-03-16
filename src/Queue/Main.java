package Queue;

public class Main {
    public static void main (String args[]){
        Queue myQueue = new Queue(2);
//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLength();
      myQueue.Enqueue(3);
        myQueue.printQueue();
        System.out.println("-----");
        myQueue.Dequeue();
        myQueue.printQueue();
    }
}
