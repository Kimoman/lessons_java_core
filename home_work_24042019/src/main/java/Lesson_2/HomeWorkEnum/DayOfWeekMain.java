package main.java.Lesson_2.HomeWorkEnum;

import static main.java.Lesson_2.HomeWorkEnum.DayOfWeek.getWorkingHours;

public class DayOfWeekMain {

    public static void main(final String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
    }
}
