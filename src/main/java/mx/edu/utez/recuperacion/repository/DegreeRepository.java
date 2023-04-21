package mx.edu.utez.recuperacion.repository;

import mx.edu.utez.recuperacion.model.Degree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DegreeRepository extends JpaRepository<Degree, Long> {
}
