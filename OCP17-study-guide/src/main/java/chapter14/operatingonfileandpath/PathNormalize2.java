package chapter14.operatingonfileandpath;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathNormalize2 {

    public static void main(String[] args) {

        var p1 = Paths.get("/pony/../weather.txt");
        var p2 = Paths.get("/weather.txt");
        System.out.println(p1.equals(p2)); // false
        System.out.println(p1.normalize().equals(p2.normalize())); // true
    }
}
