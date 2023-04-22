package mx.edu.utez.recuperacion.controller;

import mx.edu.utez.recuperacion.model.Employee;
import mx.edu.utez.recuperacion.service.CarService;
import mx.edu.utez.recuperacion.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("empleados")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    CarService carService;

    // Consulta general
    @GetMapping("")
    public String findAll(Model model) {
        System.out.println(model.getAttribute("successMessage"));
        model.addAttribute("employees", employeeService.findAll());
        return "/views/employee_list";
    }

    // Consulta específica
    @GetMapping("visualizar/{id}")
    public String findById(Model model, @PathVariable long id) {
        model.addAttribute("employee", employeeService.findById(id));
        return "views/employee_view";
    }

    // Registro
    @GetMapping("registrar")
    public String showRegister(Model model) {
        if (model.getAttribute("employee") == null) model.addAttribute("employee", new Employee());
        model.addAttribute("cars", carService.findAll());
        return "views/employee_register";
    }
    @PostMapping("register")
    public String register(Employee employee, RedirectAttributes attributes) {
        if (!employeeService.save(employee)) {
            attributes.addFlashAttribute("errorMessage", "No se pudo registrar :(");
            attributes.addFlashAttribute("employee", employee);
            return "redirect:/empleados/registrar";
        }
        attributes.addFlashAttribute("successMessage", "Registro exitoso :)");
        return "redirect:/empleados";
    }

    // Actualización
    @GetMapping("actualizar/{id}")
    public String showUpdate(Model model, @PathVariable long id) {
        if (model.getAttribute("employee") == null) model.addAttribute("employee", employeeService.findById(id));
        model.addAttribute("cars", carService.findAll());
        return "views/employee_update";
    }
    @PostMapping("update/{id}")
    public String update(Employee employee, RedirectAttributes attributes, @PathVariable long id) {
        employee.setId(id);
        if (!employeeService.save(employee)) {
            attributes.addFlashAttribute("errorMessage", "No se pudo actualizar :(");
            attributes.addFlashAttribute("employee", employee);
            return "redirect:/empleados/actualizar" + id;
        }
        attributes.addFlashAttribute("successMessage", "Actualización exitosa :)");
        return "redirect:/empleados";
    }

    // Eliminación
    @GetMapping("delete/{id}")
    public String delete(Model model, @PathVariable long id, RedirectAttributes attributes) {
        if (!employeeService.delete(id)) attributes.addFlashAttribute("errorMessage", "No se pudo eliminar :(");
        else attributes.addFlashAttribute("successMessage", "Eliminación exitosa :)");
        return "redirect:/empleados";
    }
}
