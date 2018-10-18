package ru.voronezhtsev.cars;

import ru.voronezhtsev.cars.Car;

/**
 * Внедорожник
 *
 * @author Воронежцев Игорь on 18.10..2018
 */
public class Jeep extends Car {
    /**
     * Конструктор внедорожника
     * @param model марка + модель
     */
    public Jeep(String model) {
        super(model);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getType() {
        return Car.JEEP;
    }
}
