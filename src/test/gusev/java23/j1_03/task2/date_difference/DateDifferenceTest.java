package gusev.java23.j1_03.task2.date_difference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateDifferenceTest {

    @Test
    void getDifference() {
        String date = "2023-11-12T00:00:00";//стандартный parse не работает с Z на конце
        String time1 = "UTC+00";
        String time2 = "UTC+00";
        String answer = DateDifference.getDifference(date, time1, time2);
        assertEquals("0", answer);
        date = "2020-06-01T14:25:16";
        time1 = "UTC+01";
        time2 = "UTC+02";
        answer = DateDifference.getDifference(date, time1, time2);
        assertEquals("HOUR", answer);
        date = "2020-06-01T14:25:16";
        time1 = "UTC+05";
        time2 = "UTC+01";
        answer = DateDifference.getDifference(date, time1, time2);
        assertEquals("HOUR", answer);
        date = "2023-05-10T23:00:00";
        time1 = "UTC-03";
        time2 = "UTC+04";
        answer = DateDifference.getDifference(date, time1, time2);
        assertEquals("DAY", answer);
        date = "2024-10-01T04:59:59";
        time1 = "UTC-08";
        time2 = "UTC-04";
        answer = DateDifference.getDifference(date, time1, time2);
        assertEquals("MONTH", answer);
        date = "2010-12-31T20:15:00";
        time1 = "Europe/Moscow";
        time2 = "Asia/Vladivostok";
        answer = DateDifference.getDifference(date, time1, time2);
        assertEquals("YEAR", answer);
    }
}