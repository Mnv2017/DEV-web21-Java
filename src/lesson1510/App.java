package lesson1510;

public class App {
    public static void main(String[] args) {
        Person p1= new Person("Ivan","Ivanov",40);
        System.out.println(p1.getInfo());
        System.out.println(p1.getInfo(true));
    }
}
