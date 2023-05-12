package OverloadingPractice;

public class CounterMain {
    public static void main(String[] args) {

        Counter counter1 = new Counter(5);
        System.out.println("Counter 1: " + counter1.value());
        counter1.increase();
        System.out.println("Counter 1: " + counter1.value());
        counter1.decrease();
        System.out.println("Counter 1: " + counter1.value());
        counter1.increase(2);
        System.out.println("Counter 1: " + counter1.value());
        counter1.decrease(3);
        System.out.println("Counter 1: " + counter1.value());

        Counter counter2 = new Counter();
        System.out.println("Counter 2: " + counter2.value());
        counter2.increase(3);
        System.out.println("Counter 2: " + counter2.value());
        counter2.decrease(2);
        System.out.println("Counter 2: " + counter2.value());
        counter2.increase(5);
        System.out.println("Counter 2: " + counter2.value());
        counter2.decrease(7);
        System.out.println("Counter 2: " + counter2.value());

    }
}
