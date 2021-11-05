package SchoolWithArrayList;

import java.util.ArrayList;

public class School {
    private String name; // название школы
    private String place; // город
    private ArrayList<Kurs> kurses; // список курсов обучения

    public School() {
    }

    public School(String name, String place, int kMax) {
        this.name = name;
        this.place = place;
        this.kurses = new ArrayList<Kurs>();
    }

    public void addKurs(Kurs k) {
        // добавляет курс к школе
        kurses.add(k);
        k.setSchool(this);

    }

    public void linkGroupToKurs(Group g, Kurs k) {
        // добавляет группу к курсу
        k.addGroup(g);
    }

    public void linkTeacherToGroup(Teacher t, Group g) {
        // добавляет учителя к группе
        g.addTeacher(t);
    }

    public void linkPupilToGroup(Pupil p, Group g) {
        // добавляет ученика к группе
        g.addPupil(p);
    }

    public void transferPupilInGroup(Pupil p, Group g) {
        // перевод ученика в указанную группу
        p.getGroup().removePupil(p); // удаляет из старой группы
        g.addPupil(p); // добавляет в новую группу
    }

    public void transferTeacherInGroup(Teacher t, Group gOld, Group gNew) {
        // перевод учителя из одной группы в другую
        gNew.addTeacher(t); // добавляет в новую группу
        gOld.removeTeacher(t); // удаляет из старой группы
//        t.removeGroup(gOld);
    }

    public void printSchoolReport() {
        System.out.println(this.toString());
        System.out.println("======================================");
        for (int i = 0; i < kurses.size(); i++) {
            System.out.print((i + 1) + " ");
            kurses.get(i).printKursReport();
            System.out.println("======================================");
        }
    }

    public String toString() {
        // выводит данные школы
        return "School: \n" + "\tname: " + name + "\n" +
                "\tplace: " + place;
    }
}
