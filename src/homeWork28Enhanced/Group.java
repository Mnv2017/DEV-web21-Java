package homeWork28Enhanced;

public class Group {
    private String name; // название группы
    private Kurs kurs;   // какой курс изучает
    private int pMax;   // максимальное количество учеников
    private int pInd; // номер очередного ученика
    private Pupil[] pupils;  // список учеников
    private int tMax = 5; // максимальное количество преподавателей
    private int tInd; // номер очередного преподавателя
    private Teacher[] teachers; // преподаватели

    public Group() {
    }

    public Group(String name, int pMax) {
        this.name = name;
        this.pMax = pMax;
        this.pupils = new Pupil[pMax];
        this.pInd = 0;
        this.teachers = new Teacher[this.tMax];
        this.tInd = 0;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }

    public void addPupil(Pupil p) {
        // добавляет ученика № pI в группу
        if (pInd < pMax) {
            pupils[pInd] = p;
            p.setGroup(this);
            pInd++;
        } else {
            System.out.println("Группа " + name + " набрана и не может принять нового ученика " + (pMax + 1) + "!");
        }
    }

    public void addTeacher(Teacher t) {
        // добавляет учителя № tInd в группу
        if (tInd < tMax) {
            teachers[tInd] = t;
            t.setGroup(this);
            tInd++;
        } else {
            System.out.println("Курс не могут преподавать более " + tMax + " учителей.");
        }
    }
    public void printGroupReport() {
        System.out.println(this.toString());
        printTeachersOfGroup();
        printPupilsOfGroup();
    }

    private void printPupilsOfGroup() {
        // выводит списoк учеников группы
        System.out.println("------  Pupils of group " + name + ":  ------");
        for (int i = 0; i < pInd; i++) {
            System.out.println((i + 1) + " " + pupils[i].toString());
        }
        System.out.println();
    }

    private void printTeachersOfGroup() {
        // выводит список учителей группы
        System.out.println("------  Teachers of group " + name + ":  ------");
        for (int i = 0; i < tInd; i++) {
            System.out.println((i + 1) + " " + teachers[i].toString());
        }
        System.out.println();
    }

    public String toString() {
        // выводит основные данные группы
        return "\t\tGroup: \n" + "\t\t\tname: " + name + "\n" +
                "\t\t\tkurs: " + kurs.getName()+"\n";
    }
}
