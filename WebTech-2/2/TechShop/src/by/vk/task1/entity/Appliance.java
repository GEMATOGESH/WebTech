package by.vk.task1.entity;

/**
 * Класс товара, единственное поле: <b>cost</b>.
 * @author Константинович Владислав
 * @version 1.0
 */
public class Appliance {
    /** Поле цены */
    int cost;

    /** Пустой конструктор для сериализации и десериализации */
    public Appliance() {}

    /**
     * Функция получения значения поля {@link Appliance#cost}
     * @return возвращает цену товара
     */
    public int getCost() {
        return cost;
    }

    /**
     * Процедура установления цены товару {@link Appliance#cost}
     * @param cost - цена товара
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

}
