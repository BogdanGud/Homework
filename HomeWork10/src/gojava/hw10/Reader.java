package gojava.hw10;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Reader {
    public static String fileName;
    private static String readData;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public static String readData() throws IOException {
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        while (scanner.hasNextLine()) {
            readData = scanner.nextLine();
        }
        return readData;
    }
}
