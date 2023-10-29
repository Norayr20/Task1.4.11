public class DayOfWeek {
    public static void main(String[] args) {

        boolean result = isWeekend("Thursday");
        System.out.println(result);
    }

    public static boolean isWeekend(String weekday) {
        if (weekday == "Monday") {
            return false;
        } else if (weekday == "Tuesday") (weekday == "Wednesday"), (weekday == "Thursday"), (weekday == "Friday") {
            return false;
        }
        if (weekday == "Sunday") {
            boolean b = (weekday == "Saturday");
            return true;
        }
    }
}