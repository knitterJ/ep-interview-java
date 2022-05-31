public class MultithreadAppBlank {

    Thread thread1;
    Thread thread2;

    public MultithreadApp() {
        thread1 = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("Thread #1 is running");
            }
        });

        thread2 = new Thread( () -> { System.out.println("Thread #2 is running");} );
    }

    public void startThreads() {
        new Thread(thread1).start();
        new Thread(thread2).start();
    }
}
