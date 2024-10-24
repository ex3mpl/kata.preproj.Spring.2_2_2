package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model,
                            @RequestParam(value = "count", defaultValue = "5") int count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1L, "Lada", 2190));
        carList.add(new Car(2L, "Mazda", 3));
        carList.add(new Car(3L, "Motoblock", 228));
        carList.add(new Car(4L, "TurboMotoblock", 1337));
        carList.add(new Car(5L, "LigurianProMaxTurboMiniMaxi", 1));

        model.addAttribute("cars", carService.count(carList, count));
        return "cars";
    }
}