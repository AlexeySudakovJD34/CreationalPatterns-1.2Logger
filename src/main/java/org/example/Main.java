package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        logger.log("Запускаем программу...");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int listSize = scan.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scan.nextInt();
        logger.log("Создаём и наполняем список...");
        List<Integer> source = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            source.add(random.nextInt(maxValue));
        }
        System.out.println("Вот случайный список: " + source);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int filterThreshold = scan.nextInt();
        Filter filter = new Filter(filterThreshold);
        List<Integer> filterOut = filter.filterOut(source);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: " + filterOut + "\n");
        logger.log("Завершаем программу");

        scan.close();
    }
}