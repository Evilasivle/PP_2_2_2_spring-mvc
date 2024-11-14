package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    @Autowired
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public void initCars() {
        cars.add(new Car("BMW", "Super", 2022));
        cars.add(new Car("Audi", "Sport", 2023));
        cars.add(new Car("Honda", "Ford", 2024));
        cars.add(new Car("Mercedes", "Bentz", 2011));
        cars.add(new Car("Lada", "Kalina", 2005));
    }

    @Override
    public List<Car> getCars(Integer count){
        if (count != null) {
            if (count >= cars.size() || count <= 0) {
                return cars;
            } else {
                return cars.subList(0, count);
            }
        } else return cars;
    }
}
