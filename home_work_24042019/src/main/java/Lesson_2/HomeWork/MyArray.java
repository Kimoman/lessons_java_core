package main.java.Lesson_2.HomeWork;

public class MyArray {

    private static void assertLength(String[][] strArr) {
        if (strArr.length != 4) {
            throw new MyArraySizeException("Длинна массива не 4x4");
        } else {
            for (String[] elem: strArr
            ) {
                if (elem.length != 4) {
                    throw new MyArraySizeException("Длинна массива не 4x4");
                }
            }
        }
    }

    private static int[][] converter(String[][] strArr) throws MyArrayDataException{
        int[][] intArr = new int[4][4];

        for(int i = 0; i < strArr.length; i++) {
            for(int j = 0; j < strArr[i].length; j++) {
                try {
                    intArr[i][j] = Integer.valueOf(strArr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(e.getMessage()+ " index: [" + i + "] [" + j + "]");
                }

            }
        }

        return intArr;
    }

    public static int[][] toInt(String[][] strArr) {
        //Проверка размерности
        assertLength(strArr);
        //Конвертация строкового массива в int-array
        return converter(strArr);
    }
}
