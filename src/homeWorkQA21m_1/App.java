package homeWorkQA21m_1;

public class App {
    public static void main(String[] args) {

        String[] arraySalary = {"P001 10000", "P002 8000", "P003 12000", "P004 15000"};
        String[] arrayPersonal = {"P002 Ivanov", "P001 Petrov", "P004 Sidorov", "P003 Fedorov"};

        SalaryList list = new SalaryList();
        list.initSalaries(arraySalary, arrayPersonal);
        list.printReport();
        /*
        Посчитать:
        1. Общая заработная плата
        2. Средняя заработная плата
        3. Максимальная заработная плата (Ivanov - 10350)
         */
    }

}
