import java.sql.Time;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by riven_chris on 15/6/25.
 */
public class ExecutorTest {

    public static void main(String[] args) {
        Random random = new Random();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        int waitTime = 500;

        for (int i = 0; i < 10; i++) {
            String name = "线程" + i;
//            int time = random.nextInt(1000);
            int time = 1000;
            waitTime += time;
            Runnable runnable = new ExecutorThread(name, time);
            System.out.println("增加: " + name + " / " + time);
//            executor.execute(runnable);
            Future<?> s = executor.submit(runnable);
        }

        LinkedList list;

        try {
            Thread.sleep(waitTime);
            executor.shutdown();
            executor.awaitTermination(waitTime, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class ExecutorThread implements Runnable {
        private final String name;
        private final int delay;

        public ExecutorThread(String name, int delay) {
            this.name = name;
            this.delay = delay;
        }

        public void run() {
            System.out.println("启动: " + name);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException ignored) {
            }
            System.out.println("完成: " + name);
        }
    }
}
