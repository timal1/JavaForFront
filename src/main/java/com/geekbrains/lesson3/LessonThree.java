package com.geekbrains.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class LessonThree {

    public static void main(String[] args) {

        ArrayList<Integer> listInteger = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        // Task 1: Пусть дан произвольный список целых чисел, удалить из него четные числа
        task1ListIntegerToListOfOddNumbers(listInteger);
        System.out.println();

        // Task2: Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

        task2FindMinMaxAvgFromListInteger(listInteger);
        System.out.println();
    }

    public static void task1ListIntegerToListOfOddNumbers(ArrayList<Integer> list) {
        List<Integer> listOfOddNumbers = list.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        listOfOddNumbers.stream().forEach(x -> System.out.print(x + " "));;
    }
    public static void task2FindMinMaxAvgFromListInteger(ArrayList<Integer> list) {

        int max = Collections.max(list);
        int min = Collections.min(list);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        double avg = (double) sum / (double) list.size();

        System.out.println("Max = " + max + " Min = " + min + " Average = " + avg);
    }

}
