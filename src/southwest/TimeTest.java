package southwest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeTest {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        System.out.printf("Hour: %s%n", time.getHour());
        System.out.printf("Minute: %s%n", time.getMinute());
        System.out.printf("Second: %s%n", time.getSecond());

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("dateFormat.getTimeZone() = " + dateFormat.getClass());

        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        //Get Current Day as a number
        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today Int: " + todayInt + "\n");
        //Integer to String Conversion
        String todayStr = Integer.toString(todayInt);
        System.out.println("Today Str: " + todayStr + "\n");


        System.out.println("addSeconds(new Date(),4) = " + addSeconds(new Date(), 4));
    }
        public static Date addSeconds (Date date, Integer seconds){
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.SECOND, seconds);
            return cal.getTime();
        }

}
