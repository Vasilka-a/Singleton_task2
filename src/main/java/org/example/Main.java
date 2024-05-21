package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.print("Введите размер списка: ");
        int inputN = scanner.nextInt();

        System.out.print("Введите верхнюю границу для значений: ");
        int inputM = scanner.nextInt();

        logger.log("Создаём и наполняем список");

        List<Integer> source = new ArrayList<>();
        source = new Random().ints(0, inputN)
                .limit(inputM)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Вот случайный список: " + source);

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.print("Введите порог для фильтра: ");
        int inputF = scanner.nextInt();
        Filter filter = new Filter(inputF);
        List<Integer> filterList = filter.filterOut(source);

        System.out.println("Отфильтрованный список: " + filterList);
        logger.log("Завершаем программу");
    }
}
