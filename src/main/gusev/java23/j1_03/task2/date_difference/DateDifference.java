package gusev.java23.j1_03.task2.date_difference;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateDifference {
    public static String getDifference(String inputDate, String time1, String time2) {
        LocalDateTime date = LocalDateTime.parse(inputDate);
        ZonedDateTime local = date.atZone(ZoneId.of("UTC+00"));
        ZonedDateTime first = local.withZoneSameInstant(ZoneId.of(time1));
        ZonedDateTime second = local.withZoneSameInstant(ZoneId.of(time2));
        //System.out.println(first);
        //System.out.println(second);
        //System.out.println(first.getDayOfMonth());
        //System.out.println(second.getDayOfMonth());
        if (first.getYear() != second.getYear()) {
            return "YEAR";
        } else if (first.getMonth() != second.getMonth()) {
            return "MONTH";
        } else if (first.getDayOfMonth() != second.getDayOfMonth()) {
            return "DAY";
        }  else if (first.getHour() != second.getHour()) {
            //long answer = ChronoUnit.HOURS.between(second, first);
            //System.out.println(answer);
            return "HOUR";
        } else return "0";
    }
}
