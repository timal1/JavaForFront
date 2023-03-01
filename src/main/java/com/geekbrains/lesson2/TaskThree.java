package com.geekbrains.lesson2;

public class TaskThree {

    public static boolean isPalindrome(String str) {
        String[] arr = str.split(" ");
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            if (!arr[i].equals(arr[j])) {
                return false;
            }
        }
        return true;
    }
}
