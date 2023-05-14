
package com.portfolioBobadillaWanda.mgb.Security.Repository;

import com.portfolioBobadillaWanda.mgb.Security.Entity.Rol;
import com.portfolioBobadillaWanda.mgb.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository  extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
