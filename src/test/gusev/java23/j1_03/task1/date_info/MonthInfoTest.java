package gusev.java23.j1_03.task1.date_info;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MonthInfoTest {

    @Test
    void firstDateTest() {
        LocalDate date = LocalDate.of(2023, Month.NOVEMBER, 11);
        MonthInfo info = new MonthInfo(date);
        String answer1 = info.getMonth();
        assertEquals("ноябрь", answer1, "Первый тест провален");
        int answer2 = info.getMonthNumber();
        assertEquals(11, answer2, "Второй тест провален");
        String answer3 = info.getTypeOfFirstDay();
        assertEquals("ср", answer3, "Третий тест провален");
        LocalDate answer4 = info.getLastDayDate();
        LocalDate temp = LocalDate.of(2023, Month.NOVEMBER, 30);
        assertEquals(temp, answer4, "Четвертый тест провален");
        int answer5 = info.getNumberOfDays();
        assertEquals(30, answer5, "Пятый тест провален");
        String answer6 = info.getYearAndQuarter();
        assertEquals("2023 Q4", answer6, "Шестой тест провален");
    }

    @Test
    void secondDateTest() {
        LocalDate date = LocalDate.of(1900, Month.JANUARY, 1);
        MonthInfo info = new MonthInfo(date);
        String answer1 = info.getMonth();
        assertEquals("январь", answer1, "Первый тест провален");
        int answer2 = info.getMonthNumber();
        assertEquals(1, answer2, "Второй тест провален");
        String answer3 = info.getTypeOfFirstDay();
        assertEquals("пн", answer3, "Третий тест провален");
        LocalDate answer4 = info.getLastDayDate();
        LocalDate temp = LocalDate.of(1900, Month.JANUARY, 31);
        assertEquals(temp, answer4, "Четвертый тест провален");
        int answer5 = info.getNumberOfDays();
        assertEquals(31, answer5, "Пятый тест провален");
        String answer6 = info.getYearAndQuarter();
        assertEquals("1900 Q1", answer6, "Шестой тест провален");
    }

    @Test
    void thirdDateTest() {
        LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 2);
        MonthInfo info = new MonthInfo(date);
        String answer1 = info.getMonth();
        assertEquals("февраль", answer1, "Первый тест провален");
        date = LocalDate.of(2020, Month.FEBRUARY, 2);
        info = new MonthInfo(date);
        int answer2 = info.getMonthNumber();
        assertEquals(2, answer2, "Второй тест провален");
        date = LocalDate.of(2020, Month.FEBRUARY, 2);
        info = new MonthInfo(date);
        String answer3 = info.getTypeOfFirstDay();
        assertEquals("сб", answer3, "Третий тест провален");
        date = LocalDate.of(2020, Month.FEBRUARY, 2);
        info = new MonthInfo(date);
        LocalDate answer4 = info.getLastDayDate();
        LocalDate temp = LocalDate.of(2020, Month.FEBRUARY, 29);
        assertEquals(temp, answer4, "Четвертый тест провален");
        date = LocalDate.of(2020, Month.FEBRUARY, 2);
        info = new MonthInfo(date);
        int answer5 = info.getNumberOfDays();
        assertEquals(29, answer5, "Пятый тест провален");
        date = LocalDate.of(2020, Month.FEBRUARY, 2);
        info = new MonthInfo(date);
        String answer6 = info.getYearAndQuarter();
        assertEquals("2020 Q1", answer6, "Шестой тест провален");
    }
}