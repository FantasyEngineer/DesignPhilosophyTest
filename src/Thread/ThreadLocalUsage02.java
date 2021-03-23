package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalUsage02 {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static ExecutorService THREAD_POOL = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            int finalI = i;

            THREAD_POOL.submit(new Runnable() {
                @Override
                public void run() {
                    String date = new ThreadLocalUsage02().date(finalI);
                    System.out.println(date);
                }
            });


        }


        // 关闭线程池，此种关闭方式不再接受新的任务提交，等待现有队列中的任务全部执行完毕之后关闭
        THREAD_POOL.shutdown();

    }


    private String date(int seconds) {
        Date date = new Date(1000 * seconds);
        synchronized (ThreadLocalUsage02.class) {//加锁，保证线程安全，不发生争抢
            return dateFormat.format(date);
        }
    }
}
