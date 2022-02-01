package by.vk.task1.entity;

import by.vk.task1.dao.DAO;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Класс магазина, поля: <b>speakers</b>, <b>tablets</b>, <b>cleaners</b>, <b>refrigirators</b>, <b>laptops</b>, <b>ovens</b>, <b>keetles</b>.
 * @author Константинович Владислав
 * @version 1.0
 */
public class Shop {
    /** Поле - список музыкальных колонок */
    static ArrayList<Speakers> speakers;
    /** Поле - список планшетов */
    static ArrayList<TabletPC> tablets;
    /** Поле - список пылесосов */
    static ArrayList<VacuumCleaner> cleaners;
    /** Поле - список холодильников */
    static ArrayList<Refrigerator> refrigirators;
    /** Поле - список ноутбуков */
    static ArrayList<Laptop> laptops;
    /** Поле - список духовых печей */
    static ArrayList<Oven> ovens;
    /** Поле - список чайников */
    static ArrayList<Keetle> keetles;

    /**
     * Процедура десереализации данных из db.xml и преобразование полученного массива объектов в списки товаров в магазине
     * @throws FileNotFoundException при отсутствии db.xml
     */
    public static void init() throws FileNotFoundException {
        Object[] db = DAO.deserialize();

        speakers = (ArrayList<Speakers>) db[0];
        tablets = (ArrayList<TabletPC>) db[1];
        cleaners = (ArrayList<VacuumCleaner>) db[2];
        refrigirators = (ArrayList<Refrigerator>) db[3];
        laptops = (ArrayList<Laptop>) db[4];
        ovens = (ArrayList<Oven>) db[5];
        keetles = (ArrayList<Keetle>) db[6];
    }

    /**
     * Процедура добавление товара в список товаров в магазине
     * @param item - товар, который хотим добавить
     */
    public static void addItem(Object item) {
        if (item.getClass() == Speakers.class) {
            Speakers buf = (Speakers)item;
            speakers.add(buf);
        }
        if (item.getClass() == TabletPC.class) {
            TabletPC buf = (TabletPC)item;
            tablets.add(buf);
        }
        if (item.getClass() == VacuumCleaner.class) {
            VacuumCleaner buf = (VacuumCleaner)item;
            cleaners.add(buf);
        }
        if (item.getClass() == Refrigerator.class) {
            Refrigerator buf = (Refrigerator)item;
            refrigirators.add(buf);
        }
        if (item.getClass() == Laptop.class) {
            Laptop buf = (Laptop)item;
            laptops.add(buf);
        }
        if (item.getClass() == Oven.class) {
            Oven buf = (Oven)item;
            ovens.add(buf);
        }
        if (item.getClass() == Keetle.class) {
            Keetle buf = (Keetle) item;
            keetles.add(buf);
        }
    }

    /**
     * Функция получения текстового описания всех товаров в магазине
     * @return возвращает текстовое описание всех товаров в магазине
     */
    public static String getWholeShop() {
        String result = "";

        for (Speakers obj: speakers) {
            result += obj.toString() + "\n";
        }
        for (TabletPC obj: tablets) {
            result += obj.toString() + "\n";
        }
        for (VacuumCleaner obj: cleaners) {
            result += obj.toString() + "\n";
        }
        for (Refrigerator obj: refrigirators) {
            result += obj.toString() + "\n";
        }
        for (Laptop obj: laptops) {
            result += obj.toString() + "\n";
        }
        for (Oven obj: ovens) {
            result += obj.toString() + "\n";
        }
        for (Keetle obj: keetles) {
            result += obj.toString() + "\n";
        }

        return result;
    }

    /**
     * Процедура преобразования данных в массив объектов и последующая сериализация
     * @throws FileNotFoundException при отсутствии db.xml
     */
    public static void saveState() throws FileNotFoundException {
        Object[] mas = new Object[speakers.size() + tablets.size() + cleaners.size() + refrigirators.size() + laptops.size() + ovens.size() + keetles.size()];
        int i = 0;
        for (Speakers obj: speakers) {
            mas[i] = obj;
            i++;
        }
        for (TabletPC obj: tablets) {
            mas[i] = obj;
            i++;
        }
        for (VacuumCleaner obj: cleaners) {
            mas[i] = obj;
            i++;
        }
        for (Refrigerator obj: refrigirators) {
            mas[i] = obj;
            i++;
        }
        for (Laptop obj: laptops) {
            mas[i] = obj;
            i++;
        }
        for (Oven obj: ovens) {
            mas[i] = obj;
            i++;
        }
        for (Keetle obj: keetles) {
            mas[i] = obj;
            i++;
        }
        DAO.serialize(mas);
    }

    /**
     * Функция получения текстового описания всех чайников в магазине
     * @return возвращает текстовое описание всех чайников в магазине
     */
    public static String getAllKeetles() {
        String result = "";
        for (Keetle obj: keetles) {
            result += obj.toString() + '\n';
        }
        return "All Keetles: \n" + result;
    }

    /**
     * Функция получения текстового описания самого дешевого товара в магазине
     * @return возвращает текстовое описание самого дешевого товара в магазине
     */
    public static String getCheapest() {
        Appliance cheapest = new Appliance();
        cheapest.setCost(Integer.MAX_VALUE);

        for (Speakers obj: speakers) {
            if (obj.cost < cheapest.getCost()) {
                cheapest = (Speakers)obj;
            }
        }
        for (TabletPC obj: tablets) {
            if (obj.cost < cheapest.getCost()) {
                cheapest = (TabletPC)obj;
            }
        }
        for (VacuumCleaner obj: cleaners) {
            if (obj.cost < cheapest.getCost()) {
                cheapest = (VacuumCleaner)obj;
            }
        }
        for (Refrigerator obj: refrigirators) {
            if (obj.cost < cheapest.getCost()) {
                cheapest = (Refrigerator)obj;
            }
        }
        for (Laptop obj: laptops) {
            if (obj.cost < cheapest.getCost()) {
                cheapest = (Laptop)obj;
            }
        }
        for (Oven obj: ovens) {
            if (obj.cost < cheapest.getCost()) {
                cheapest = (Oven)obj;
            }
        }
        for (Keetle obj: keetles) {
            if (obj.cost < cheapest.getCost()) {
                cheapest = (Keetle)obj;
            }
        }
        return "Cheapest: \n" + cheapest.toString();
    }
}
