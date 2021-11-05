package lesson0110;

import java.util.ArrayList;
import java.util.HashSet;

public class SalaryApp {

    public static void main(String[] args) {
        HashSet<Person> persons = new HashSet<>();
        ArrayList<Person> population = new ArrayList<>();

        Person p1 = new Person("Ivanov", 24,200);
        Person p2 = new Person("Petrov", 23,150);
        Person p3 = new Person("Sidorov", 20,300);
        Person p5 = new Person("Sidorov", 10,100);
        Person p4 = new Person("Abramovich", 10,500);

        population.add(p1);
        population.add(p2);
        population.add(p3);
        population.add(p4);
        population.add(p5);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p5);

        for (Person p :population) {
            System.out.println(p.hashCode());
            if (persons.contains(p))
                System.out.println(p.getName()+ ", получите "+p.getSalary());
            else System.out.println(p.getName()+ ", вас не числится!");
        }

        System.out.println("u");
    }
}
