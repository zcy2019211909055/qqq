package week2;

public class ShowCurrentTime {
    public static void main(String[] args) {
        long totalMillseconds = System.currentTimeMillis();
        long totalSeconds = totalMillseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println("Current time is " + currentHour + ":" +
        currentMinute + ":" + currentSecond + " GMt");
    }
}