package current;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

Currency curr1 = new Currency("USD 100,43");
Currency curr2 = new Currency("EUR 200");
Currency curr3 = new Currency("CNY 500");
Currency curr4 = new Currency("NIS 5300");
        var elements = new ArrayList<>();
        elements.add("Привет");

        System.out.println(curr1);
        System.out.println(curr2);
        System.out.println(curr3);

        System.out.println(curr1.getInRub());
        System.out.println(curr2.getInRub());
        System.out.println(curr3.getInRub());
        System.out.println(curr4.getInRub());
    }
}
