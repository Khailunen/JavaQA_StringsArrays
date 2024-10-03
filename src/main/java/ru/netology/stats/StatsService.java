package ru.netology.stats;

public class StatsService {
    public long sumSale(long[] many) {
        long sum = 0;
        for (long i = 0; i < many.length; i++) {
            sum = sum + many[(int) i];
        }
        return sum;
    }

    public long averageAmountSaleMonth(long[] many) {
        long sum = sumSale(many) / 12;
        return sum;
    }

    public long monthWithMaxSales(long[] many) {
        int maxMonth = 0;
        for (int i = 0; i < many.length; i++) {
            if (many[i] > many[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long monthWithMinSales(long[] many) {
        int minMonth = 0;
        for (int i = 0; i < many.length; i++) {
            if (many[i] < many[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    public long belowAverageAmountSaleMonth(long[] many) {
        int countMonth = 0;
        long averageSale = averageAmountSaleMonth(many);
        for (int i = 0; i < 12; i++) {
            if (many[i] < averageSale) {
                countMonth++;
            }
        }
        return countMonth;
    }

    public long aboveAverageAmountSaleMonth(long[] many) {
        int countMonth = 0;
        long averageSale = averageAmountSaleMonth(many);
        for (int i = 0; i < 12; i++) {
            if (many[i] < averageSale) {
                countMonth++;
            }
        }
        return countMonth;
    }

}