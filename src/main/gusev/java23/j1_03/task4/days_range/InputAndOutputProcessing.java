package gusev.java23.j1_03.task4.days_range;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InputAndOutputProcessing {
    public String findDays(int year, int week) {
        if (week > 53 || week < 1)
            return "Неверный номер недели";
        if (year < 1)
            return "Неверный год";
        DaysRange dr = new DaysRange();
        LocalDate[] output = dr.findDays(year, week);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-DD");
        String answer = dtf.format(output[0]);
        answer = answer + " " + dtf.format(output[1]);
        return answer;
    }
}
