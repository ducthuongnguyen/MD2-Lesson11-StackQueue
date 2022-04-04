package Ex3;

public  class Solution {
    static void enQueue(Queue queue, int value) {
        Node node = new Node();
        node.data = value;
        if (queue.front == null) {
            queue.front = node;
        } else {
            queue.rear.link = node;

        }
        queue.rear = node;
        queue.rear.link = queue.front;
    }

    static int deQueue(Queue queue) {
        if (queue.front == null) {
            System.out.println("The queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (queue.front == queue.rear) {
            value = queue.front.data;
            queue.front = null;
            queue.rear = null;
        } else {
            Node temp = queue.front;
            value = temp.data;
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }
        return  value;
    }


    static  void display(Queue q) {
        Node node = q.front;
        System.out.println();
        System.out.println("Elements in Circular Queue are: ");
        while (node.link != q.front) {
            System.out.print(node.data +" ");
            node = node.link;
        }
        System.out.printf("%d", node.data);

    }
}
