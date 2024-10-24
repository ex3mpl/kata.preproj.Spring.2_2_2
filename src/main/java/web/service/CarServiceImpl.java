package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Component
public class CarServiceImpl implements CarService {
    public List<Car> count(List<Car> cars,
                           @RequestParam(value = "count", defaultValue = "5") int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
