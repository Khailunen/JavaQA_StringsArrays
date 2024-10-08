package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSumSaleInYear() {
        StatsService service = new StatsService();

        long[] many = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180L;
        long actualSum = service.amountSalesPerYear(many);

        Assertions.assertEquals(expectedSum, actualSum);
    }


    @Test
    public void testAverageAmountSaleMonth() {

        StatsService service = new StatsService();

        long[] many = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSum = 15L;
        long actualAverageSum = service.averageAmountSaleMonth(many);
        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void testMonthWithMaxSales() {

        StatsService service = new StatsService();

        long[] many = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxMonth = 6L;
        long actualMaxMonth = service.monthWithMaxSales(many);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);

    }

    @Test
    public void testMonthWithMinSales() {

        StatsService service = new StatsService();

        long[] many = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinMonth = 9L;
        long actualMinMonth = service.monthWithMinSales(many);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);

    }

    @Test
    public void testBelowAverageAmountSaleMonth() {

        StatsService service = new StatsService();

        long[] many = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedBelowAverage = 5L;
        long actualBelowAverage = service.belowAverageAmountSaleMonth(many);
        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);

    }

    @Test
    public void testAboveAverageAmountSaleMonth() {

        StatsService service = new StatsService();

        long[] many = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAboveAverage = 5L;
        long actualAboveAverage = service.belowAverageAmountSaleMonth(many);
        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);

    }

}
