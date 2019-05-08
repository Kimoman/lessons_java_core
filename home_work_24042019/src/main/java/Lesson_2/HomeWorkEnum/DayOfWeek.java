package main.java.Lesson_2.HomeWorkEnum;

public enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static int getWorkingHours(DayOfWeek day) {
        if (day.ordinal() < 5) {
            return 40 - day.ordinal() * 8;
        } else {
            System.out.println("Выходные!!!");
        }
        return 0;
    }
}
