package chapter10.usingstreams;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamReducingExample {

    public static void main(String[] args) {

        reduceMethod1();

        reduceMethod2();

        reduceMethod3();

        reduceMethod4();

        reduceMethod5();

        reduceMethod6();
    }

    private static void reduceMethod1() {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s + c);
        System.out.println(word); // wolf
    }

    private static void reduceMethod2() {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", String::concat);
        System.out.println(word); // wolf
    }

    private static void reduceMethod3() {
        Stream<Integer> stream = Stream.of(3, 5, 6);
        System.out.println(stream.reduce(1, (a, b) -> a * b)); // 90
    }

    private static void reduceMethod4() {
        Stream<Integer> stream = Stream.of(3, 5, 6);
        System.out.println(stream.reduce((a, b) -> a * b)); // Optional[90]
    }

    private static void reduceMethod5() {
        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);

        empty.reduce(op).ifPresent(System.out::println);            // no output
        oneElement.reduce(op).ifPresent(System.out::println);       // 3
        threeElements.reduce(op).ifPresent(System.out::println);    // 90
    }

    private static void reduceMethod6() {
        Stream<String> stream = Stream.of("w", "o", "l", "f!");
        int length = stream.reduce(0, (i, s) -> i + s.length(), (a, b) -> a + b);
        System.out.println(length); // 5
    }
}
