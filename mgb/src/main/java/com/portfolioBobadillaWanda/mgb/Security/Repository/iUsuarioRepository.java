
package com.portfolioBobadillaWanda.mgb.Security.Repository;

import com.portfolioBobadillaWanda.mgb.Security.Entity.Rol;
import com.portfolioBobadillaWanda.mgb.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Rol, Integer>{
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);

    public void save(Usuario usuario);
}
