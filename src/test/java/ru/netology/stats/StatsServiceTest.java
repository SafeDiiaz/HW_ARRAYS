package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void TheSumOfAllSales() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = amount[0] + amount[1] + amount[2] + amount[3] + amount[4] + amount[5] + amount[6] + amount[7] + amount[8] + amount[9] + amount[10] + amount[11];
        int actual = service.salesSum(amount);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MediallySum() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = (amount[0] + amount[1] + amount[2] + amount[3] + amount[4] + amount[5] + amount[6] + amount[7] + amount[8] + amount[9] + amount[10] + amount[11]) / 12;
        int actual = service.MediallySum(amount);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void MaxSum() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.MaxSales(amount);
        Assertions.assertEquals(expected, actual);

}
    @Test
    public void MinSum() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.MinSales(amount);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void BelowAverage() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.BelowAverage(amount);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void AboveAverage() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.AboveAverage(amount);
        Assertions.assertEquals(expected, actual);

    }





}