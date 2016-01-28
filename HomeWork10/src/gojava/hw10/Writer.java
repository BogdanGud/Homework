package gojava.hw10;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static String data;

    public Writer(String data) {
        this.data = data;
    }


    public static void writeData() {

        File file = new File("1.txt");
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}