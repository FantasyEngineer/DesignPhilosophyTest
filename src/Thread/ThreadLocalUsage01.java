package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalUsage01 {


    //100个线程要new100个SimpleDateFormat ，浪费资源
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                String date = new ThreadLocalUsage01().date(10);

                System.out.println(date);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                String date = new ThreadLocalUsage01().date(100);

                System.out.println(date);
            }
        }).start();


    }


    private String date(int seconds) {
        Date date = new Date(1000 * seconds);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);

    }
}
