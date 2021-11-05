package SchoolWithArrayList;

import java.time.LocalDate;
import java.util.ArrayList;

public class Kurs {
    private String name; // название
    private int duration; // длительность
    private LocalDate startDate; //  дата старта
    private boolean online; // обучение в онлайн да/нет
    private School school; // название школы
    private ArrayList<Group> groups;

    public Kurs() {
    }

    public Kurs(String name, int duration, LocalDate startDate) {
        this.name = name;
        this.duration = duration;
        this.startDate = startDate;
        this.online = true;
        this.groups = new ArrayList<Group>();
    }

    public String getName() {
        return name;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void addGroup(Group g) {
        // добавляет группу к курсу
        groups.add(g);
        g.setKurs(this);
    }

    public void printKursReport() {
        System.out.println(this.toString());
        for (int i = 0; i < groups.size(); i++) {
            System.out.println("-------------------------------------");
            System.out.print((i + 1));
            groups.get(i).printGroupReport();
        }
    }

    public String toString() {
        // выводит основные данные курса
        return "\tKurs: \n" + "\t\tname: " + name + "\n" +
                "\t\tduration: " + duration + " months\n" +
                "\t\tdate: " + startDate + " \n" +
                "\t\tonline: " + online;
    }
}
