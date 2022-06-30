package ru.netology.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PosterManagerTest {

    @Test
    public void shouldAddMovie() {
        PosterManager manager = new PosterManager();
        manager.add("1");
        manager.add("2");
        manager.add("3");
        manager.add("4");
        manager.add("5");

        String[] actual = manager.findAll();
        String[] expected = {
                "1",
                "2",
                "3",
                "4",
                "5"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        PosterManager manager = new PosterManager(10);
        manager.add("1");
        manager.add("2");
        manager.add("3");
        manager.add("4");
        manager.add("5");
        manager.add("6");
        manager.add("7");
        manager.add("8");
        manager.add("9");
        manager.add("10");
        manager.add("11");
        manager.add("12");

        String[] actual = manager.findLast();
        String[] expected = {"12", "11", "10", "9", "8", "7", "6", "5", "4", "3"};

        Assertions.assertArrayEquals(expected, actual);
    }
}

