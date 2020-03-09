package exercise;

import java.util.List;

public class Loops {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "World");

        for (String s : list) {
            System.out.println(s);
        }

        for (int i=0; i<10; i++) {
            System.out.println("i="+ i);
        }
    }
}
