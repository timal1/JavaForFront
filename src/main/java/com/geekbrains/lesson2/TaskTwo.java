package com.geekbrains.lesson2;

import java.io.*;

public class TaskTwo {



    public static void readFileToString() {
        File file = new File("DataBase.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file.getName()))) {

            if (file.exists()) {
                String str;
                while ((str = reader.readLine()) != null) {
                    transformerAndPrintString(str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void transformerAndPrintString(String str) {
        StringBuilder sb = new StringBuilder();
        String[] parts = str.replaceAll("(^\")|(\"$)", " ").split("\",\"");
        for (String s: parts
        ) {
            sb.append(s + " ");
        }
        parts = sb.toString().split("\":\"");
        sb.delete(0, sb.length());

        for (String s: parts
        ) {
            sb.append(s + " ");
        }
        parts = sb.toString().split(" ");
        System.out.println("Студент " + parts[2] + " получил " + parts[4] + " по предмету " + parts[6]);

    }

}
