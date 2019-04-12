package cw1004;

import java.util.concurrent.TimeUnit;

public class TimeBomb extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(10-i);
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
