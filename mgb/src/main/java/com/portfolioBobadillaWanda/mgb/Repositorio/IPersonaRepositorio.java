
package com.portfolioBobadillaWanda.mgb.Repositorio;

import com.portfolioBobadillaWanda.mgb.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepositorio extends JpaRepository<Persona,Long>{
    
}
