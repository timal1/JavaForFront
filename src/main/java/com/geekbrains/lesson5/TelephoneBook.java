package com.geekbrains.lesson5;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {

    private HashMap<String, String> telephoneBook;

    public TelephoneBook() {
        this.telephoneBook = new HashMap<>();
    }

    public HashMap<String, String> addEntry(String name, String phoneNumber) {

        if (telephoneBook.containsKey(name)) {
            telephoneBook.replace(name, telephoneBook.get(name) + " " + phoneNumber);
        } else {
            telephoneBook.put(name, phoneNumber);
        }
        return telephoneBook;
    }

    public void printPhoneBook() {
        for (Map.Entry<String, String> entry : telephoneBook.entrySet()) {
            System.out.println("Имя:  " + entry.getKey() + ", телефоны: = " + entry.getValue());
        }
    }
}
