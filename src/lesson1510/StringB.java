package lesson1510;

import java.util.Arrays;

public class StringB {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder("Hello, World"); //на основании строки
        StringBuilder str3 = new StringBuilder(10); //
// какая длина
//        System.out.println(str1.length());
//        System.out.println(str2.length());
//        System.out.println(str3.length());
// сколько занимает в памяти
//        System.out.println(str1.capacity());
//        System.out.println(str2.capacity());
//        System.out.println(str3.capacity());

        str1.append("World");
        System.out.println(str1);
        System.out.println(str1.capacity());

//        str2.append(", hello!").append(" 1 2 3 4 5 6 7 8 9 0"); // можем сделать цепочку операций
//        System.out.println(str2);
//        System.out.println(str2.capacity());

        str1.insert(0, "Hello, ");
        System.out.println(str1);

        str1.insert(0, "a");
        System.out.println(str1.compareTo(str2)); // сравнение - находит разницу между первыми различными символами (+ или -

        System.out.println(str1);
        str1.delete(0, 1);
        System.out.println(str1);

        System.out.println(str1.indexOf("World"));// возвращает индекс подстроки

//        String s = "asdfgggghjkl";
//        int i = s.indexOf("ggg");
//        System.out.println(i);

        str1.replace(7, str1.length(), "My Dear Cat!");
        System.out.println(str1);
        System.out.println(str1.reverse());
        System.out.println(str1.reverse());

        System.out.println(str1.substring(7));

        StringBuilder[] arr = {str1, str2, str3};

    }
}
