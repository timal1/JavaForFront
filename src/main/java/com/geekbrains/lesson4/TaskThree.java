package com.geekbrains.lesson4;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskThree {

    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        List<Double> memoryResult = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#.####");
        int flag = 0;
        double x = 0.0;
        double y;
        double result = 0.0;
        String operation = "начать";
        String action = "";
        while (flag == 0) {
            switch (operation) {
                case ("начать"):
                    System.out.println("Введите первое число ");
                    x = sc.nextDouble();
                    System.out.println("Введите математическое действие (+, -, *, /) ");
                    action = sc.next();
                    System.out.println("Введите второе число ");
                    y = sc.nextDouble();
                    break;
                case ("отмена"):
                    if (memoryResult.size() > 1) {
                        memoryResult.remove(memoryResult.size() - 1);
                        result = memoryResult.get(memoryResult.size() - 1);
                        System.out.println(result);
                    } else {
                        System.out.println("В памяти нет предъидущего результа");
                    }

                    y = 0.0;
                    action = "пропустить";
                    break;
                case ("продолжить"):
                    x = result;
                    System.out.println("Первое число = " + x);
                    System.out.println("Введите математическое действие (+, -, *, /) ");
                    action = sc.next();
                    System.out.println("Введите второе число ");
                    y = sc.nextDouble();
                    break;
                default:
                    y = 0.0;
                    action = "пропустить";
                    System.out.println("Вы ввели неправильную команду, " +
                            "попробуйте еще раз");
                    break;
            }
            switch (action) {
                case  ("*"):
                    result = x * y;
                    break;
                case ("/"):
                    if (y != 0) {
                        result = x / y;
                    } else {
                        System.out.println("На ноль делить нельзя, " +
                                "попробуйте еще раз");
                    }
                    break;
                case ("+"):
                    result = x + y;
                    break;
                case ("-"):
                    result = x - y;
                    break;
                case ("пропустить"):
                    break;

                default:
                    System.out.println("Вы ввели неправильное математическое действие, " +
                            "попробуйте еще раз");
                    break;
            }
            if (y != 0.0 && (action.equals("*") || action.equals("/") ||
                    action.equals("-") || action.equals("+"))) {
                memoryResult.add(result);
                System.out.println(x + " " + action + " " + y + " = " + df.format(result));

            }
            System.out.println("Меню:\n отменить операцию - отмена,\n " +
                    "продолжить операцию с текущим результатом - продолжить,\n " +
                    "начать сначала - начать,\n " +
                    "выйти из программы - выйти");
            operation = sc.next();
            if (operation.equals("выйти")) {
                flag = 1;
            }
        }
    }

}
