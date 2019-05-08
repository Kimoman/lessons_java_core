package main.java.Lesson_2.HomeWork;

public class MyArrayDataException extends NumberFormatException {

    private int i;
    private int j;

    public MyArrayDataException(String s, int i, int j) {
        super(s);
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " index: [" + i + "] [" + j + "]";
    }
}
