package dateInfo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MonthInfo {
    private LocalDate date;

    MonthInfo(LocalDate date) {
        this.date = date;
    }

    MonthInfo() {
        this.date = LocalDate.now();
    }

    public String getMonth() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("LLLL");
        return dtf.format(date);
    }

    public String getMonthNumber() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M");
        return dtf.format(date);
    }

    public String getTypeOfFirstDay() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E");
        LocalDate date = this.date.withDayOfMonth(1);
        return dtf.format(date);
    }
    public String getLastDayDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-d");
        LocalDate date = this.date.plusMonths(1).withDayOfMonth(1).minusDays(1);
        return dtf.format(date);
    }
    public String getNumberOfDays(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d");
        LocalDate date = this.date.plusMonths(1).withDayOfMonth(1).minusDays(1);
        return dtf.format(date);
    }
    public String getYearAndQuarter(){
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("Q");
        //паттерн QQQ не выдает нужный вариант *Q4*, а заменяет его на русский *4-ый кв.*
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("uuuu");
        String answer1 = dtf1.format(date);
        String answer2 = dtf2.format(date);
        return answer2 + " " + "Q" + answer1;
    }
}