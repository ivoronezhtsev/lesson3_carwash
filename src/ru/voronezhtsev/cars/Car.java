package ru.voronezhtsev.cars;

/**
 * Абстрактный класс автомобиля, как сущности для мойки
 *
 * @author Воронежцев Игорь on 18.10.2018
 */
public abstract class Car {
    public static final int PASSENGER_CAR = 1;
    public static final int MINIVAN = 2;
    public static final int JEEP = 3;

    private String mName;

    /**
     * Конструктор класса
     * @param name Марка модель, все что идентифицирует автомобиль
     */
    public Car(String name) {
        mName = name;
    }

    /**
     * Марка + модель или любое друго обозначение автомобиля
     * @return марка + модель или любое друго обозначение автомобиля
     */
    public String getName() {
        return mName;
    }

    /**
     * Вернуть тип автомобиля (Легковой, минивэн, внедорожник)
     * @return тип автомобиля (Легковой, минивэн, внедорожник)
     */
    public abstract int getType();
}
