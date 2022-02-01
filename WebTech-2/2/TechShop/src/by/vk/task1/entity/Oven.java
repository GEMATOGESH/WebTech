package by.vk.task1.entity;

/**
 * Класс духовой печи, поля: <b>power_consumption</b>, <b>weight</b>, <b>capacity</b>, <b>depth</b>, <b>height</b>, <b>width</b>.
 * @author Константинович Владислав
 * @version 1.0
 */
public class Oven extends Appliance {
    /** Поле объема батареи духовой печи*/
    int power_consumption;
    /** Поле веса духовой печи*/
    int weight;
    /** Поле объема духовой печи*/
    int capacity;
    /** Поле глубины духовой печи*/
    int depth;
    /** Поле высоты духовой печи*/
    double height;
    /** Поле ширины духовой печи*/
    double width;

    /** Пустой конструктор для сериализации и десериализации */
    public Oven() {}

    /**
     * Конструктор - создание объекта духовой печи
     * @param power_consumption - потребление энергии ноутбука
     * @param weight - вес духовой печи
     * @param capacity - объем духовой печи
     * @param depth - глубина духовой печи
     * @param height - высота духовой печи
     * @param width - ширина духовой печи
     * @param cost - стоимость духовой печи
     */
    public Oven(int power_consumption, int weight, int capacity, int depth, double height, double width, int cost) {
        this.power_consumption = power_consumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.cost = cost;
    }

    /**
     * Функция получения значения поля {@link Oven#power_consumption}
     * @return возвращает потребление энергии духовой печи
     */
    public int getPower_consumption() {
        return power_consumption;
    }

    /**
     * Процедура установления энергопотребления духовой печи {@link Oven#power_consumption}
     * @param power_consumption - энергопотребление
     */
    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    /**
     * Функция получения значения поля {@link Oven#weight}
     * @return возвращает веса духовой печи
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Процедура установления веса духовой печи {@link Oven#weight}
     * @param weight - вес
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Функция получения значения поля {@link Oven#capacity}
     * @return возвращает объем духовой печи
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Процедура установления объема духовой печи {@link Oven#capacity}
     * @param capacity - объем
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Функция получения значения поля {@link Oven#depth}
     * @return возвращает глубины духовой печи
     */
    public int getDepth() {
        return depth;
    }

    /**
     * Процедура установления глубины духовой печи {@link Oven#depth}
     * @param depth - глубина
     */
    public void setDepth(int depth) {
        this.depth = depth;
    }

    /**
     * Функция получения значения поля {@link Oven#height}
     * @return возвращает высоты духовой печи
     */
    public double getHeight() {
        return height;
    }

    /**
     * Процедура установления высоты духовой печи {@link Oven#height}
     * @param height - высота
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Функция получения значения поля {@link Oven#width}
     * @return возвращает ширины духовой печи
     */
    public double getWidth() {
        return width;
    }

    /**
     * Процедура установления ширины духовой печи {@link Oven#width}
     * @param width - ширина
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Функция получения текстового описания духовой печи
     * @return возвращает описание духвой печи
     */
    @Override
    public String toString() {
        return "Oven{" +
                "power_consumption=" + power_consumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                ", cost=" + cost +
                '}';
    }
}
