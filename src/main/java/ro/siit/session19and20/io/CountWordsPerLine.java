package ro.siit.session19and20.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountWordsPerLine {
    public static void main(String[] args) throws IOException {
        String source = "poems" + File.separator + "poem.txt";
        String destination = "poems" + File.separator + "poem_count.txt";
        List<String> lines = Files.readAllLines(Paths.get(source));
        List<String> countedLines = new ArrayList<>();
        for (String line: lines) {
            countedLines.add(line + ":" + wordCount(line));
        }
        Files.write(Paths.get(destination), countedLines);
    }

    public static int wordCount(String line){
        String[] splittedLine = line.split(" ");
        return splittedLine.length;
    }
}
