package ru.voronezhtsev.cars;

import ru.voronezhtsev.cars.Car;

/**
 * Минивэн
 *
 * @author Воронежцев Игорь on 18.10.2018
 */
public class Minivan extends Car {
    /**
     * Конструктор минивэна
     * @param model марка + модель
     */
    public Minivan(String model) {
        super(model);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getType() {
        return Car.MINIVAN;
    }
}
