public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println(isWeekend("Wednesday"));
    }

    public static boolean isWeekend(String weekday) {
        return weekday.equals("Saturday") || weekday.equals("Sunday");
    }
}