package by.vk.task1.entity;

/**
 * Класс ноутбук, поля: <b>battery_capacity</b>, <b>OS</b>, <b>memory_rom</b>, <b>system_memory</b>, <b>CPU</b>, <b>display_inchs</b>.
 * @author Константинович Владислав
 * @version 1.0
 */
public class Laptop extends Appliance {
    /** Поле объема батареи ноутбука*/
    double battery_capacity;
    /** Поле названия ОС ноутбука*/
    String OS;
    /** Поле размера ОЗУ ноутбука*/
    int memory_rom;
    /** Поле размера ПЗУ ноутбука*/
    int system_memory;
    /** Поле герцовки процессора*/
    double CPU;
    /** Поле размера экрана*/
    int display_inchs;

    /** Пустой конструктор для сериализации и десериализации */
    public Laptop() {}

    /**
     * Конструктор - создание объекта ноутбука
     * @param battery_capacity - потребление энергии ноутбука
     * @param OS - название ОС ноутбука
     * @param memory_rom - размер ОЗУ ноутбука
     * @param system_memory - размер ПЗУ ноутбука
     * @param CPU - герцовка процессора
     * @param display_inchs - размер экрана ноутбука
     * @param cost - стоимость ноутбука
     */
    public Laptop(double battery_capacity, String OS, int memory_rom, int system_memory, double CPU, int display_inchs, int cost) {
        this.battery_capacity = battery_capacity;
        this.OS = OS;
        this.memory_rom = memory_rom;
        this.system_memory = system_memory;
        this.CPU = CPU;
        this.display_inchs = display_inchs;
        this.cost = cost;
    }

    /**
     * Функция получения значения поля {@link Laptop#battery_capacity}
     * @return возвращает объем батареи ноутбука
     */
    public double getBattery_capacity() {
        return battery_capacity;
    }

    /**
     * Процедура установления объема батаери ноутбука {@link Laptop#battery_capacity}
     * @param battery_capacity - объем батареи
     */
    public void setBattery_capacity(double battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    /**
     * Функция получения значения поля {@link Laptop#OS}
     * @return возвращает название ОС
     */
    public String getOS() {
        return OS;
    }

    /**
     * Процедура установления названия ОС {@link Laptop#OS}
     * @param OS - название ОС
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Функция получения значения поля {@link Laptop#memory_rom}
     * @return возвращает размер ОЗУ
     */
    public int getMemory_rom() {
        return memory_rom;
    }

    /**
     * Процедура установления размера ОЗУ {@link Laptop#memory_rom}
     * @param memory_rom - размер ОЗУ
     */
    public void setMemory_rom(int memory_rom) {
        this.memory_rom = memory_rom;
    }

    /**
     * Функция получения значения поля {@link Laptop#system_memory}
     * @return возвращает размер ПЗУ
     */
    public int getSystem_memory() {
        return system_memory;
    }

    /**
     * Процедура установления размера ПЗУ {@link Laptop#system_memory}
     * @param system_memory - размер ПЗУ
     */
    public void setSystem_memory(int system_memory) {
        this.system_memory = system_memory;
    }

    /**
     * Функция получения значения поля {@link Laptop#CPU}
     * @return возвращает герцовку ЦП
     */
    public double getCPU() {
        return CPU;
    }

    /**
     * Процедура установления герцовки ЦП {@link Laptop#CPU}
     * @param CPU - герцовка ЦП
     */
    public void setCPU(double CPU) {
        this.CPU = CPU;
    }

    /**
     * Функция получения значения поля {@link Laptop#display_inchs}
     * @return возвращает размер экрана
     */
    public int getDisplay_inchs() {
        return display_inchs;
    }

    /**
     * Процедура установления размера экрана {@link Laptop#display_inchs}
     * @param display_inchs - размер экрана
     */
    public void setDisplay_inchs(int display_inchs) {
        this.display_inchs = display_inchs;
    }

    /**
     * Функция получения текстового описания ноутбука
     * @return возвращает описание ноутбука
     */
    @Override
    public String toString() {
        return "Laptop{" +
                "battery_capacity=" + battery_capacity +
                ", OS='" + OS + '\'' +
                ", memory_rom=" + memory_rom +
                ", system_memory=" + system_memory +
                ", CPU=" + CPU +
                ", display_inchs=" + display_inchs +
                ", cost=" + cost +
                '}';
    }
}
