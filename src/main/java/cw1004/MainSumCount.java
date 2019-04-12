package cw1004;

import java.util.ArrayList;
import java.util.Random;

public class MainSumCount {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        MySumCount sumCount1 = new MySumCount();
        MySumCount sumCount2 = new MySumCount();
        sumCount1.setStartIndex(0);
        sumCount1.setStopIndex(500);
        sumCount2.setStartIndex(500);
        sumCount2.setStopIndex(1000);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(random.nextInt(1000));
        }
        sumCount1.setArray(list);
        sumCount2.setArray(list);
        sumCount1.start();
        sumCount1.join();
        sumCount2.start();
        sumCount2.join();
        System.out.println(list);
        System.out.println(sumCount1.resultSum);
        System.out.println(sumCount2.resultSum);
        System.out.println(sumCount1.resultSum+sumCount2.resultSum);
    }
}
