package com.geekbrains.lesson2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TaskOneBubbleSort {

    public static int[] bubbleSort(int[] arr) {
        Logger logger = createLogger();
        int limit = arr.length;
        boolean isChange;

        do {
            isChange = false;
            limit--;
            for (int i = 0; i < limit; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isChange = true;
                    logger.log(Level.INFO, arrayToString(arr));
                }

            }
        } while (isChange);

        return arr;
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");

        }
        return sb.toString();
    }

    public static Logger createLogger() {
        Logger logger = Logger.getLogger(LessonTwo.class.getName());
        FileHandler fileHandler;

        {
            try {
                fileHandler = new FileHandler("logTask1.txt");
                logger.addHandler(fileHandler);
                SimpleFormatter simpleFormatter = new SimpleFormatter();
                fileHandler.setFormatter(simpleFormatter);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return logger;
    }
}
