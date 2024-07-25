public class Main {
    public static void main(String[] args) {
        // Creating counter with start value of 10
        Counter counter1 = new Counter(10);
        System.out.println("Initial value of counter1: " + counter1.value());

        counter1.increase();
        System.out.println("Counter1 after increasing by 1: " + counter1.value());

        counter1.decrease();
        System.out.println("Counter1 after decreasing by 1: " + counter1.value());

        counter1.increase(5);
        System.out.println("Counter1 after increasing by 5: " + counter1.value());

        counter1.increase(-3);
        System.out.println("Counter1 after trying to increase by -3: " + counter1.value());

        counter1.decrease(2);
        System.out.println("Counter1 after decreasing by 2: " + counter1.value());

        counter1.decrease(-4);
        System.out.println("Counter1 after trying to decrease by -4: " + counter1.value());

        Counter counter2 = new Counter();
        System.out.println("Initial value of counter2: " + counter2.value());

        counter2.increase();
        System.out.println("Counter2 after increasing by 1: " + counter2.value());

        counter2.decrease();
        System.out.println("Counter2 after decreasing by 1: " + counter2.value());

        counter2.increase(10);
        System.out.println("Counter2 after increasing by 10: " + counter2.value());

        counter2.decrease(5);
        System.out.println("Counter2 after decreasing by 5: " + counter2.value());
    }

}
