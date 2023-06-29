
package com.prueba1.controllers;
import com.prueba1.entities.Estudiantes;
import com.prueba1.service.IServiceP;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class Controllers {
     private final IServiceP estudianteService;

    public Controllers(IServiceP Service) {
        this.estudianteService = Service;
    }

    @GetMapping("/Estudiantes")
    public String index(Model model) {

        model.addAttribute("Estudiantes", new Estudiantes());
        model.addAttribute("estudiantes", this.estudianteService.getAllEstudiantes());
        return "Estudiantes";
    }

    @PostMapping("Estudiantes/save")
    public String save(@ModelAttribute("estudiantes") Estudiantes estudiantes) {
        this.estudianteService.save(estudiantes);
        return "redirect:/Estudiantes";
    }

    @PostMapping("Estudiantes/delete")
    public ResponseEntity<String> delete(@RequestBody Estudiantes estudiantes) {
        this.estudianteService.delete(estudiantes);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
