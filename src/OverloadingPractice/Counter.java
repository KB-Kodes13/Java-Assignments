package OverloadingPractice;

public class Counter {

    private int value;

    public Counter(int startValue) {
        value = startValue;
    }

    public Counter() {
        value = 0;
    }
    public int value() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;
    }
    public void increase(int changeBy) {
        if (changeBy > 0) {
            value += changeBy;
        }
    }

    public void decrease(int changeBy) {
        if (changeBy > 0) {
            value -= changeBy;
        }
    }
}
