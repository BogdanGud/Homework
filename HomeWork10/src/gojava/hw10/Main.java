package gojava.hw10;


import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        Encoder encoder = new Encoder(3);

        Writer writer = new Writer(encoder.encode("this is a secret message."));
        writer.writeData();

        Reader reader = new Reader("1.txt");
        try {
            System.out.println(encoder.decode(reader.readData()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
