package mx.edu.utez.recuperacion.service;

import mx.edu.utez.recuperacion.model.Degree;
import mx.edu.utez.recuperacion.repository.DegreeRepository;
import mx.edu.utez.recuperacion.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DegreeServiceImpl implements DegreeService {
    @Autowired
    private DegreeRepository degreeRepository;

    @Override
    public List<Degree> findAll() {
        return degreeRepository.findAll();
    }
}
