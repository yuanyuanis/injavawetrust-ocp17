package chapter14.operatingonfileandpath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesCopyDeep {

    public static void main(String[] args) {

        Path source = Paths.get("extras/chapter14/deep-copy-src");
        Path target = Paths.get("extras/chapter14/deep-copy-tgt");

        copyPath(source, target);
    }

    public static void copyPath(Path source, Path target) {
        try {
            Files.copy(source, target);
            if (Files.isDirectory(source))
                try (Stream<Path> s = Files.list(source)) {
                    s.forEach(p -> copyPath(p,
                            target.resolve(p.getFileName())));
                }
        } catch (IOException e) { // Handle exception
            System.out.println(e);
        }
    }

}
