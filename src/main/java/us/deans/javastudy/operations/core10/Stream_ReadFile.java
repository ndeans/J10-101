package us.deans.javastudy.operations.core10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import us.deans.javastudy.base.BaseOperation;

public class Stream_ReadFile extends BaseOperation {

    @Override
    public void start() {

        Path path = Paths.get("./Stream_ReadFile.java");

        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

