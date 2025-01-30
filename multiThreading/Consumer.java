package multiThreading;

public class Consumer implements Runnable {

    private SharedResource sharedResource;

    Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        System.out.println("Consumer thread: " + Thread.currentThread().getName() + " is running");
        sharedResource.consume();
    }
}
