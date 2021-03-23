package Thread;

import interfaceSegregation.old.Student;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalUsage03 {
    public static ThreadLocal<SimpleDateFormat> threadLocalFormat = new ThreadLocal();


    public static ExecutorService THREAD_POOL = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            int finalI = i;

            THREAD_POOL.submit(new Runnable() {
                @Override
                public void run() {
                    String date = new ThreadLocalUsage03().date(finalI);
                    System.out.println(date);
                }
            });
        }


        // 关闭线程池，此种关闭方式不再接受新的任务提交，等待现有队列中的任务全部执行完毕之后关闭
        THREAD_POOL.shutdown();

    }


    //创建一个ThreadLocal
    static class ThreadLocalProcessor {

        public static ThreadLocal<SimpleDateFormat> simpleDateFormatThreadLocal = new ThreadLocal<SimpleDateFormat>() {
            @Override
            protected SimpleDateFormat initialValue() {
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            }
        };

    }


    private String date(int seconds) {
        Date date = new Date(1000 * seconds);
        return ThreadLocalProcessor.simpleDateFormatThreadLocal.get().format(date);
    }
}
