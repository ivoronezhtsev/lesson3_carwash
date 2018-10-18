package ru.voronezhtsev.cars;

/**
 * Легковой автомобиль
 *  @author Воронежцев Игорь on 18.10.2018
 */
public class PassengerCar extends Car {
    /**
     * Конструктор легкового автомобиля
     * @param name марка + модель
     */
    public PassengerCar(String name) {
        super(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getType() {
        return Car.PASSENGER_CAR;
    }
}
