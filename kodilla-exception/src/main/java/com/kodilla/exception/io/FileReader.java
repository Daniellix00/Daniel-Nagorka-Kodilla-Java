package com.kodilla.exception.io;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.io.IOException;
public class FileReader {
    public void readFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());
Path path = Paths.get("błąd");
        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Oh no! Something went wrong! Error:" + e);
        }finally {
            System.out.println("I am gonna be here... always!");
        }


    }

    }


