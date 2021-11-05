package SchoolWithArrayList;

public class Pupil {
    private String name;  // имя
    private String city;  // город
    private Group group;  // учится в (одной) группе

    public Pupil() {
    }

    public Pupil(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setGroupNull() {
        this.group = null;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Group getGroup() {
        return group;
    }

    public String toString() {
        // вывод данные об ученике без указания группы
        return "Pupil: \n" + "\tname: " + name + "\n" +
                "\tcity: " + city;
    }

}
