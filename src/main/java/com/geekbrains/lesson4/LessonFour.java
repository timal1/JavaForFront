package com.geekbrains.lesson4;

import java.util.Iterator;
import java.util.LinkedList;

public class LessonFour {

    public static void main(String[] args) {

        // Task 1: Пусть дан LinkedList с несколькими элементами.
        // Реализуйте метод(не void), который вернет “перевернутый” список.
        LinkedList<String> list = new LinkedList<>();
        list.add("H");
        list.add("e");
        list.add("l");
        list.add("l");
        list.add("o");

        printList(list);
        System.out.println();
        TaskOne.reversLinkedList(list);
        System.out.println();


        /*
         Task 2: Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
         */

        TaskTwo.enqueue(list, "!");
        printList(list);
        System.out.println();
        System.out.println(TaskTwo.first(list));
        printList(list);
        System.out.println();
        System.out.println(TaskTwo.dequeue(list));
        printList(list);
        System.out.println();


        // Task 2: В калькулятор добавьте возможность отменить последнюю операцию.

        TaskThree.calculator();


    }

    public static void printList(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next());
        }

    }

}
