package com.geekbrains.lesson5;

public class Task3 {


    public static void printChessBoard(int[][]mas ) {

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(" " + mas[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean isEmptyHorizontalLine(int number, int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[number][i] == 1) return false;
        }
        return true;
    }

    private static boolean isEmptyVerticalLine(int number, int [][] mas) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i][number] == 1) return false;
        }
        return true;
    }

    private static boolean isEmptyDiagonalLine(int numberVerticalLine, int numberHorizontalLine, int[][] mas) {
        int x = 0;  // номер вертикали i
        int y = 0; //номер горизонтали j
        int z = 0; //номер горизонтали i в обратную сторону
        int q = 0; //номер горизонтали j в обратную сторону

        if (numberHorizontalLine > numberVerticalLine) {
            y = numberHorizontalLine - numberVerticalLine;
        } else if (numberHorizontalLine < numberVerticalLine){
            x = numberVerticalLine - numberHorizontalLine;
        }

        if (numberVerticalLine + numberHorizontalLine >= mas.length) {
            q = numberVerticalLine + numberHorizontalLine - mas.length + 1;
            z = mas.length - 1;
        } else if (numberVerticalLine + numberHorizontalLine < mas.length) {
            z = numberVerticalLine + numberHorizontalLine;

        }

        if (x == 0) {
            for (int i = x, j = y; j < mas.length; i++, j++) {
                if (mas[i][j] == 1) return false;
            }

        } else {
            for (int i = x, j = y; i < mas.length; i++, j++) {
                if (mas[i][j] == 1) return false;
            }
        }

        if (q == 0) {
            for (int a = z, b = q ; a >= 0; a--,b++) {
                if (mas[a][b] == 1) return false;
            }
        } else {
            for (int a = z, b = q ; b < mas.length; a--,b++) {
                if (mas[a][b] == 1) return false;
            }
        }
        return true;
    }

    public static void addQueen(int[][] arr, int x, int y) {
        int i = x - 1;
        int j = y - 1;
        int countQueen = 0;

        while (countQueen < 8) {
            if (i >= arr.length) {
                i = 0;
            }

            if (j >= arr.length) {
                j = 0;
            }

            if (isEmptyHorizontalLine(i, arr) && isEmptyVerticalLine(j, arr) && isEmptyDiagonalLine(i, j, arr)) {
                arr[i][j] = 1;
                countQueen += 1;
                i++;
                j++;

            } else {
                i++;
            }

        }
    }
}
