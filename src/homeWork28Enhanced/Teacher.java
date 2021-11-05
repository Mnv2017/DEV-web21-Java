package homeWork28Enhanced;

public class Teacher {
    private String name;
    private String subject;
    private Group group;

    public Teacher() {
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(Group group) {
        this.group = group;
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

    public Group getGroup() {
        return group;
    }

    public String toString() {
        // вывод данных об учителе без указания группы
        return "Teacher: \n" + "\tname: " + this.name + "\n" +
                "\tsubject: " + this.subject;
    }
}
