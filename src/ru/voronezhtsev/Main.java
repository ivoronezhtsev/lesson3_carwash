package ru.voronezhtsev;

import ru.voronezhtsev.cars.Jeep;
import ru.voronezhtsev.cars.Minivan;
import ru.voronezhtsev.cars.PassengerCar;

public class Main {

    public static void main(String[] args) {
	    CarwashStation carwashStation = new CarwashStation();
	    carwashStation.wash(new PassengerCar("Ваз 2001"));
	    carwashStation.wash(new Jeep("Jeep Wrangler"));
	    carwashStation.wash(new Minivan("Toyota Alphard"));
    }
}
