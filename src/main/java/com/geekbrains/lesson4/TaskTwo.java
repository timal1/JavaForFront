package com.geekbrains.lesson4;

import java.util.LinkedList;

public class TaskTwo {

    public static LinkedList<String> enqueue(LinkedList<String> list, String element) {
        list.addLast(element);
        return list;

    }
    public static String dequeue(LinkedList<String> list) {
        return list.removeFirst();

    }
    public static String first(LinkedList<String> list) {
        return list.getFirst();

    }
}
