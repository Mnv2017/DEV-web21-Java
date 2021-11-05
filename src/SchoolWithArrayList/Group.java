package SchoolWithArrayList;

import java.util.ArrayList;

public class Group {
    private String name; // название группы
    private Kurs kurs;   // какой курс изучает
    private ArrayList<Pupil> pupils; // список учеников
    private ArrayList<Teacher> teachers; // преподаватели

    public Group() {
    }

    public Group(String name, int pMax) {
        this.name = name;
        this.pupils = new ArrayList<Pupil>();
        this.teachers = new ArrayList<Teacher>();
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }

    public String getName() {
        return name;
    }

    public void addPupil(Pupil p) {
        // добавляет ученика в группу
//        System.out.println("****  Добавляю ученика " + p.getName() + " в группу " + this.name);
        pupils.add(p);
        // ученику устанавливает ссылку на эту группу
        p.setGroup(this);
    }

    public void removePupil(Pupil p) {
        // удаляет ученика из группы
//        System.out.println("****  Удаляю ученика " + p.getName() + " из группы " + this.name);
        int i = pupils.indexOf(p);
        pupils.remove(i);
        // ссылка на группу удаляется у ученика
        p.setGroupNull();
    }

    public void addTeacher(Teacher t) {
        // добавляет учителя в группу
//        System.out.println("****  Добавляю учителя "+t.getName()+" в группу "+this.name);
        teachers.add(t);
        // группа добавляется в список групп учителя
        t.addGroup(this);
    }

    public void removeTeacher(Teacher teacher) {
        // удаляет учителя из группы
//        System.out.println("****  Удаляет учителя "+teacher.getName()+" из группы "+this.name);
        int i = teachers.indexOf(teacher);
        teachers.remove(i);
        // группа удаляется из списка групп учителя
        teacher.removeGroup(this);
    }

    public void printGroupReport() {
        System.out.println(this.toString());
        printTeachersOfGroup();
        printPupilsOfGroup();
    }

    public void printPupilsOfGroup() {
        // выводит списoк учеников группы
        System.out.println("------  Ученики группы " + name + ":  ------");
        for (int i = 0; i < pupils.size(); i++) {
            System.out.println((i + 1) + " " + pupils.get(i).toString());
        }
        System.out.println();
    }

    public void printTeachersOfGroup() {
        // выводит список учителей группы
        System.out.println("------  Учителя группы " + name + ":  ------");
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println((i + 1) + " " + teachers.get(i).toString());
        }
        System.out.println();
    }

    public String toString() {
        // выводит основные данные группы
        return "\t\tGroup: \n" + "\t\t\tname: " + name + "\n" +
                "\t\t\tkurs: " + kurs.getName() + "\n";
    }
}
