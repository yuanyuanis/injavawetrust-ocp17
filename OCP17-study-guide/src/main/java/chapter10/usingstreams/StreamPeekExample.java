package chapter10.usingstreams;

import java.util.stream.Stream;

public class StreamPeekExample {

    public static void main(String[] args) {

        var stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(s -> s.startsWith("g"))
                .peek(System.out::println).count(); // grizzly
        System.out.println(count); // 1
    }
}
