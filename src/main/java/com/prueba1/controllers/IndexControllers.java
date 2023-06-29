
package com.prueba1.controllers;
import com.prueba1.service.IServiceP;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexControllers {
      private final IServiceP estudianteService;

    public IndexControllers(IServiceP Service) {
        this.estudianteService = Service;
    }

    @GetMapping("/")
    public String index(Model model) {
        var estudiantes = this.estudianteService.getAllEstudiantes();
        model.addAttribute("estudiantes", estudiantes);
        return "index";
    }
    
}
