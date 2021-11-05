package SchoolWithArrayList;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        School s1 = new School("Tel-Ran", "Берлин", 3);

        LocalDate d1 = LocalDate.of(2021, 7, 26);
        LocalDate d2 = LocalDate.of(2021, 9, 21);
        Kurs k1 = new Kurs("Web development and testing", 6, d1);
        Kurs k2 = new Kurs("QA manual and automation ", 9, d2);

        Group g1 = new Group("web21m утренняя", 15);
        Group g2 = new Group("web21e вечерняя", 10);
        Group g3 = new Group("QA22m утренняя", 7);

        Teacher t1 = new Teacher("Игнатий", "Основы OOP");
        Teacher t2 = new Teacher("Андрей", "Базовый курс");
        Teacher t3 = new Teacher("Ирина", "Автоматизация тестирования ПО");

        Pupil p1 = new Pupil("Наталья", "Дюссельдорф");
        Pupil p2 = new Pupil("Ирина", "Франкфурт");
        Pupil p3 = new Pupil("Дмитрий", "Мюнхен");
        Pupil p4 = new Pupil("Катя", "Москва");
        Pupil p5 = new Pupil("Владимир", "Берлин");
        Pupil p6 = new Pupil("Сергей", "Берлин");

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
        s1.linkPupilToGroup(p6, g2);
        // общий отчет
//        s1.printSchoolReport();
        // перевод ученика в другую группу

        g1.printPupilsOfGroup();
        g2.printPupilsOfGroup();
        System.out.println("======== Перевод ученика " + p6.getName() + " в другую группу ===========");
        s1.transferPupilInGroup(p6, g1);
        g1.printPupilsOfGroup();
        g2.printPupilsOfGroup();
        System.out.println();

        g1.printTeachersOfGroup();
        g2.printTeachersOfGroup();
        s1.transferTeacherInGroup(t2, g1, g2);
        System.out.println("==========  Перевод учителя " + t2.getName() + " из группы " + g1.getName() + " в группу " + g2.getName() + " == =========");
        g1.printTeachersOfGroup();
        g2.printTeachersOfGroup();
    }
}
