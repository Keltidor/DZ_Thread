package DZ_Thread_1;

public class MyThreads extends Thread {

    public MyThreads(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                String threadName = Thread.currentThread().getName();
                Thread.sleep(3000);
                System.out.println("Всем привет! Я " + threadName);
            }
        } catch (InterruptedException e) {
            System.out.println("Поток в данный момент не активен");
        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
