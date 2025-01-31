package chapter14.operatingonfileandpath;

import java.nio.file.Path;

public class PathNormalize {

    public static void main(String[] args) {

        var p1 = Path.of("./armadillo/../shells.txt");
        System.out.println(p1.normalize()); // shells.txt

        var p2 = Path.of("/cats/../panther/food");
        System.out.println(p2.normalize()); // /panther/food

        var p3 = Path.of("../../fish.txt");
        System.out.println(p3.normalize()); // ../../fish.txt
    }
}
