package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void theSumOfAllSales() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = amount[0] + amount[1] + amount[2] + amount[3] + amount[4] + amount[5] + amount[6] + amount[7] + amount[8] + amount[9] + amount[10] + amount[11];
        int actual = service.salesSum(amount);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void mediallySum() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = (amount[0] + amount[1] + amount[2] + amount[3] + amount[4] + amount[5] + amount[6] + amount[7] + amount[8] + amount[9] + amount[10] + amount[11]) / 12;
        int actual = service.mediallySum(amount);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void maxSum() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(amount);
        Assertions.assertEquals(expected, actual);

}
    @Test
    public void minSum() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(amount);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void belowAverage() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowAverage(amount);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void aboveAverage() {
        StatsService service = new StatsService();
        int[] amount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverage(amount);
        Assertions.assertEquals(expected, actual);

    }





}