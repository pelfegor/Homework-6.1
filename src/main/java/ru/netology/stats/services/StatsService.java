package ru.netology.stats.services;

public class StatsService {

    public int sumSales(long[] sales) {
        long sum = 0;
        for (long value : sales) {
            sum = sum + value;
        }
        return (int) sum;
    }

    public double averageSumSales(long[] sales) {
        int sum = sumSales(sales);
        return (double) sum / sales.length;
    }

    public int monthMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int monthMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int monthMaxAverageSumSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSumSales(sales))
                month = month + 1;
        }
        return month;
    }

    public int monthMinAverageSumSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSumSales(sales))
                month = month + 1;
        }
        return month;
    }
}
