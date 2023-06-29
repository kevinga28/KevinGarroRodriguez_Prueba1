
package com.prueba1.service.impl;

import com.prueba1.db.IRepository;
import com.prueba1.entities.Estudiantes;
import com.prueba1.service.IServiceP;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceP  implements IServiceP{
    
    private final IRepository Repository;

    public ServiceP(IRepository Repository) {
        this.Repository = Repository;
    }

    public List<Estudiantes> getAllEstudiantes() {
        return (List<Estudiantes>) this.Repository.findAll();
    }

    public void save(Estudiantes estudiante) {
        estudiante.setActivo(true);
        this.Repository.save(estudiante);
    }

    public void delete(Estudiantes estudiante) {
        this.Repository.delete(estudiante);
    }
    
}
