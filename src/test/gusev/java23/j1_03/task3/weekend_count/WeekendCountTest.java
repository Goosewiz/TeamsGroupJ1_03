package gusev.java23.j1_03.task3.weekend_count;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeekendCountTest {

    @Test
    void weekendCount() {
        LocalDate day1 = LocalDate.of(2023, Month.NOVEMBER, 1);
        LocalDate day2 = LocalDate.of(2023, Month.NOVEMBER, 1);
        int answer = WeekendCount.weekendCount(day1, day2);
        assertEquals(0, answer);
        day1 = LocalDate.of(2023, Month.MAY, 1);
        day2 = LocalDate.of(2023, Month.MAY, 3);
        answer = WeekendCount.weekendCount(day1, day2);
        assertEquals(0, answer);
        day1 = LocalDate.of(2023, Month.JANUARY, 1);
        day2 = LocalDate.of(2023, Month.JANUARY, 1);
        answer = WeekendCount.weekendCount(day1, day2);
        assertEquals(1, answer);
        day1 = LocalDate.of(2023, Month.MAY, 1);
        day2 = LocalDate.of(2023, Month.MAY, 6);
        answer = WeekendCount.weekendCount(day1, day2);
        assertEquals(1, answer);
        day1 = LocalDate.of(2023, Month.MAY, 7);
        day2 = LocalDate.of(2023, Month.MAY, 10);
        answer = WeekendCount.weekendCount(day1, day2);
        assertEquals(1, answer);
        day1 = LocalDate.of(2023, Month.MAY, 1);
        day2 = LocalDate.of(2023, Month.MAY, 7);
        answer = WeekendCount.weekendCount(day1, day2);
        assertEquals(2, answer);
        day1 = LocalDate.of(2023, Month.MAY, 1);
        day2 = LocalDate.of(2023, Month.MAY, 8);
        answer = WeekendCount.weekendCount(day1, day2);
        assertEquals(2, answer);
        day1 = LocalDate.of(2023, Month.MAY, 6);
        day2 = LocalDate.of(2023, Month.MAY, 7);
        answer = WeekendCount.weekendCount(day1, day2);
        assertEquals(2, answer);
        day1 = LocalDate.of(2023, Month.MAY, 6);
        day2 = LocalDate.of(2023, Month.MAY, 9);
        answer = WeekendCount.weekendCount(day1, day2);
        assertEquals(2, answer);
        day1 = LocalDate.of(2023, Month.MAY, 1);
        day2 = LocalDate.of(2023, Month.MAY, 16);
        answer = WeekendCount.weekendCount(day1, day2);
        assertEquals(4, answer);
        day1 = LocalDate.of(2023, Month.JANUARY, 1);
        day2 = LocalDate.of(2023, Month.DECEMBER, 31);
        answer = WeekendCount.weekendCount(day1, day2);
        assertEquals(105, answer);
    }
}