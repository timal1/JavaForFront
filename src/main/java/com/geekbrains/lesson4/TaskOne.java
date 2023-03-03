package com.geekbrains.lesson4;

import java.util.Iterator;
import java.util.LinkedList;

public class TaskOne {
    public static void reversLinkedList(LinkedList<String> list) {

        Iterator<String> iterator = list.descendingIterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next());
        }
    }
}
