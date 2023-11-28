package gusev.java23.j1_03.task3.weekend_count;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class WeekendCount {
    public static int weekendCount(LocalDate date1, LocalDate date2) {
        long result = ChronoUnit.DAYS.between(date1, date2) + 1;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E");
        int answer = 0;
        for (int i = 0; i < result; i++) {
            String day = dtf.format(date1);
            if (day.equals("сб") || day.equals("вс")) {
                answer = answer + 1;
            }
            date1 = date1.plusDays(1);
        }
        return answer;
    }
}
