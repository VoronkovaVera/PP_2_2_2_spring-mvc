package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Lada", 2233, 1999));
        cars.add(new Car("Belaz", 88554, 2013));
        cars.add(new Car("Volga", 987412, 1979));
        cars.add(new Car("Uaz", 852, 2020));
        cars.add(new Car("Oka", 1, 2017));
    }

    public List<Car> getCountList(int count) {
        return cars.stream().limit(Math.min(count, 5)).toList();
    }
}
