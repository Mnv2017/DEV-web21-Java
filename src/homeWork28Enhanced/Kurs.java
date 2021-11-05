package homeWork28Enhanced;

public class Kurs {
    private String name; // название
    private int duration; // длительность
    private String startDate; //  дата старта
    private boolean online; // обучение в онлайн да/нет
    private School school; // название школы
    private Group[] groups; // группы, изучающие данный курс
    private int gMax = 2; // максимум две группы: утренняя и вечерняя
    private int gInd;

    public Kurs() {
    }

    public Kurs(String name, int duration, String startDate) {
        this.name = name;
        this.duration = duration;
        this.startDate = startDate;
        this.online = true;
        this.groups = new Group[this.gMax];
        this.gInd = 0;
    }

    public String getName() {
        return name;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void addGroup(Group g) {
        // добавляет группу к курсу
        if (gInd < gMax) {
            groups[gInd] = g;
            g.setKurs(this);
            gInd++;
        } else {
            System.out.println("На одном курсе не может быть более " + gMax + " групп.");
        }
    }

    public void printKursReport() {
        System.out.println(this.toString());
        for (int i = 0; i < gInd; i++) {
            System.out.println("-------------------------------------");
            System.out.print((i + 1));
            groups[i].printGroupReport();
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
