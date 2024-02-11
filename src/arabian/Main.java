package arabian;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {

        // КАЛЬКУЛЯТОР ЗАДАНИЕ
        String oppen;
        String[] actions = {"+", "-", "*", "/",};
        String[] regexActions = {"\\+", "-", "\\*", "/",};
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        //       System.out.println(parse(exp)); не было
        int actionIndex = -1;
        for (int i = 0; i < actions.length; i++)
            if (exp.contains(actions[i])) {
                actionIndex = i;
                break;
            }

        if (actionIndex == -1) {
            throw new Exception("т.к. строка не является математической операцией");
        }


        String[] data = exp.split("[+\\-*/ ]");
        if (data.length != 2)
            throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)\n");



        int a, b;

        a = Integer.parseInt(data[0]);
        b = Integer.parseInt(data[1]);

        if (a > 10 || b > 10) {
            throw new Exception("число должно быть не больше 10");
        }


        int otvet = 0;

        switch (actions[actionIndex]) {
            case "+":
                otvet = a + b;
                break;
            case "-":
                otvet = a - b;
                break;
            case "*":
                otvet = a * b;
                break;
            case "/":
                otvet = a / b;
                break;
        }
        System.out.println(otvet);
    }


}
