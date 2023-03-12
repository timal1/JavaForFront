package com.geekbrains.lesson5;

import java.util.*;
import java.util.stream.Collectors;

public class Task2 {

    public static void printSortedDuplicateNames(String[] listName) {
        Map<String, Integer> mapName = new HashMap();

        for (String name : listName) {
            String[] parts = name.split(" ");
            String firstName = parts[0];

            Integer frequency = mapName.get(firstName);
            if ( frequency == null ) {
                frequency = 1;
            } else {
                frequency += 1;
            }
            mapName.put(firstName, frequency);
        }
        System.out.println("Список повторяющихся имен, отсортирован по убыванию популярности:");
        Map<String, Integer> sortedMap = mapName.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));

        sortedMap.entrySet().forEach(System.out::println);
    }

}

