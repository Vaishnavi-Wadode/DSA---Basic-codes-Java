import java.util.*;
public class Queue {
    public final int max = 4;
    public int []arr = new int[max];
    public int F=-1;
    public int R=-1;

    public void enqueue(int data){
        if(R == max-1){
            System.out.println("Overflow");
            return;
        }

        R++;
        arr[R]=data;
        System.out.println("Enqueue :"+data);
    }

    public void dequeue(){
        if(F == max-1){
            System.out.println("Underflow");
            return;
        }

        F++;
        int dedata = arr[F];
        System.out.println("Dequeue :"+dedata);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

    }
}
