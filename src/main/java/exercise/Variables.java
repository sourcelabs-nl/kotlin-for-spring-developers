package exercise;

import java.util.*;

public class Variables {

    public static void main(String[] args) {
        String mutableString = "string1";
        mutableString = "mutated";
        final String immutableString = "string2";
        List<String> mutableList = Collections.unmodifiableList(new ArrayList<String>());
        List<String> immutableList = new ArrayList<>();
    }
}
