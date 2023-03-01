package com.geekbrains.lesson1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LessonOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Task 1: Вычислить n-ое треугольного число(сумма чисел от 1 до n),
        // а так же n! (произведение чисел от 1 до n)
        taskOneSumNumbersAndFactorial(sc);

        //Task 2: Вывести все простые числа от 1 до 1000
        taskTwoCounter();

        //Task 3: Реализовать простой калькулятор (+ - / *)
        taskThreeCalculator(sc);

        sc.close();
    }

    public static void taskOneSumNumbersAndFactorial(Scanner sc) {
        System.out.println("Введите число n");
        int n = sc.nextInt();
        int sum = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            factorial =factorial * i;
        }

        System.out.println("Сумма чисел от одного до " + n + " = " + sum);
        System.out.println("Факториал числа " + n + " = " + factorial);
        System.out.println("-------------------------------");
    }

    public static void taskTwoCounter() {
        for (int i = 1; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("--------------------------");
    }

    // определяем является ли число натуральным
    public static boolean isPrime(int n)
    {
        if (n == 2 || n == 3)
            return true;

        if (n <= 1 || n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6)
        {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }


    public static void taskThreeCalculator(Scanner sc) {
        DecimalFormat df = new DecimalFormat("#.####");
        int flag = 0;
        while (flag == 0) {
            System.out.println("Введите первое число ");
            double x = sc.nextDouble();
            System.out.println("Введите математическое действие (+, -, *, /) ");
            String action = sc.next();
            System.out.println("Введите второе число ");
            double y = sc.nextDouble();
            double result = 0.0;
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
                default:
                    System.out.println("Вы ввели неправильное математическое действие, " +
                            "попробуйте еще раз");
                    break;
            }
            if (y != 0.0 && (action.equals("*") || action.equals("/") ||
                    action.equals("-") || action.equals("+"))) {
                flag = 1;
                System.out.println(x + " " + action + " " + y + " = " + df.format(result));
            }
        }
    }

}
