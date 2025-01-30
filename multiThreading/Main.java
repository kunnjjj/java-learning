package multiThreading;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(5);

        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        Thread consumerThread = new Thread(consumer);
        consumerThread.start();

        for (int i = 0; i < 7; i++) {
            Thread producerThread = new Thread(producer);
            producerThread.start();
        }

        for (int i = 0; i < 6; i++) {
            Thread consumerThread2 = new Thread(consumer);
            consumerThread2.start();
        }
    }
}
