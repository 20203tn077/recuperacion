package mx.edu.utez.recuperacion.service;

import mx.edu.utez.recuperacion.model.Car;
import mx.edu.utez.recuperacion.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }
}
