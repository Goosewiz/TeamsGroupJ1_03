package dateInfo;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MonthInfoTest {
    @Test
    void getMonth() {
        LocalDate date = LocalDate.of(2023, Month.NOVEMBER, 11);
        MonthInfo info = new MonthInfo(date);
        String answer = info.getMonth();
        assertEquals(answer, "ноябрь");
        date = LocalDate.of(1900, Month.JANUARY, 1);
        info = new MonthInfo(date);
        answer = info.getMonth();
        assertEquals(answer, "январь");
        date = LocalDate.of(2020, Month.FEBRUARY, 2);
        info = new MonthInfo(date);
        answer = info.getMonth();
        assertEquals(answer, "февраль");
        //info = new MonthInfo();
        //answer = info.getMonth();
        //assertEquals(answer, "ноябрь");
    }

    @Test
    void getMonthNumber() {
        LocalDate date = LocalDate.of(2023, Month.NOVEMBER, 11);
        MonthInfo info = new MonthInfo(date);
        String answer = info.getMonthNumber();
        assertEquals(answer, "11");
        date = LocalDate.of(1900, Month.JANUARY, 1);
        info = new MonthInfo(date);
        answer = info.getMonthNumber();
        assertEquals(answer, "1");
        date = LocalDate.of(2020, Month.FEBRUARY, 2);
        info = new MonthInfo(date);
        answer = info.getMonthNumber();
        assertEquals(answer, "2");
        //info = new MonthInfo();
        //answer = info.getMonthNumber();
        //assertEquals(answer, "11");
    }

    @Test
    void getTypeOfFirstDay() {
        LocalDate date = LocalDate.of(2023, Month.NOVEMBER, 11);
        MonthInfo info = new MonthInfo(date);
        String answer = info.getTypeOfFirstDay();
        assertEquals(answer, "ср");
        date = LocalDate.of(1900, Month.JANUARY, 1);
        info = new MonthInfo(date);
        answer = info.getTypeOfFirstDay();
        assertEquals(answer, "пн");
        date = LocalDate.of(2020, Month.FEBRUARY, 2);
        info = new MonthInfo(date);
        answer = info.getTypeOfFirstDay();
        assertEquals(answer, "сб");
        //info = new MonthInfo();
        //answer = info.getTypeOfFirstDay();
        //assertEquals(answer, "ср");
    }
    @Test
    void getLastDayDate() {
        LocalDate date = LocalDate.of(2023, Month.NOVEMBER, 11);
        MonthInfo info = new MonthInfo(date);
        String answer = info.getLastDayDate();
        assertEquals(answer, "2023-11-30");
        date = LocalDate.of(1900, Month.JANUARY, 1);
        info = new MonthInfo(date);
        answer = info.getLastDayDate();
        assertEquals(answer, "1900-01-31");
        date = LocalDate.of(2020, Month.FEBRUARY, 2);
        info = new MonthInfo(date);
        answer = info.getLastDayDate();
        assertEquals(answer, "2020-02-29");
        //info = new MonthInfo();
        //answer = info.getLastDayDate();
        //assertEquals(answer, "2023-11-30");
    }
    @Test
    void getNumberOfDays() {
        LocalDate date = LocalDate.of(2023, Month.NOVEMBER, 11);
        MonthInfo info = new MonthInfo(date);
        String answer = info.getNumberOfDays();
        assertEquals(answer, "30");
        date = LocalDate.of(1900, Month.JANUARY, 1);
        info = new MonthInfo(date);
        answer = info.getNumberOfDays();
        assertEquals(answer, "31");
        date = LocalDate.of(2020, Month.FEBRUARY, 2);
        info = new MonthInfo(date);
        answer = info.getNumberOfDays();
        assertEquals(answer, "29");
        //info = new MonthInfo();
        //answer = info.getNumberOfDays();
        //assertEquals(answer, "30");
    }
    @Test
    void getYearAndQuarter() {
        LocalDate date = LocalDate.of(2023, Month.NOVEMBER, 11);
        MonthInfo info = new MonthInfo(date);
        String answer = info.getYearAndQuarter();
        assertEquals(answer, "2023 Q4");
        date = LocalDate.of(1900, Month.JANUARY, 1);
        info = new MonthInfo(date);
        answer = info.getYearAndQuarter();
        assertEquals(answer, "1900 Q1");
        date = LocalDate.of(2020, Month.FEBRUARY, 2);
        info = new MonthInfo(date);
        answer = info.getYearAndQuarter();
        assertEquals(answer, "2020 Q1");
        //info = new MonthInfo();
        //answer = info.getYearAndQuarter();
        //assertEquals(answer, "2023 Q4");
    }
}