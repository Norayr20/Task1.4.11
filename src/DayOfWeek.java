public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println(isWeekend("Wednesday"));
    }

    public static boolean isWeekend(String weekday) {
        String[] weekends = {"Saturday", "Sunday"};
        for (String weekend : weekends) {
            if (weekend.equals (weekday)) {
                return true;
            }
        }
        return false;
    }
}