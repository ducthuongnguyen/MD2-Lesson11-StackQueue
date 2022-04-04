package Ex3;

public class Check {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;
        Solution.enQueue(q,55);
        Solution.enQueue(q,0);
        Solution.enQueue(q,-7);
        Solution.display(q);
        Solution.deQueue(q);
        Solution.deQueue(q);


        Solution.display(q);
    }
}
