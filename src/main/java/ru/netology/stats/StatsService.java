package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public long average(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        long averageSale = totalSales / sales.length;
        return averageSale;
    }

    public int monthMaxSale(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMax] <= sales[i]) {
               monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int monthMinSale(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMin] >= sales[i]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int monthBelowAverage(long[] sales) {
        int count = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                count++;
            }
        }
        return count;
    }

    public int monthAboveAverage(long[] sales) {
        int count = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                count++;
            }
        }
        return count;
    }
}
