package multiThreading;

public class Producer implements Runnable {

    private SharedResource sharedResource;

    Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        System.out.println("Producer thread: " + Thread.currentThread().getName() + " is running");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
        sharedResource.add();
    }
}
