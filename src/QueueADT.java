import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue is First In First Out data structure
 * offer()
 * poll()
 * peek()
 * 
 * Collection methods
 * size()
 * contains()
 * isEmpty()
 */

public class QueueADT {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        System.out.println(queue.isEmpty());

        queue.offer("Alex");
        queue.offer("Bob");
        queue.offer("Carry");
        queue.offer("David");

        System.out.println("Before polling: " + queue);

        queue.poll();

        System.out.println("After polling: " + queue);

        System.out.println("Head element: " + queue.peek());

        System.out.println("Size of the queue: " + queue.size());

        System.out.println("Is Bob in the queue? " + (queue.contains("Bob") ? "Yes" : "No"));
    }
}
