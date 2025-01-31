package chapter14.operatingonfileandpath;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathGetNameAndGetNameCount {

    public static void main(String[] args) {

        Path path = Paths.get("/land/hippo/harry.happy");
        System.out.println("The Path Name is: " + path);
        for (int i = 0; i < path.getNameCount(); i++)
            System.out.println(" Element " + i + " is: " + path.getName(i));

    }
}
