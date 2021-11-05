package homeWork28Enhanced;

public class School {
    private String name; // название школы
    private String place; // город
    private Kurs[] kurses; // список курсов обучения
    private int kMax; // максимальное количество курсов
    private int kInd; // номер очередного курса

    public School() {
    }

    public School(String name, String place, int kMax) {
        this.name = name;
        this.place = place;
        this.kurses = new Kurs[kMax];
        this.kMax = kMax;
        this.kInd = 0;
    }

    public void addKurs(Kurs k) {
        // добавляет курс к школе
        if (kInd < kMax) {
            kurses[kInd] = k;
            k.setSchool(this);
            kInd++;
        } else {
            System.out.println("Количество курсов школы ограничено значением " + kMax + ".");
        }
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

    public void printSchoolReport() {
        System.out.println(this.toString());
        System.out.println("======================================");
        for (int i = 0; i < kInd; i++) {
            System.out.print((i + 1) + " ");
            kurses[i].printKursReport();
            System.out.println("======================================");
        }
    }

    public String toString() {
        // выводит данные школы
        return "School: \n" + "\tname: " + name + "\n" +
                "\tplace: " + place;
    }
}
