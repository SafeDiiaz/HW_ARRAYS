
package ru.netology.stats;

public class StatsService {
    public int salesSum(int[] amount) {
        int AllIn = 0;
        for (int i = 0; i < amount.length; i++) {
            AllIn += amount[i];
        }
        return AllIn;
    }

    public int MediallySum(int[] amount) {

        return salesSum(amount) / 12;
    }


    public int MaxSales(int[] amount) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < amount.length; i++) {
            if (amount[i] >= amount[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1;
    }

    public int MinSales(int[] amount) {
        int minMonth = 0;

        for (int i = 0; i < amount.length; i++) {
            if (amount[i] <= amount[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int BelowAverage(int[] amount) {
        int MinimumQuantity = 0;
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] < MediallySum(amount)) {
                MinimumQuantity += 1;
            }
        }
        return MinimumQuantity;
    }
    public int AboveAverage(int[] amount) {
        int MaximumQuantity = 0;
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] > MediallySum(amount)) {
                MaximumQuantity += 1;
            }
        }
        return MaximumQuantity;
    }

}




