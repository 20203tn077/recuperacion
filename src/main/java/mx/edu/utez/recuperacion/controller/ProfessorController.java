package mx.edu.utez.recuperacion.controller;

import mx.edu.utez.recuperacion.service.DegreeService;
import mx.edu.utez.recuperacion.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("profesor")
public class ProfessorController {
    @Autowired
    ProfessorService professorService;
    @Autowired
    DegreeService degreeService;

    // Consulta
    @GetMapping("listar")
    public String findAll() {
        return "";
    }

    // Registro
    @GetMapping("registrar")
    public String showRegister() {
        return "";
    }
    @PostMapping("register")
    public String register() {
        return "";
    }

    // Actualización
    @GetMapping("actualizar")
    public String showUpdate() {
        return "";
    }
    @PostMapping("update")
    public String update() {
        return "";
    }

    // Eliminación
    @PostMapping("delete")
    public String delete() {
        return "";
    }
}
