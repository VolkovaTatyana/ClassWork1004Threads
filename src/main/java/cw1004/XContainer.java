package cw1004;

public class XContainer {
    private Object object = new Object();
    private volatile int x = 0;

    void increment(){
        synchronized (object){
            x++;
        }
    }

    public int getX() {
        return x;
    }
}
