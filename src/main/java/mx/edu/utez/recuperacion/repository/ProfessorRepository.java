package mx.edu.utez.recuperacion.repository;

import mx.edu.utez.recuperacion.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
