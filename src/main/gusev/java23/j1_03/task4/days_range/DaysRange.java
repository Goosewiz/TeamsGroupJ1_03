package gusev.java23.j1_03.task4.days_range;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DaysRange {
    public LocalDate[] findDays(int year, int week) {
        LocalDate date = LocalDate.of(year, Month.JANUARY, 1);
        while (date.getDayOfWeek() != DayOfWeek.MONDAY) {
            date = date.plusDays(1);
        }
        date = date.plusDays(7 * (week - 1));
        LocalDate[] answer = new LocalDate[2];
        answer[0] = date;
        date = date.plusDays(6);
        answer[1] = date;
        return answer;
    }
}
