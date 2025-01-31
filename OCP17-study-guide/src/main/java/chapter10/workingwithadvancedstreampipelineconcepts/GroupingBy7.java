package chapter10.workingwithadvancedstreampipelineconcepts;

import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class GroupingBy7 {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        var map = ohMy.collect(groupingBy(String::length,
                mapping(s -> s.charAt(0), minBy((a, b) -> a - b))));
        System.out.println(map); // {5=Optional[b], 6=Optional[t]}
    }
}
