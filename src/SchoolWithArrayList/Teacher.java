package SchoolWithArrayList;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private String subject;
    private ArrayList<Group> groups; // группы, в которых учитель преподает

    public Teacher() {
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
        this.groups = new ArrayList<Group>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void addGroup(Group g) {
        // учитель добавляет группу в свой список
        groups.add(g);
    }

    public void removeGroup(Group group) {
        // учитель удаляет группу из своего списка
        int i = groups.indexOf(group);
//        System.out.println("****  Учитель " + this.name + " удаляет группу " + groups.get(i).getName());
        groups.remove(i);
    }

    public String toString() {
        // вывод данных об учителе без указания группы
        return "Teacher: \n" + "\tname: " + this.name + "\n" +
                "\tsubject: " + this.subject;
    }
}
