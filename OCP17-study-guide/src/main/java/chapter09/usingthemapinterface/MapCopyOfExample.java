package chapter09.usingthemapinterface;

import java.util.Map;

public class MapCopyOfExample {

    public static void main(String[] args) {

        Map<String, String> map1 = Map.of("key1", "value1", "key2", "value2");
        Map<String, String> copiedMap = Map.copyOf(map1);

        System.out.println(map1);
        System.out.println(copiedMap);
    }
}
