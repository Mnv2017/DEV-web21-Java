package lesson1510;

public class Person {
    private String fName;
    private String lName;
    int age;

    public Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public void setInfo(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    public void setInfo(String fName, String lName, int age){
        this.setInfo(fName,lName);
        this.age = age;
    }

    public String getInfo(){
        return this.fName+" "+this.lName;
    }

    public String getInfo(boolean flag){
        if (flag) {
            return this.getInfo()+" ("+this.age+")";
        } else return this.getInfo();
    }
}
