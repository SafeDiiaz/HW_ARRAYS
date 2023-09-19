
package ru.netology.stats;

public class StatsService {
    public int salesSum(int[] amount) {
        int allIn = 0;
        for (int i = 0; i < amount.length; i++) {
            allIn += amount[i];
        }
        return allIn;
    }

    public int mediallySum(int[] amount) {
       int medium = salesSum(amount);

        return medium / 12;
    }


    public int maxSales(int[] amount) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < amount.length; i++) {
            if (amount[i] >= amount[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] amount) {
        int minMonth = 0;

        for (int i = 0; i < amount.length; i++) {
            if (amount[i] <= amount[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int belowAverage(int[] amount) {
        int MinimumQuantity = 0;
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] < mediallySum(amount)) {
                MinimumQuantity += 1;
            }
        }
        return MinimumQuantity;
    }
    public int aboveAverage(int[] amount) {
        int MaximumQuantity = 0;
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] > mediallySum(amount)) {
                MaximumQuantity += 1;
            }
        }
        return MaximumQuantity;
    }

}




