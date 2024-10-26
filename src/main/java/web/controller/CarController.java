package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

@Controller
public class CarController {

    private final Car car;
    private CarService carService;

    @Autowired
    public CarController(CarService carService, Car car) {
        this.carService = carService;
        this.car = car;
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model,
                            @RequestParam(value = "count", defaultValue = "5") int count) {
        model.addAttribute("cars", carService.count(carService.createCars(), count));
        return "cars";
    }
}
