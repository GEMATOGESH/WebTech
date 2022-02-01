package by.vk.task1.entity;

/**
 * Класс музыкальных колонок, поля: <b>power_consumption</b>, <b>number_of_speakers</b>, <b>frequency_range</b>, <b>cord_length</b>.
 * @author Константинович Владислав
 * @version 1.0
 */
public class Speakers extends Appliance {
    /** Поле потребления энергии музыкальными колонками*/
    private int power_consumption;
    /** Поле количества музыкальных колонок*/
    private int number_of_speakers;
    /** Поле частот, поддерживаемых колонками*/
    private String frequency_range;
    /** Поле длины шнура музыкальных колонок*/
    private int cord_length;

    /** Пустой конструктор для сериализации и десериализации */
    public Speakers() {}

    /**
     * Конструктор - создание объекта музыкальных колонок
     * @param power_consumption - потребление энергии музыкальными колонками
     * @param number_of_speakers - количество музыкальных колонок в наборе
     * @param frequency_range - частоты, поддерживаемые музыкальными колонками
     * @param cord_length - длина шнура музыкальных колонок
     * @param cost - стоимость музыкальных колонок
     */
    public Speakers(int power_consumption, int number_of_speakers, String frequency_range, int cord_length, int cost) {
        this.power_consumption = power_consumption;
        this.number_of_speakers = number_of_speakers;
        this.frequency_range = frequency_range;
        this.cord_length = cord_length;
        this.cost = cost;
    }

    /**
     * Функция получения значения поля {@link Speakers#power_consumption}
     * @return возвращает потребление энергии музыкальными колонками
     */
    public int getPower_consumption() {
        return power_consumption;
    }

    /**
     * Процедура установления энергопотребления музыкальных колонок {@link Speakers#power_consumption}
     * @param power_consumption - энергопотребление
     */
    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    /**
     * Функция получения значения поля {@link Speakers#number_of_speakers}
     * @return возвращает количество колонок в наборе
     */
    public int getNumber_of_speakers() {
        return number_of_speakers;
    }

    /**
     * Процедура установления количества музыкальных колонок в наборе {@link Speakers#number_of_speakers}
     * @param number_of_speakers - количество колонок в наборе
     */
    public void setNumber_of_speakers(int number_of_speakers) {
        this.number_of_speakers = number_of_speakers;
    }

    /**
     * Функция получения значения поля {@link Speakers#frequency_range}
     * @return возвращает набор частот, поддерживаемых музыкальными колонками
     */
    public String getFrequency_range() {
        return  frequency_range;
    }

    /**
     * Процедура установления частот, поддерживаемых колонками {@link Speakers#frequency_range}
     * @param frequency_range - частоты
     */
    public void setFrequency_range(String frequency_range) {
        this.frequency_range = frequency_range;
    }

    /**
     * Функция получения значения поля {@link Speakers#cord_length}
     * @return возвращает длину шнура музыкальных колонок
     */
    public int getCord_length() {
        return  cord_length;
    }

    /**
     * Процедура установления длины шнура колонок {@link Speakers#cord_length}
     * @param cord_length - длина шнура
     */
    public void  setCord_length(int cord_length) {
        this.cord_length = cord_length;
    }

    /**
     * Функция получения текстового описания музыкальных колонок
     * @return возвращает описание музыкальных колонок
     */
    @Override
    public String toString() {
        return "Speakers{" +
                "power_consumption=" + power_consumption +
                ", number_of_speakers=" + number_of_speakers +
                ", frequency_range='" + frequency_range + '\'' +
                ", cord_length=" + cord_length +
                ", cost=" + cost +
                '}';
    }
}
