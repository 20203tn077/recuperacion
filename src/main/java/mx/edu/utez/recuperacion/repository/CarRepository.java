package mx.edu.utez.recuperacion.repository;

import mx.edu.utez.recuperacion.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
