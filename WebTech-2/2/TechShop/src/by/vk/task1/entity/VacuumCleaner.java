package by.vk.task1.entity;

/**
 * Класс пылесосов, поля: <b>power_consumption</b>, <b>filter_type</b>, <b>bag_type</b>, <b>wand_type</b>, <b>motor_speed_regulation</b>, <b>cleaning_width</b>.
 * @author Константинович Владислав
 * @version 1.0
 */
public class VacuumCleaner extends Appliance {
    /** Поле потребления энергии пылесосом*/
    int power_consumption;
    /** Поле типа фильтра пылесоса*/
    char filter_type;
    /** Поле типа емкости пылесоса*/
    String bag_type;
    /** Поле типа трубы пылесоса*/
    String wand_type;
    /** Поле скорости мотора пылесоса*/
    int motor_speed_regulation;
    /** Поле ширины чистки пылесоса*/
    int cleaning_width;

    /** Пустой конструктор для сериализации и десериализации */
    public VacuumCleaner() {}

    /**
     * Конструктор - создание объекта пылесоса
     * @param power_consumption - потребление энергии пылесоса
     * @param filter_type - тип фильтра пылесоса
     * @param bag_type - тип емкости пылесоса
     * @param wand_type - тип трубы пылесоса
     * @param motor_speed_regulation - скорость мотора пылесоса
     * @param cleaning_width - ширина чистки пылесоса
     * @param cost - стоимость планшета
     */
    public VacuumCleaner(int power_consumption, char filter_type, String bag_type, String wand_type, int motor_speed_regulation, int cleaning_width, int cost){
        this.power_consumption = power_consumption;
        this.filter_type = filter_type;
        this.bag_type = bag_type;
        this.wand_type = wand_type;
        this.motor_speed_regulation = motor_speed_regulation;
        this.cleaning_width = cleaning_width;
        this.cost = cost;
    }

    /**
     * Функция получения значения поля {@link VacuumCleaner#power_consumption}
     * @return возвращает потребление энергии пылесосом
     */
    public int getPower_consumption() {
        return power_consumption;
    }

    /**
     * Процедура установления потребления энергии пылесоса {@link VacuumCleaner#power_consumption}
     * @param power_consumption - потребление энергии
     */
    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    /**
     * Функция получения значения поля {@link VacuumCleaner#filter_type}
     * @return возвращает тип фильтра пылесоса
     */
    public char getFilter_type() {
        return filter_type;
    }

    /**
     * Процедура установления типа фильтра пылесоса {@link VacuumCleaner#filter_type}
     * @param filter_type - тип фильтра
     */
    public void setFilter_type(char filter_type) {
        this.filter_type = filter_type;
    }

    /**
     * Функция получения значения поля {@link VacuumCleaner#bag_type}
     * @return возвращает тип емкости пылесоса
     */
    public String getBag_type() {
        return bag_type;
    }

    /**
     * Процедура установления типа емкости пылесоса {@link VacuumCleaner#bag_type}
     * @param bag_type - тип емкости
     */
    public void setBag_type(String bag_type) {
        this.bag_type = bag_type;
    }

    /**
     * Функция получения значения поля {@link VacuumCleaner#wand_type}
     * @return возвращает тип трубы пылесоса
     */
    public String getWand_type() {
        return wand_type;
    }

    /**
     * Процедура установления типа трубы пылесоса {@link VacuumCleaner#wand_type}
     * @param wand_type - тип трубы
     */
    public void setWand_type(String wand_type) {
        this.wand_type = wand_type;
    }

    /**
     * Функция получения значения поля {@link VacuumCleaner#motor_speed_regulation}
     * @return возвращает скорость мотора пылесоса
     */
    public int getMotor_speed_regulation() {
        return motor_speed_regulation;
    }

    /**
     * Процедура установления скорости мотора пылесоса {@link VacuumCleaner#motor_speed_regulation}
     * @param motor_speed_regulation - скорость мотора
     */
    public void setMotor_speed_regulation(int motor_speed_regulation) {
        this.motor_speed_regulation = motor_speed_regulation;
    }

    /**
     * Функция получения значения поля {@link VacuumCleaner#cleaning_width}
     * @return возвращает ширину чистки пылесоса
     */
    public int getCleaning_width() {
        return cleaning_width;
    }

    /**
     * Процедура установления ширины чистки пылесоса {@link VacuumCleaner#cleaning_width}
     * @param cleaning_width - ширина чистки
     */
    public void setCleaning_width(int cleaning_width) {
        this.cleaning_width = cleaning_width;
    }

    /**
     * Функция получения текстового описания пылесоса
     * @return возвращает описание пылесоса
     */
    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "power_consumption=" + power_consumption +
                ", filter_type=" + filter_type +
                ", bag_type='" + bag_type + '\'' +
                ", wand_type='" + wand_type + '\'' +
                ", motor_speed_regulation=" + motor_speed_regulation +
                ", cleaning_width=" + cleaning_width +
                ", cost=" + cost +
                '}';
    }
}
