package mx.edu.utez.recuperacion.controller;

import mx.edu.utez.recuperacion.service.DegreeService;
import mx.edu.utez.recuperacion.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String findAll(Model model) {
        model.addAttribute("professors", professorService);
        return "/views/";
    }

    // Registro
    @GetMapping("registrar")
    public String showRegister(Model model) {
        return "";
    }
    @PostMapping("register")
    public String register(Model model) {
        return "";
    }

    // Actualización
    @GetMapping("actualizar")
    public String showUpdate(Model model) {
        return "";
    }
    @PostMapping("update")
    public String update(Model model) {
        return "";
    }

    // Eliminación
    @PostMapping("delete")
    public String delete(Model model) {
        return "";
    }
}
