package ru.netology.stats;


public class StatsService {
    public int salesAmount(int[] sales) {
        int amount = 0; //начальная сумма продаж
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount; // сумма всех продаж
    }

    public int averageAmount(int[] sales) {
        int result = salesAmount(sales) / sales.length;
        return result; //средняя сумма продаж
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1; // номер месяца с пиком продаж
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1; // номер месяца с минимум продаж
    }

    public int countMonthMin(int[] sales) {
        int average = averageAmount(sales); //средняя сумма продаж
        int countMonth = 0; //количество  месяцев

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                countMonth++; //количество месяцев с продажами ниже среднего
            }
        }
        return countMonth;
    }

    public int countMonthMax(int[] sales) {
        int average = averageAmount(sales); //средняя сумма продаж
        int countMonth = 0; //количество  месяцев

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                countMonth++; //количество месяцев с продажами выше среднего
            }
        }
        return countMonth;
    }
}