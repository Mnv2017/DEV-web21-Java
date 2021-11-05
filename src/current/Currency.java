package current;

public class Currency {
    private String code;
    private double summa;
    private final int[] values = {75, 85, 10, 20};
    private final String[] currensies = {"USD", "EUR", "CNY", "NIS"};// валюты, которые принимаем

    public Currency(String input) {
        this.code = input.substring(0, 3);
        this.summa = Double.parseDouble(input.substring(4).replace(",", "."));
    }

    public String getInRub() {
        int ind = getCurrInd();

//        return ind > -1 ? // через тернарный оператор
//                getStringInRub(currensies[ind], summa*values[ind]) :
//                "Данная валюта в нашем валютном пункте не принимается!";

        if (ind > -1) {
            return getStringInRub(currensies[ind], summa * values[ind]);
        }
        return "Данная валюта в нашем валютном пункте не принимается!";

//        String res = "Данная валюта в нашем валютном пункте не принимается!";
//        if (code.equals("USD"))
//            res = getStringInRub(code, summa * values[0]);
//        else if (code.equals("EUR"))
//            res = getStringInRub(code, summa * values[1]);
//        else if (code.equals("CNY"))
//            res = getStringInRub(code, summa * values[2]);
//        return res;
    }

    private String getStringInRub(String code, double sum) { // формируем строку для вывода
        return "Сумма за " + code + " получается " + sum + " рублей.";
    }

    private int getCurrInd() { // возвращаем индекс валюты в массиве
        for (int i = 0; i < currensies.length; i++) {
            if (currensies[i].equals(code)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return
                "Валюта = " + code +
                        ", сумма = " + summa;
    }
}
