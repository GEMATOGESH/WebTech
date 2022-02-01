package by.vk.task1.dao;

import by.vk.task1.entity.*;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

/**
 * Класс объекта доступа к данным.
 * @author Константинович Владислав
 * @version 1.0
 */
public class DAO {

    /**
     * Процедура сереализации данных в db.xml из списка объектов
     * @param mas - массив объектов для сериализации
     * @throws FileNotFoundException при отсутствии db.xml
     */
    public static void serialize(Object[] mas) throws FileNotFoundException {
        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("src/by/vk/task1/resources/db.xml")));
        } catch (FileNotFoundException fileNotFound) {
            throw fileNotFound;
        }

        for (Object obj : mas) {
            encoder.writeObject(obj);
        }
        encoder.close();
    }

    /**
     * Функция десереализации данных из db.xml в список объектов
     * @return возвращает массив объектов содержащий списки товаров в магазине
     * @throws FileNotFoundException при отсутствии db.xml
     */
    public static Object[] deserialize() throws FileNotFoundException {
        ArrayList<Speakers> speakers = new ArrayList<Speakers>();
        ArrayList<TabletPC> tablets = new ArrayList<TabletPC>();
        ArrayList<VacuumCleaner> cleaners = new ArrayList<VacuumCleaner>();
        ArrayList<Refrigerator> refrigirators = new ArrayList<Refrigerator>();
        ArrayList<Laptop> laptops = new ArrayList<Laptop>();
        ArrayList<Oven> ovens = new ArrayList<Oven>();
        ArrayList<Keetle> keetles = new ArrayList<Keetle>();

        XMLDecoder decoder = null;
        try {
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("src/by/vk/task1/resources/db.xml")));
        } catch (FileNotFoundException fileNotFound) {
            throw fileNotFound;
        }

        // Читаем пообъектно и определяем классы
        try {
            Object obj = decoder.readObject();
            while (true) {
                if (obj.getClass() == Speakers.class) {
                    Speakers buf = (Speakers)obj;
                    speakers.add(buf);
                }
                if (obj.getClass() == TabletPC.class) {
                    TabletPC buf = (TabletPC)obj;
                    tablets.add(buf);
                }
                if (obj.getClass() == VacuumCleaner.class) {
                    VacuumCleaner buf = (VacuumCleaner)obj;
                    cleaners.add(buf);
                }
                if (obj.getClass() == Refrigerator.class) {
                    Refrigerator buf = (Refrigerator)obj;
                    refrigirators.add(buf);
                }
                if (obj.getClass() == Laptop.class) {
                    Laptop buf = (Laptop)obj;
                    laptops.add(buf);
                }
                if (obj.getClass() == Oven.class) {
                    Oven buf = (Oven)obj;
                    ovens.add(buf);
                }
                if (obj.getClass() == Keetle.class) {
                    Keetle buf = (Keetle)obj;
                    keetles.add(buf);
                }
                obj = decoder.readObject();
            }
        }
        catch (Exception ex) {
            // Когда поймаем ошибку - прекращаем читать обычно означает что достигли конца файла
        }

        Object[] mas = new Object[7];
        mas[0] = speakers;
        mas[1] = tablets;
        mas[2] = cleaners;
        mas[3] = refrigirators;
        mas[4] = laptops;
        mas[5] = ovens;
        mas[6] = keetles;
        return mas;
    }
}
