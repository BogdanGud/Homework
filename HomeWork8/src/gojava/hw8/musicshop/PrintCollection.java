package gojava.hw8.musicshop;


import java.util.Collection;

public class PrintCollection {

    public  void toPrint(Collection collection) {
        for (Object obj : collection) {
            System.out.println(obj);
        }
    }
}
