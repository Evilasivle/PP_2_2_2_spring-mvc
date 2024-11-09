package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void initCars();
    List<Car> getCars(Integer count);
}
