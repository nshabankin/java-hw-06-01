package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // заданный вручную массив для последующих проверок

    @Test
    public void testSumSales() { // проверка рассчёта суммы продаж

        StatsService service = new StatsService(); // объект класса

        long expected = 180; // вручную вычисленная сумма продаж за все месяцы
        long actual = service.sumSales(sales); // фактический результат вычисления методом

        Assertions.assertEquals(expected, actual); // сравнение результатов
    }

    @Test
    public void testAvgSales() { // проверка рассчёта среднего суммы продаж

        StatsService service = new StatsService(); // объект класса

        double expected = 15.0; // вручную вычисленное среднее суммы продаж
        double actual = service.avgSales(sales); // фактический результат вычисления методом

        Assertions.assertEquals(expected, actual); // сравнение результатов
    }

    @Test
    public void testMaxSales() { // проверка рассчёта номера месяца с максимальным значением

        StatsService service = new StatsService(); // объект класса

        int expected = 8; // вручную вычисленное значение (индекс последнего из максимальных месяцев + 1)
        int actual = service.maxSales(sales); // фактический результат вычисления методом

        Assertions.assertEquals(expected, actual); // сравнение результатов
    }

    @Test
    public void testMinSales() { // проверка рассчёта номера месяца с минимальным значением

        StatsService service = new StatsService(); // объект класса

        int expected = 9; // вручную вычисленное значение (индекс последнего из минимальных месяцев + 1)
        int actual = service.minSales(sales); // фактический результат вычисления методом

        Assertions.assertEquals(expected, actual); // сравнение результатов
    }

    @Test
    public void testCountBelowAvg() { // проверка рассчёта количества месяцев со значениями ниже среднего

        StatsService service = new StatsService(); // объект класса

        int expected = 5; // вручную вычисленное значение (количество месяцев со значениями ниже среднего)
        int actual = service.countBelowAvg(sales); // фактический результат вычисления методом

        Assertions.assertEquals(expected, actual); // сравнение результатов
    }

    @Test
    public void testCountAboveAvg() { // проверка рассчёта количества месяцев со значениями выше среднего

        StatsService service = new StatsService(); // объект класса

        int expected = 5; // вручную вычисленное значение (количество месяцев со значениями выше среднего)
        int actual = service.countAboveAvg(sales); // фактический результат вычисления методом

        Assertions.assertEquals(expected, actual); // сравнение результатов
    }
}
