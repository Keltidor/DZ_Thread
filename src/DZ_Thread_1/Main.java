package DZ_Thread_1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainGroup = new ThreadGroup("Main Group");

        Thread myThread1 = new MyThreads(mainGroup, "Поток 1");
        Thread myThread2 = new MyThreads(mainGroup, "Поток 2");
        Thread myThread3 = new MyThreads(mainGroup, "Поток 3");
        Thread myThread4 = new MyThreads(mainGroup, "Поток 4");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        Thread.sleep(10000);
        mainGroup.interrupt();
    }
}
