package lesson0110;

import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        System.out.println(strings.size());
        strings.add("Hello");
        strings.add(" world");
        strings.add("!");
        System.out.println(strings.size());
        System.out.println(strings);

        strings.remove("*");
        System.out.println(strings.size());
        System.out.println(strings);
        System.out.println(strings.contains("!"));
//        strings.clear();
        System.out.println(strings.isEmpty());
        printSet(strings);
        System.out.println("=============");
        strings.add("Hello");
        printSet(strings);

    }

    public static void printSet(HashSet<String> set){
        for (String s : set) {
            System.out.println(s);
        }
    }

}
