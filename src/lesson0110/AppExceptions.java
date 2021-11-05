package lesson0110;

import java.util.ArrayList;

public class AppExceptions {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        ArrayList<String> strs = new ArrayList<>();
        strs.add("Hello 1");
        strs.add(0, "Hello 0");

        try {
            System.out.println(numbers[2]);
            for (int i = 0; i < strs.size(); i++) {
                System.out.println(strs.get(i));
            }
            strs.add(10, "Hello 10");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("working always");
        }
        System.out.println("Hello world");
        System.out.println();

    }

}
