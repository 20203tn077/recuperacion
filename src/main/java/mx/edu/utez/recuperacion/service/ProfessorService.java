package mx.edu.utez.recuperacion.service;

import mx.edu.utez.recuperacion.model.Professor;

import java.util.List;

public interface ProfessorService {
    List<Professor> findAll();
    List<Professor> findById(long id);
    boolean save(Professor professor);
    boolean update(Professor professor);
    boolean delete(long id);
}
