package multiThreading;

import java.util.ArrayList;
import java.util.List;

public class SharedResource {
    private List<Integer> resource;

    private int limit;

    private static final int ELEMENT = -1;

    SharedResource(int limit) {
        this.limit = limit;
        this.resource = new ArrayList<>();
    }

    public synchronized void add() {

        while (resource.size() >= limit) {
            try {
                System.out.println("Cannot add resource, currently on thread: " + Thread.currentThread().getName());
                wait();
            } catch (Exception e) {

            }
        }

        System.out.println("Adding resource, currently on thread: " + Thread.currentThread().getName());
        resource.add(ELEMENT);
        notifyAll();
    }

    public synchronized void consume() {

        while (resource.size() == 0) {
            try {
                System.out.println("Cannot consume resource, currently on thread: " + Thread.currentThread().getName());
                wait();
            } catch (Exception e) {

            }
        }

        System.out.println("Consuming resource,currently on thread: " + Thread.currentThread().getName());
        resource.removeLast();
    }
}
