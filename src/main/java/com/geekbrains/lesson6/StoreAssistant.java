package com.geekbrains.lesson6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StoreAssistant {

    public static List<NoteBook> findNotebooksByParameters(List<NoteBook> noteBookList) {

        Long size = Long.valueOf(noteBookList.size());
        System.out.println("Введите цифру, соответствующую необходимому критерию поиска:\n" +
                " 1 - ОЗУ\n 2 - Объем ЖД\n 3 - Операционная система\n 4 - Цвет\n 5 - количество выборки\n " +
                "и введите через пробел парамметр (например: 1 2Гб 2 500Гб 3 Windows 4 черный 5 6)");

        Scanner scanner = new Scanner(System.in);
        Map<String, String> mapParams = new HashMap<>();

        String input = scanner.nextLine();
        String[] params = input.split(" ");

        if (params.length < 2) {
            return null;
        }

        for (int i = 0; i < params.length; i += 2) {
            if (params[i].equals("5")) {
                size = Long.valueOf(params[i + 1]);
            } else if (params[i].equals("1") || params[i].equals("2") ||
                    params[i].equals("3") || params[i].equals("4")){
                mapParams.put(params[i], params[i + 1]);
            } else {
                return null;
            }
        }

        List<NoteBook> filterListNotebook = noteBookList.stream()
                .filter(x ->
                        mapParams.entrySet().stream()
                                .allMatch(y ->
                                        x.getProperty(y.getKey()).equals(y.getValue())
                                )
                ).limit(size)
                .collect(Collectors.toList());

        return filterListNotebook;
    }

    public static void printListNotebooks(List<NoteBook> noteBookList) {
        if (noteBookList == null) {
            System.out.println("Ошибка ввода");
        } else if (!noteBookList.isEmpty()) {
            System.out.println("По заданным параметрам найдены следующие ноутбуки: ");
            noteBookList.stream().forEach(System.out::println);

        } else {
            System.out.println("По заданным параметрам ничего не найдено, " +
                    "попробуйте изменить список параметров");
        }
    }
}
