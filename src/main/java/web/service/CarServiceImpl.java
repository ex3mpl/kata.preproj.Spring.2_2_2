package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class CarServiceImpl implements CarService {

    public List<Car> createCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1L, "Lada", 2190));
        cars.add(new Car(2L, "Mazda", 3));
        cars.add(new Car(3L, "Motoblock", 228));
        cars.add(new Car(4L, "TurboMotoblock", 1337));
        cars.add(new Car(5L, "LigurianProMaxTurboMiniMaxi", 1));
        return cars;
    }

    public List<Car> count(List<Car> cars, int count) {
        return cars.stream().limit(count).toList();
    }
}
