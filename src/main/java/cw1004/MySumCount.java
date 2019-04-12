package cw1004;

import java.util.ArrayList;

public class MySumCount extends Thread {

    int startIndex;
    int stopIndex;
    ArrayList<Integer> array;
    long resultSum;

    @Override
    public void run() {
        for (int i = startIndex; i < stopIndex ; i++) {
            resultSum += array.get(i);
        }
    }

    public void setArray(ArrayList<Integer> array) {
        this.array = array;
    }

    public long getResultSum() {
        return resultSum;
    }

    public ArrayList<Integer> getArray() {
        return array;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }
}
