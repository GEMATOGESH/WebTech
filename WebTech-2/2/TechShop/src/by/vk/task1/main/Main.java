package by.vk.task1.main;

import by.vk.task1.entity.*;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        try {
            Shop.init();
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("Ошибка при чтении даннных магазина, проверьте xml-файл!");
            return;
        }

        System.out.println(Shop.getWholeShop()); // Вывод всего магазина.
        System.out.println(Shop.getAllKeetles()); // Вывод всех чайников.
        System.out.println(Shop.getCheapest()); // Вывод самого дешевого товара
    }

}
