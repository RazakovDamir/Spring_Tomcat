package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsService {
    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Tesla Model S", "Black", 1));
        cars.add(new Car("Tesla Model X", "White", 2));
        cars.add(new Car("Tesla Model E", "Red", 3));
        cars.add(new Car("BMW X5M", "Moonlight Grey", 4));
        cars.add(new Car("Porsche 911 Turbo S", "Corsa Red", 5));
    }

    public static List<Car> getAll(int count) {
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(cars.get(i));
        }
        return result;
    }
}
