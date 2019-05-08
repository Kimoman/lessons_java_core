package main.java.Lesson_2.HomeWork;

import static main.java.Lesson_2.HomeWork.MyArray.toInt;

public class Main {
    public static void main(String[] args) {
        String[][] arrayStr = new String[][]{{"1","2","6","8"},{"1","2","6","8"},{"1","2","7","8"},{"1","2","8","8"}};

        int[][] arrayInt = toInt(arrayStr);

        for (int[] arr: arrayInt
             ) {
            for (int elem: arr
                 ) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
