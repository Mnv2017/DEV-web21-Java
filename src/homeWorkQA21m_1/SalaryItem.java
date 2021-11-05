package homeWorkQA21m_1;

public class SalaryItem {
    private String code; // код типа P00x
    private int amount; // зарплата
    private String person; // фамилия

    public SalaryItem(String salaryString) { // заполняет значения кода и з/п
        this.code = salaryString.substring(0, 4);
        this.amount = Integer.parseInt(salaryString.substring(5));
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public int getAmount() {
        return amount;
    }

    public String getPerson() {
        return person;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "SalaryItem{ " +
                code + ": " +
                person + " - " +
                amount +
                '}';
    }
}
