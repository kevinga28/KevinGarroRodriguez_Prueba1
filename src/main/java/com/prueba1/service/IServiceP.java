
package com.prueba1.service;
import com.prueba1.entities.Estudiantes;
import java.util.List;
public interface IServiceP {
    List<Estudiantes> getAllEstudiantes();

    void save(Estudiantes estudiante);

    void delete(Estudiantes estudiante);
}


