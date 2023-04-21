package mx.edu.utez.recuperacion.service;

import mx.edu.utez.recuperacion.model.Professor;
import mx.edu.utez.recuperacion.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorServiceImpl implements ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public List<Professor> findAll() {
        return professorRepository.findAll();
    }

    @Override
    public List<Professor> findById(long id) {
        return findById(id);
    }

    @Override
    public boolean save(Professor professor) {
        try {
            professorRepository.save(professor);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(Professor professor) {
        try {
            professorRepository.save(professor);
            return true;
        } catch (Exception e) {
            return false;
        }


    }   @Override
    public boolean delete(long id) {
        try {
            professorRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
