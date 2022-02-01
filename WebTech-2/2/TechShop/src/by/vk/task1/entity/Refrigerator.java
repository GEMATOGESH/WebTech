package by.vk.task1.entity;

/**
 * Класс холодильника, поля: <b>power_consumption</b>, <b>weight</b>, <b>freezer_capacity</b>, <b>overall_capacity</b>, <b>height</b>, <b>width</b>.
 * @author Константинович Владислав
 * @version 1.0
 */
public class Refrigerator extends Appliance {
    /** Поле потребления энергии холодильником*/
    int power_consumption;
    /** Поле веса холодильника*/
    int weight;
    /** Поле объема морозильника холодильника*/
    int freezer_capacity;
    /** Поле объема холодильника*/
    double overall_capacity;
    /** Поле высоты холодильника*/
    int height;
    /** Поле ширины холодильника*/
    int width;

    /** Пустой конструктор для сериализации и десериализации */
    public Refrigerator() {}

    /**
     * Конструктор - создание объекта холодильника
     * @param power_consumption - потребление энергии холодильнтком
     * @param weight - вес холодильника
     * @param freezer_capacity - объем морозильника холодильника
     * @param overall_capacity - объем холодильника
     * @param height - высота холодильника
     * @param width - ширина холодильника
     * @param cost - стоимость холодильника
     */
    public Refrigerator(int power_consumption, int weight, int freezer_capacity, double overall_capacity, int height, int width, int cost) {
        this.power_consumption = power_consumption;
        this.weight = weight;
        this.freezer_capacity = freezer_capacity;
        this.overall_capacity = overall_capacity;
        this.height = height;
        this.width = width;
        this.cost = cost;
    }

    /**
     * Функция получения значения поля {@link Refrigerator#power_consumption}
     * @return возвращает потребление энергии холодильника
     */
    public int getPower_consumption() {
        return power_consumption;
    }

    /**
     * Процедура установления энергопотребления холодильника {@link Refrigerator#power_consumption}
     * @param power_consumption - энергопотребление
     */
    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    /**
     * Функция получения значения поля {@link Refrigerator#weight}
     * @return возвращает вес холодильника
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Процедура установления веса холодильника {@link Refrigerator#weight}
     * @param weight - вес
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Функция получения значения поля {@link Refrigerator#freezer_capacity}
     * @return возвращает объем морозильника холодильника
     */
    public int getFreezer_capacity() {
        return freezer_capacity;
    }

    /**
     * Процедура установления объема морозильника холодильника {@link Refrigerator#freezer_capacity}
     * @param freezer_capacity - объем морозильника
     */
    public void setFreezer_capacity(int freezer_capacity) {
        this.freezer_capacity = freezer_capacity;
    }

    /**
     * Функция получения значения поля {@link Refrigerator#overall_capacity}
     * @return возвращает объем холодильника
     */
    public double getOverall_capacity() {
        return overall_capacity;
    }

    /**
     * Процедура установления объема холодильника {@link Refrigerator#overall_capacity}
     * @param overall_capacity - объем
     */
    public void setOverall_capacity(double overall_capacity) {
        this.overall_capacity = overall_capacity;
    }

    /**
     * Функция получения значения поля {@link Refrigerator#height}
     * @return возвращает высоту холодильника
     */
    public int getHeight() {
        return height;
    }

    /**
     * Процедура установления высоты холодильника {@link Refrigerator#height}
     * @param height - высота
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Функция получения значения поля {@link Refrigerator#width}
     * @return возвращает ширину холодильника
     */
    public int getWidth() {
        return width;
    }

    /**
     * Процедура установления ширины холодильника {@link Refrigerator#width}
     * @param width - ширина
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Функция получения текстового описания холодильника
     * @return возвращает описание холодильника
     */
    @Override
    public String toString() {
        return "Refrigerator{" +
                "power_consumption=" + power_consumption +
                ", weight=" + weight +
                ", freezer_capacity=" + freezer_capacity +
                ", overall_capacity=" + overall_capacity +
                ", height=" + height +
                ", width=" + width +
                ", cost=" + cost +
                '}';
    }
}
