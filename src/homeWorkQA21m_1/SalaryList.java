package homeWorkQA21m_1;

import java.util.ArrayList;

public class SalaryList {
    private ArrayList<SalaryItem> salaries;

    public SalaryList() {
        this.salaries = new ArrayList<>();
    }

    public void initSalaries(String[] arrS, String[] arrP) {
        for (int i = 0; i < arrS.length; i++) {
            SalaryItem sI = new SalaryItem(arrS[i]); // заполняем код и з/п
            sI.setPerson(findPerson(arrP, sI.getCode())); // находим и заполняем фамилию
            salaries.add(sI);
        }
    }

    private String findPerson(String[] arrP, String code) { // возвращает фамилию по значению кода из массива №2
        for (int i = 0; i < arrP.length; i++) {
            String c = arrP[i].substring(0, 4);
            if (c.equalsIgnoreCase(code)) {
                return arrP[i].substring(5);
            }
        }
        return "";
    }

    private int sumSalary() { // возвращает общую сумму з/п в списке
        int sum = 0;
        for (int i = 0; i < salaries.size(); i++) {
            sum += salaries.get(i).getAmount();
        }
        return sum;
    }

    private double averageSalary() {
        return sumSalary() * 1.0 / salaries.size(); //возвращает среднее значение з/п в списке
    }

    private int indMaxSalary() { //возвращает индекс элемента с максимальным значением з/п в списке
        int ind = 0;
        int max = salaries.get(0).getAmount();
        for (int i = 1; i < salaries.size(); i++) {
            if (salaries.get(i).getAmount() > max) {
                max = salaries.get(i).getAmount();
                ind = i;
            }
        }
        return ind;
    }

    public void printSalaryList() {
        for (int i = 0; i < salaries.size(); i++) {
            System.out.println(salaries.get(i).toString());
        }
    }

    public void printReport() {
        System.out.println("**** Расчеты по списку зарплат сотрудников ****");
        printSalaryList();
        System.out.println("--------------------------------------------------------");
        System.out.println("**** Общая сумма з/п в списке: " + sumSalary());
        System.out.printf("**** Среднее значение з/п в списке: %.2f ", averageSalary());
        System.out.println();
        SalaryItem sMax = salaries.get(indMaxSalary());
        System.out.println("**** Максимальная з/п в списке: " + sMax.getPerson() + " - " + sMax.getAmount());
        System.out.println("--------------------------------------------------------");
    }
}
