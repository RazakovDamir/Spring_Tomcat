package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsService;

import java.util.List;

@Controller
public class CarsController {
    @GetMapping("/cars")
    public String carsPage(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars;
        if (count <= 0 || count > 5) {
            cars = CarsService.getAll(5);
        } else {
            cars = CarsService.getAll(count);
        }
        model.addAttribute("result", cars);
        return "cars";
    }
}