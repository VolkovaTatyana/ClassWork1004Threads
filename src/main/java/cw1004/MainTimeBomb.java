package cw1004;

public class MainTimeBomb {
    public static void main(String[] args) throws InterruptedException {
        TimeBomb bomb = new TimeBomb();
        bomb.start();
        bomb.join();
        System.out.println("BOOM!!!");
    }
}
