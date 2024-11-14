package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String showCars(Integer count, Model model) {
        List<Car> cars = carService.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }


}
