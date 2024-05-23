package ru.netology.stats;

public class StatsService {


    public long sumSales(long[] sales) { // сумма элементов массива
        long sum = 0; // начальная сумма

        for (long sale : sales) { // цикл по всем элементам массива
            sum += sale; // сумма предыдущих значений и текущего
        }

        return sum; // возврат суммы элементов массива
    }


    public double avgSales(long[] sales) { // среднее по сумме элементов

        return (double) sumSales(sales) / sales.length; // сумма элементов (высчитанная предыдущим методом), разделенная на длину массива
    }


    public int maxSales(long[] sales) { // последний номер месяца с максимальным значением
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int minSales(long[] sales) { // последний номер месяца с минимальным значением
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int countBelowAvg(long[] sales) { // количество месяцев, в которых продажи были ниже среднего
        int count = 0;

        for (long sale : sales) { // цикл по всем элементам массива
            if (sale < avgSales(sales)) { // если текущее значение месяца ниже вычисленного предыдущим методом среднего,
                count++; // то прибавляет 1 к количеству месяцев
            }
        }

        return count;
    }


    public int countAboveAvg(long[] sales) { // количество месяцев, в которых продажи были выше среднего
        int count = 0;

        for (long sale : sales) { // цикл по всем элементам массива
            if (sale > avgSales(sales)) { // если текущее значение месяца выше вычисленного предыдущим методом среднего,
                count++; // то прибавляет 1 к количеству месяцев
            }
        }

        return count;
    }


}