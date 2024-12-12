package Map.HW47_48;


import Map.HW47_48.Priority.Task;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Task> tasks = new PriorityQueue<>();
        tasks.offer(new Task("New task 1", 3, "Feature"));
        tasks.offer(new Task("New task 2", 3, "Documentation"));
        tasks.offer(new Task("Important task", 1, "Bug"));
        tasks.offer(new Task("Rewrite", 1, "Documentation"));
        tasks.offer(new Task("Delete task 1", 2, "Bug"));
        tasks.offer(new Task("Delete task 2", 4, "Bug"));

        System.out.println(tasks.poll());
        System.out.println(tasks.poll());
        System.out.println(tasks.poll());
        System.out.println(tasks.poll());
        System.out.println(tasks.poll());
        System.out.println(tasks.poll());
    }
}
