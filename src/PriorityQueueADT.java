import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueADT {
    public static void main(String[] args) {
        Queue<Double> queue = new LinkedList<>();

        queue.offer(3.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.5);
        queue.offer(2.0);

        System.out.println("LinkedList - Queue");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        Queue<Double> queue1 = new PriorityQueue<>();

        queue1.offer(3.5);
        queue1.offer(4.0);
        queue1.offer(1.5);
        queue1.offer(2.5);
        queue1.offer(2.0);

        System.out.println("\nPriority Queue - Queue");
        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }

        Queue<Double> queue2 = new PriorityQueue<>(Collections.reverseOrder());

        queue2.offer(3.5);
        queue2.offer(4.0);
        queue2.offer(1.5);
        queue2.offer(2.5);
        queue2.offer(2.0);

        System.out.println("\nPriority Queue in reverse order");
        while (!queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }

        Queue<String> queue3 = new PriorityQueue<>();

        queue3.offer("B");
        queue3.offer("D");
        queue3.offer("A");
        queue3.offer("C");
        queue3.offer("F");

        System.out.println("\nPriority Queue - String");
        while (!queue3.isEmpty()) {
            System.out.println(queue3.poll());
        }

        Queue<String> queue4 = new PriorityQueue<>(Collections.reverseOrder());

        queue4.offer("B");
        queue4.offer("D");
        queue4.offer("A");
        queue4.offer("C");
        queue4.offer("F");

        System.out.println("\nPriority Queue - Reverse order - String");
        while (!queue4.isEmpty()) {
            System.out.println(queue4.poll());
        }
    }
}
