package by.vk.task1.entity;

/**
 * Класс планшетов, поля: <b>battery_capacity</b>, <b>display_inches</b>, <b>memory_rom</b>, <b>flash_memory_capacity</b>, <b>color</b>.
 * @author Константинович Владислав
 * @version 1.0
 */
public class TabletPC extends Appliance {
    /** Поле объема батареи планшета*/
    int battery_capacity;
    /** Поле размера экрана планшета*/
    int display_inches;
    /** Поле количества ОЗУ планшета*/
    int memory_rom;
    /** Поле количества ПЗУ планшета*/
    int flash_memory_capacity;
    /** Поле цвета планшета*/
    String color;

    /** Пустой конструктор для сериализации и десериализации */
    public TabletPC() { }

    /**
     * Конструктор - создание объекта планшета
     * @param battery_capacity - объем батареи планшета
     * @param display_inches - размер экрана планшета
     * @param memory_rom - количество ОЗУ планшета
     * @param flash_memory_capacity - количество ПЗУ планшета
     * @param color - цвет планшета
     * @param cost - стоимость планшета
     */
    public TabletPC(int battery_capacity, int display_inches, int memory_rom, int flash_memory_capacity, String color, int cost) {
        this.battery_capacity = battery_capacity;
        this.display_inches = display_inches;
        this.memory_rom = memory_rom;
        this.flash_memory_capacity = flash_memory_capacity;
        this.color = color;
        this.cost = cost;
    }

    /**
     * Функция получения значения поля {@link TabletPC#battery_capacity}
     * @return возвращает объем батареи планшета
     */
    public int getBattery_capacity() {
        return battery_capacity;
    }

    /**
     * Процедура установления объема батареи планшета {@link TabletPC#battery_capacity}
     * @param battery_capacity - объем батареи
     */
    public void setBattery_capacity(int battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    /**
     * Функция получения значения поля {@link TabletPC#flash_memory_capacity}
     * @return возвращает размер ПЗУ планшета
     */
    public int getFlash_memory_capacity() {
        return flash_memory_capacity;
    }

    /**
     * Процедура установления количества ПЗУ планшета {@link TabletPC#flash_memory_capacity}
     * @param flash_memory_capacity - количество ПЗУ
     */
    public void setFlash_memory_capacity(int flash_memory_capacity) {
        this.flash_memory_capacity = flash_memory_capacity;
    }

    /**
     * Функция получения значения поля {@link TabletPC#display_inches}
     * @return возвращает размер экрана планшета
     */
    public int getDisplay_inches() {
        return display_inches;
    }

    /**
     * Процедура установления размера экрана планшета {@link TabletPC#display_inches}
     * @param display_inches - размер экрана
     */
    public void setDisplay_inches(int display_inches) {
        this.display_inches = display_inches;
    }

    /**
     * Функция получения значения поля {@link TabletPC#memory_rom}
     * @return возвращает размер ПЗУ планшета
     */
    public int getMemory_rom() {
        return memory_rom;
    }

    /**
     * Процедура установления размера ОЗУ планшета {@link TabletPC#memory_rom}
     * @param memory_rom - размер ОЗУ
     */
    public void setMemory_rom(int memory_rom) {
        this.memory_rom = memory_rom;
    }

    /**
     * Функция получения значения поля {@link TabletPC#color}
     * @return возвращает цвет планшета
     */
    public String getColor() {
        return color;
    }

    /**
     * Процедура установления цвета планшета {@link TabletPC#color}
     * @param color - цвет
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Функция получения текстового описания планшета
     * @return возвращает описание планшета
     */
    @Override
    public String toString() {
        return "TabletPC{" +
                "battery_capacity=" + battery_capacity +
                ", display_inches=" + display_inches +
                ", memory_rom=" + memory_rom +
                ", flash_memory_capacity=" + flash_memory_capacity +
                ", color='" + color + '\'' +
                ", cost='" + cost +
                '}';
    }
}
