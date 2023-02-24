public class MultithreadAppBlank {

    Thread thread1;
    Thread thread2;

    public MultithreadAppBlank() {
        thread1 = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("Thread #1 is running");
            }
        });

        // Task 1

    }

    public void startThreads() {
        thread1.start();
        // Task 2

    }
}
