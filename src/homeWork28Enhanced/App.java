package homeWork28Enhanced;

public class App {
    public static void main(String[] args) {

        School s1 = new School("Tel-Ran", "Berlin", 3);
        
        Kurs k1 = new Kurs("Web development and testing", 6, "26.07.21");
        Kurs k2 = new Kurs("QA manual and automation ", 9, "21.09.21");

        Group g1 = new Group("web21m", 15);
        Group g2 = new Group("web21e", 10);
        Group g3 = new Group("QA22m", 7);

        Teacher t1 = new Teacher("Ignatiy", "Basis OOP");
        Teacher t2 = new Teacher("Andrey", "Programming");
        Teacher t3 = new Teacher("Irina", "Software testing");

        Pupil p1 = new Pupil("Natalia", "Düsseldorf");
        Pupil p2 = new Pupil("Irina", "Frankfurt");
        Pupil p3 = new Pupil("Dmitry", "München");
        Pupil p4 = new Pupil("Katja", "Moscow");
        Pupil p5 = new Pupil("Vladimir", "Berlin");

        // школа открывает курсы
        s1.addKurs(k1);
        s1.addKurs(k2);
        // набирает группы для курса
        s1.linkGroupToKurs(g1, k1);
        s1.linkGroupToKurs(g2, k1);
        s1.linkGroupToKurs(g3, k2);
        // назначает учителей группам
        s1.linkTeacherToGroup(t1, g1);
        s1.linkTeacherToGroup(t1, g2);
        s1.linkTeacherToGroup(t2, g1);
        s1.linkTeacherToGroup(t3, g3);
        // набирает в группы учеников
        s1.linkPupilToGroup(p1, g1);
        s1.linkPupilToGroup(p2, g1);
        s1.linkPupilToGroup(p5, g2);
        s1.linkPupilToGroup(p3, g3);
        s1.linkPupilToGroup(p4, g3);
        // общий отчет
        s1.printSchoolReport();

    }
}
