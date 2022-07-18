package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void testSumSales() {
        StatsService service = new StatsService();

        long[] arr = {15, 20, 3, 85, 45, 65, 81, 55, 69, 57, 71, 55};

        int expected = 621;
        int actual = service.sumSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSumSales() {
        StatsService service = new StatsService();

        long[] arr = {15, 20, 3, 85, 45, 65, 81, 55, 69, 57, 71, 55};

        double expected = 51.75;
        double actual = service.averageSumSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();

        long[] arr = {15, 20, 3, 85, 45, 65, 81, 55, 69, 57, 71, 55};

        int expected = 4;
        int actual = service.monthMaxSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMinSales() {
        StatsService service = new StatsService();

        long[] arr = {15, 20, 3, 85, 45, 65, 81, 55, 69, 57, 71, 55};

        int expected = 3;
        int actual = service.monthMinSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMaxAverageSumSales() {
        StatsService service = new StatsService();

        long[] arr = {15, 20, 3, 85, 45, 65, 81, 55, 69, 57, 71, 55};

        int expected = 8;
        int actual = service.monthMaxAverageSumSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMinAverageSumSales() {
        StatsService service = new StatsService();

        long[] arr = {15, 20, 3, 85, 45, 65, 81, 55, 69, 57, 71, 55};

        int expected = 4;
        int actual = service.monthMinAverageSumSales(arr);

        Assertions.assertEquals(expected, actual);
    }
}
