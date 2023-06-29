
package com.prueba1.db;

import com.prueba1.entities.Estudiantes;
import org.springframework.data.repository.CrudRepository;
public interface IRepository extends CrudRepository<Estudiantes,Integer>{
    
}
