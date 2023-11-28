package gusev.java23.j1_03.task4.days_range;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InputAndOutputProcessingTest {

    @Test
    void findDays() {
        int year = 2023;
        int week = 2;
        InputAndOutputProcessing iaop = new InputAndOutputProcessing();
        String answer = iaop.findDays(year, week);
        assertEquals("2023-01-09 2023-01-15", answer);
        year = 2024;
        week = 2;
        answer = iaop.findDays(year, week);
        assertEquals("2024-01-08 2024-01-14", answer);
        year = 1800;
        week = 2;
        answer = iaop.findDays(year, week);
        assertEquals("1800-01-13 1800-01-19", answer);
        year = 0;
        week = 2;
        answer = iaop.findDays(year, week);
        assertEquals("Неверный год", answer);
        year = 2023;
        week = -1;
        answer = iaop.findDays(year, week);
        assertEquals("Неверный номер недели", answer);
        year = 2023;
        week = 54;
        answer = iaop.findDays(year, week);
        assertEquals("Неверный номер недели", answer);
    }
}