package by.vk.task1.entity;

/**
 * Класс чайника, поля: <b>power_consumption</b>, <b>weight</b>, <b>depth</b>, <b>height</b>, <b>width</b>.
 * @author Константинович Владислав
 * @version 1.0
 */
public class Keetle extends Appliance {
    /** Поле потребление энергии чайника */
    int power_consumption;
    /** Поле вес чайника */
    int weight;
    /** Поле глубина чайника */
    int depth;
    /** Поле высота чайника */
    double height;
    /** Поле ширина чайника */
    double width;
    /** Пустой конструктор для сериализации и десериализации */
    public Keetle() {}

    /**
     * Конструктор - создание объекта чайника
     * @param power_consumption - потребление энергии чайника
     * @param weight - вес чайника
     * @param depth - глубина чайника
     * @param height - высота чайника
     * @param width - ширина чайника
     * @param cost - стоимость чайника
     */
    public Keetle(int power_consumption, int weight, int depth, double height, double width, int cost) {
        this.power_consumption = power_consumption;
        this.weight = weight;
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.cost = cost;
    }

    /**
     * Функция получения значения поля {@link Keetle#power_consumption}
     * @return возвращает потребление энергии чайника
     */
    public int getPower_consumption() {
        return power_consumption;
    }

    /**
     * Процедура установления энергопотребления чайника {@link Keetle#power_consumption}
     * @param power_consumption - энергопотребление чайника
     */
    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    /**
     * Функция получения значения поля {@link Keetle#weight}
     * @return возвращает вес чайника
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Процедура установления веса чайника {@link Keetle#weight}
     * @param weight - вес чайника
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Функция получения значения поля {@link Keetle#depth}
     * @return возвращает глубину чайника
     */
    public int getDepth() {
        return depth;
    }

    /**
     * Процедура установления глубины чайника {@link Keetle#depth}
     * @param depth - глубина чайника
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }

    /**
     * Функция получения значения поля {@link Keetle#height}
     * @return возвращает высоту чайника
     */
    public double getHeight() {
        return height;
    }

    /**
     * Процедура установления высоты чайника {@link Keetle#height}
     * @param height - высота чайника
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Функция получения значения поля {@link Keetle#width}
     * @return возвращает ширину чайника
     */
    public double getWidth() {
        return width;
    }

    /**
     * Процедура установления ширины чайника {@link Keetle#width}
     * @param width - щирина чайника
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Функция получения текстового описания чайника
     * @return возвращает описание чайника
     */
    @Override
    public String toString() {
        return "Keetle{" +
                "power_consumption=" + power_consumption +
                ", weight=" + weight +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                ", cost=" + cost +
                '}';
    }
}
