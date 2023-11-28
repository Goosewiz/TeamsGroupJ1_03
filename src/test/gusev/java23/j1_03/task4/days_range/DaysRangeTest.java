package gusev.java23.j1_03.task4.days_range;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DaysRangeTest {
    @Test
    void findDays() {
        int year = 2023;
        int week = 2;
        DaysRange dr = new DaysRange();
        LocalDate[] output = dr.findDays(year, week);
        LocalDate expected = LocalDate.of(2023, Month.JANUARY, 9);
        assertEquals(expected, output[0]);
        expected = LocalDate.of(2023, Month.JANUARY, 15);
        assertEquals(expected, output[1]);
        year = 2024;
        week = 2;
        output = dr.findDays(year, week);
        expected = LocalDate.of(2024, Month.JANUARY, 8);
        assertEquals(expected, output[0]);
        expected = LocalDate.of(2024, Month.JANUARY, 14);
        assertEquals(expected, output[1]);
        year = 2022;
        week = 1;
        output = dr.findDays(year, week);
        expected = LocalDate.of(2022, Month.JANUARY, 3);
        assertEquals(expected, output[0]);
        expected = LocalDate.of(2022, Month.JANUARY, 9);
        assertEquals(expected, output[1]);
        year = 2022;
        week = 52;
        output = dr.findDays(year, week);
        expected = LocalDate.of(2022, Month.DECEMBER, 26);
        assertEquals(expected, output[0]);
        expected = LocalDate.of(2023, Month.JANUARY, 1);
        assertEquals(expected, output[1]);
    }
}