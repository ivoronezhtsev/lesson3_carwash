package ru.voronezhtsev;

import ru.voronezhtsev.cars.Car;

import java.util.Locale;

/**
 * Автоматическая станция мойки автомобилей
 *
 * @author Воронежцев Игорь on 18.10.2018
 */
public class CarwashStation {

    private static final String WASH_MESSAGE = "Мойка автомобиля...Автомобиль модель [%s] помыт";
    private static final String WATER = "Вода";
    private static final int WATER_TANK_CAPACITY = 500;
    private static final String SOUP = "Автошампунь Sonax";
    private static final int SOUP_TANK_CAPACITY = 200;

    private static final int CAR_WATER_VOLUME = 80;
    private static final int CAR_SOUP_VOLUME = 20;
    private static final int MINIVAN_WATER_VOLUME = 160;
    private static final int MINIVAN_SOUP_VOLUME = 40;
    private static final int JEEP_WATER_VOLUME = 200;
    private static final int JEEP_SOUP_VOLUME = 60;

    private Tank mWaterTank = new Tank(WATER, WATER_TANK_CAPACITY);
    private Tank mSoupTank = new Tank(SOUP, SOUP_TANK_CAPACITY);

    public void wash(Car car) {
        switch (car.getType()) {
            case Car.PASSENGER_CAR: {
                while(true) {
                    if (mWaterTank.getVolume() >= CAR_WATER_VOLUME && mSoupTank.getVolume() >= CAR_SOUP_VOLUME) {
                        mWaterTank.pour(CAR_WATER_VOLUME);
                        mSoupTank.pour(CAR_SOUP_VOLUME);
                        System.out.println(String.format(Locale.US, WASH_MESSAGE, car.getName()));
                        break;
                    } else {
                        fillTanks();
                    }
                }
            }
            case Car.MINIVAN: {
                while (true) {
                    if (mWaterTank.getVolume() >= MINIVAN_WATER_VOLUME && mSoupTank.getVolume() >= MINIVAN_SOUP_VOLUME) {
                        mWaterTank.pour(MINIVAN_WATER_VOLUME);
                        mSoupTank.pour(MINIVAN_SOUP_VOLUME);
                        System.out.println(String.format(Locale.US, WASH_MESSAGE, car.getName()));
                        break;
                    } else {
                        fillTanks();
                    }
                }
            }
            case Car.JEEP: {
                while(true) {
                    if (mWaterTank.getVolume() >= JEEP_WATER_VOLUME && mSoupTank.getVolume() >= JEEP_SOUP_VOLUME) {
                        mWaterTank.pour(JEEP_WATER_VOLUME);
                        mSoupTank.pour(JEEP_SOUP_VOLUME);
                        System.out.println(String.format(Locale.US, WASH_MESSAGE, car.getName()));
                        break;
                    } else {
                        fillTanks();
                    }
                }
            }
        }
    }

    private void fillTanks() {
        mSoupTank.fill(mSoupTank.getCapacity() - mSoupTank.getVolume());
        mWaterTank.fill(mWaterTank.getCapacity() - mWaterTank.getVolume());
    }
}
