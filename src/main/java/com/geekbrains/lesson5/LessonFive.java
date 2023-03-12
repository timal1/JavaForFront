package com.geekbrains.lesson5;

public class LessonFive {

    public static void main(String[] args) {

        // Task1: Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
        //Добавить функции 1) Добавление номера 2) Вывод всего

        TelephoneBook telephoneBook = new TelephoneBook();
        telephoneBook.addEntry("Петр", "89202207685");
        telephoneBook.addEntry("Иван", "89502200685");
        telephoneBook.addEntry("Сергей", "89602207685");
        telephoneBook.addEntry("Петр", "89992207000");
        telephoneBook.addEntry("Иван", "89106457777");
        telephoneBook.addEntry("Иван", "89607770011");

        System.out.println("/////////////////Task1//////////////////");
        telephoneBook.printPhoneBook();

        /* Task2: Пусть дан список сотрудников.
                  Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
                  Отсортировать по убыванию популярности Имени.
     */

        String[] listName = new String[]{
                "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова",
                "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"
        };

        System.out.println("/////////////////Task2/////////////////////");
        Task2.printSortedDuplicateNames(listName);


        /* Task3: На шахматной доске расставить 8 ферзей так,
        чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
        0x000000
        0000x000
        00x00000
         */

        int[][] array = new int[24][24];

        // Можно ввести любые координаты начальной расстановки от 1 до 24
        Task3.addQueen(array,24, 17);
        System.out.println("///////////////////Task3///////////////////");
        Task3.printChessBoard(array);
    }
}
